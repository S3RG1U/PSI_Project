package transfer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import psi.Entities.Document;
import psi.Entities.MijlocFix;
import psi.Entities.Transfer;
import psi.Entities.LinieDocument;


public class transferForm {


	private transferFormData formData = new transferFormData();

	
	public transferFormData getFormData() {
		return formData;
	}

	public void setFormData(transferFormData formData) {
		this.formData = formData;
	}

	public void cautaDocumentTransfer(int id) {
//		formData.setCodDocument(null);
//		formData.setDataOperare(null);
//		formData.setListGestiuneSursa(formData.getListGestiuneSursa());
//		formData.setListGestiuneDestinatie(formData.getListGestiuneDestinatie());
		Document idDocument = new Document();
		idDocument.setCodDocument(id);
		String query = "SELECT * from document INNER JOIN liniedocument ON document.id=liniedocument.document_id INNER JOIN mijlocfix ON liniedocument.mijlocfix_id=mijlocfix.id WHERE document.id="+idDocument;	
        ResultSet rezultate=pst1.executeQuery(query);				
		
	}
	
	
	

	public void adaugaLinieTransfer() {
		
		if (this.formData.getGestiuneSelectataDestinatie() == null)
			throw new RuntimeException("Selectati mai intai o gestiune destinatie!!!!");
		
		LinieDocument linie = new LinieDocument();
		linie.setMijlocfix(this.formData.getListaMijlocFix().get(0));
		this.formData.getDocumentTransfer().addLinieDocument(linie);
		
	}
	
	public void adaugaMijlocFix() {

		if (this.formData.getDocumentTransfer() == null)
			throw new RuntimeException("Adaugati un mijloc fix!");
		MijlocFix m = new MijlocFix();
		m.setDenumireMijloc(this.formData.getListaMijlocFix());
		
		this.formData.getDocumentTransfer().addMijlocFix(m);
		
	}

	public void modificaLinieMijlocFix() {
		
		
	}
	
	public void stergeLinieMijlocFix() {
		MijlocFix mijlocfix = formData.getMijlocFixSelectat();
		formData.getMasterRepo().beginTransaction();
		formData.getMasterRepo().delete(mijlocfix);
		formData.getMasterRepo().commitTransaction();
		formData.setListaMijlocFix(formData.getListaMijlocFix());
	}
	
	public void salveazaModificariTransfer() {
		this.getFormData().getDocRepo().beginTransaction();
		this.getFormData().getDocRepo().saveDocument(this.getFormData().getdocTransfer());
		this.getFormData().getDocRepo().commitTransaction();

	}

}
