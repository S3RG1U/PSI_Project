package transfer;

import psi.Entities.Document;
import psi.Entities.LinieDocument;
import psi.Entities.Transfer;


public class transferForm {


	private transferFormData formData = new transferFormData();

	
	public transferFormData getFormData() {
		return formData;
	}

	public void setFormData(transferFormData formData) {
		this.formData = formData;
	}

	
	public void documentNou() {


		Document doc = new Document();
		this.formData.setdocTransfer(doc);
		// ar fi perfect suficient atat, daca nu am avea si date predefinite

		// se adauga eventuale date predefinite - din nou, folosim constante!!!
		// daca nu avem o sursa de date configurabila de catre utilizator
		// (fisiere text sau tabele in BD)
		if (this.formData.getOperatieSelectata().equals(
				AchizitiiFormData.ACHIZITIE_CU_FACTURA))
			doc.setTipDocument(FACTURA);
		else if (this.formData.getOperatieSelectata().equals(
				AchizitiiFormData.ACHIZITIE_CU_AVIZ))
			doc.setTipDocument(AVIZ);
		else if (this.formData.getOperatieSelectata().equals(
				AchizitiiFormData.STORNARE))
			doc.setTipDocument(STORNARE);
		else
			doc.setTipDocument(NECUNOSCUT);// intotdeauna trebuie sa existe si
		// un default absolut

		doc.setDataOperare(new java.util.Date());
		// Este bine sa stabilim si o valoare default pentru toate relatiile
		// ManyToOne
		// Stabilim primul furnizor din lista ca furnizor implicit.
		doc.setFurnizor(this.formData.getFurnizorSelectat());
	}

	/**
	 * Implementeaza comportamentul pentru butonul Adaugare din tab-ul Receptii.
	 * Genereaza un nou document receptie pentru a fi prezentat in tabelul 10
	 */
	public void adaugaReceptie() {
		// verificam existenta unul document curent si generam o eroare daca nu
		// exista
		if (this.formData.getDocumentCurent() == null)
			throw new RuntimeException("Selectati mai intai un document!!!!");
		Receptie r = new Receptie();
		r.setGestiune(this.formData.getListaGestiuni().get(0));// implicit,
																// prima
																// gestiune din
																// lista
		this.formData.setReceptieSelectata(r);
		this.formData.getDocumentCurent().addReceptie(r);
		// utilizatorul va selecta gestiunea ulterior prin intermediul
		// obiectelor grafice
	}

	public void adaugaLinieReceptie() {
		// verifica existenta unei receptii selectate
		if (this.formData.getReceptieSelectata() == null)
			throw new RuntimeException("Selectati mai intai o receptie!!!!");
		LinieDocument linie = new LinieDocument();
		linie.setMaterial(this.formData.getListaMateriale().get(0));// implicit,
																	// primul
																	// din lista
		// adaugam noua linie in lista receptiei selectate
		this.formData.getReceptieSelectata().addLinieDocument(linie);
		// utilizatorul va folosi apoi obiectele grafice pentru a adauga date pe
		// noua linie
	}

	/**
	 * comite modificarile din formular in baza de date
	 */
	public void salveazaModificariDocument() {
		this.getFormData().getDocRepo().beginTransaction();
		this.getFormData().getDocRepo().saveDocument(this.getFormData().getDocumentCurent());
		this.getFormData().getDocRepo().commitTransaction();

	}

}
