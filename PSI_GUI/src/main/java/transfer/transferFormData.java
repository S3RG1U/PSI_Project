package transfer;

import java.util.LinkedList;
import java.util.List;

import psi.Entities.MijlocFix;
import psi.Entities.Document;
import psi.Entities.Gestiune;
import psi.Entities.Transfer;

import psi.model.repository.documentRepository;

import psi.model.repository.masterRepository;


public class transferFormData {

	// --------------ZONA 1 - Formular Transfer -------------------//

	private Transfer docTransfer;
	private List<Transfer> listaTransfer;
	private List<Gestiune> listaGestiuneSursa;
	private List<Gestiune> listaGestiuneDestinatie;
	private List<MijlocFix> listaMijlocFix;
	private MijlocFix mijlocfix;
	private Document nrDocumentCurent;
	private Document dataOperare;
	private Transfer explicatii;

	private masterRepository masterRepo = new masterRepository();
	private documentRepository docRepo = new documentRepository();
	
	
	
	public transferFormData() {
		this.getListaTransfer();
		
	}

	public List<Gestiune> getListGestiuneSursa() {
		if (this.listaGestiuneSursa == null) 
		{
			this.listaGestiuneSursa = this.masterRepo.findGestiuniAll();
		}
		return listaGestiuneSursa;
	}

	public void setListGestiuneSursa(List<Gestiune> listaGestiuneSursa) {
		this.listaGestiuneSursa = listaGestiuneSursa;
	}
	
	public List<Gestiune> getListGestiuneDestinatie() {
		if (this.listaGestiuneDestinatie == null) 
		{
			this.listaGestiuneDestinatie = this.masterRepo.findGestiuniAll();
		}
		return listaGestiuneDestinatie;
	}

	public void setListGestiuneDestinatie(List<Gestiune> listaGestiuneDestinatie) {
		this.listaGestiuneDestinatie = listaGestiuneDestinatie;
	}

	// Getteri si Setteri pentru manevrarea slectiei curente.
	
	public Gestiune getGestiuneSelectataSursa() {
		return this.docTransfer.getGestiuneSursa();
	}
	
	public Gestiune getGestiuneSelectataDestinatie() {
		return this.docTransfer.getGestiuneDestinatie();
	}

	public void setGestiuneSelectatSursa(Gestiune GestiuneSelectatSursa) {
		Gestiune gestiuneNumeSursa = this.masterRepo
				.findGestiuneById(GestiuneSelectatSursa.getId());
		this.docTransfer.setGestiuneSursa(gestiuneNumeSursa);
		
	}
	
	public void setGestiuneSelectataDestinatie(Gestiune GestiuneSelectatDestinatie) {
		Gestiune gestiuneNumeDestinatie = this.masterRepo
				.findGestiuneById(GestiuneSelectatDestinatie.getId());
		this.docTransfer.setGestiuneSursa(gestiuneNumeDestinatie);
		
	}
	
	public List<MijlocFix> getListaMijlocFix() {
		if (listaMijlocFix == null)
			listaMijlocFix = masterRepo.findMijlocFixAll();
		return listaMijlocFix;
	}
	
	public void setListaMijlocFix(List<MijlocFix> listaMijlocFix) {
		this.listaMijlocFix = listaMijlocFix;
	}
	
	public MijlocFix getMijlocFixSelectat() {
		 return this.mijlocfix = mijlocfix;
	}
	
	public void setMijlocFixSelectat(MijlocFix mijlocfix)
	{
		this.mijlocfix = mijlocfix;
	}

	public Transfer getDocumentTransfer() {
		return docTransfer;
	}

	public void setDocumentTransfer(Transfer documentCurent) {
		this.docTransfer = documentCurent;
	}

	public List<Transfer> getListaTransfer() {
		return listaTransfer;
	}

	public void setListaTransfer(List<Transfer> listaDocumenteTransfer) {
		this.listaTransfer = listaDocumenteTransfer;
	}
	
	public Document getCodDocument(){
		return this.nrDocumentCurent;
	}
	
	public void setCodDocument(Document document) {
		this.nrDocumentCurent = document;
	}
	
	public Document getDataOperare(){
		return this.dataOperare;
	}
	
	public void setDataOperare(Document dataoperare) {
		this.dataOperare = dataoperare;
	}
	
	public Transfer getExplicatii() {
		return this.explicatii;
	}
	
	public void setExplicatii(Transfer explicatii) {
		this.explicatii = explicatii;
	}

	public masterRepository getMasterRepo() {
		return masterRepo;
	}

	public void setMasterRepo(masterRepository masterRepo) {
		this.masterRepo = masterRepo;
	}

	public documentRepository getDocRepo() {
		return docRepo;
	}

	public void setDocRepo(documentRepository docRepo) {
		this.docRepo = docRepo;
	}

}
