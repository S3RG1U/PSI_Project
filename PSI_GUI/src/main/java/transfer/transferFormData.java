package transfer;

import java.util.LinkedList;
import java.util.List;

import psi.Entities.MijlocFix;
import psi.Entities.Gestiune;
import psi.Entities.LinieDocument;
import psi.Entities.Transfer;

import psi.model.repository.documentRepository;

import psi.model.repository.masterRepository;


public class transferFormData {

	// --------------ZONA 1 - Formular Transfer -------------------//

	private Transfer docTransfer;

	// colectia de obiecte-tinta obtinute in urma unei operatii de cautare
	private List<Transfer> listaTransfer;

	// obiecte de tip Repository necesare pentru interogarea modelului
	private masterRepository masterRepo = new masterRepository();
	private documentRepository docRepo = new documentRepository();
	

	// ---------------ZONA 2 - Gestiuni --------------//
	
	private List<Gestiune> listaGestiuneSursa;
	private List<Gestiune> listaGestiuneDestinatie;

	
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
	
	public List<Gestiune> listaGestiuneDestinatie() {
		if (this.listaGestiuneDestinatie == null) 
		{
			this.listaGestiuneDestinatie = this.masterRepo.findGestiuniAll();
		}
		return listaGestiuneDestinatie;
	}

	public void setlistaGestiuneDestinatie(List<Gestiune> listaGestiuneDestinatie) {
		this.listaGestiuneDestinatie = listaGestiuneDestinatie;
	}

	// Getteri si Setteri pentru manevrarea slectiei curente.
	// lucreaza cu obiectul atasat documentului aflat in editare.
	public Gestiune getGestiuneSelectataSursa() {
		return this.docTransfer.getGestiuneSursa();
	}
	
	public Gestiune getGestiuneSelectataDestinatie() {
		return this.docTransfer.getGestiuneDestinatie();
	}

	/**
	 * ATENTIE - in majoritatea mediilor de dezvoltare, obiectele grafice de tip
	 * lista returneaza un id (o valoare atomica / un singul atribut) al
	 * obiectului selectat din lista. Ca urmare, trebuie incarcat obiectul
	 * corespunzator pentru relatia ManyToOne.
	 * 
	 * @param furnizorSelectat
	 */
	public void setGestiuneSelectatSursa(Gestiune GestiuneSelectatSursa) {
		Gestiune gestiuneNumeSursa = this.masterRepo
				.findGestiuneById(GestiuneSelectatSursa.getId());
		this.docTransfer.setGestiuneSursa(gestiuneNumeSursa);
		
		System.out.println("gestiuneNumeSursa");
	}
	
	

	// ------------- ZONA 3 -- date despre documentul curent afisat pe ecran
	// --------------
	// date privind documentul curent = obiectul tinta al formularului si este
	// deja reprezentat (vezi zona 0, atributul documentCurent)

	// ------------- ZONA 4 -- linii document - read only
	// ---------------------------------------------
	// --tabelul afisa totalul receptionat pentru docummentul curent
	// --pentru ca pot fi mai multe receptii pentru acelasi document, este
	// necesara cumularea liniilor fiecarei receptii intr-o singura colectie

//	public List<LinieDocument> getArticoleReceptionate() {
//		return this.documentCurent.getArticoleReceptionate();
//	}

	// ------------- ZONA 5 - date despre mijlocul de transaport -
	// -------------------------
	// --nimic de adaugat - se lucreaza cu atributele obiectului documentCurent

	// ------------- ZONA 6 - totaluri
	// ----------------------------------------------------
	// -- nimic de adaugat - se lucreaza cu atributele specifice ale obiectului
	// documentCurent

	// ----------Zona 10 - tabelul receptii ------------------
	// Formularul va prezenta lista de obiecte Receptie reprezentate de colectia
	// OneToMany corespunzatoare a documentCurent
	// trebuie adaugat un atribut ce va tine referinta catre obiectul Receptie
	// curent selectat

//	private Receptie receptieSelectata;
//
//	public Receptie getReceptieSelectata() {
//		return receptieSelectata;
//	}
//
//	public void setReceptieSelectata(Receptie receptieSelectata) {
//		this.receptieSelectata = receptieSelectata;
//	}
//
//	// trebuie adaugat si un atribut pentru sursa de date a listei de gestiuni
//
//	private List<Gestiune> listaGestiuni;
//
//	public List<Gestiune> getListaGestiuni() {
//		if (listaGestiuni == null)
//			listaGestiuni = masterRepo.findGestiuniAll();
//
//		return listaGestiuni;
//	}

	// ----------Zona 11 - tabelul de materiale receptionate pe receptia curenta
	// ------------------
	// -- nimic de adaugat aici pentru sursa de date a tabelului- formularul va
	// prezenta colectia liniiDocument a receptiei selectate
//	// --de adaugat doar suportul pentru lista de materiale
//
//	private List<BunMaterial> listaMateriale;
//
//	public List<BunMaterial> getListaMateriale() {
//		if (listaMateriale == null)
//			listaMateriale = masterRepo.findBunuriMaterialeAll();
//
//		return listaMateriale;
//	}
//
//	// GETTERI SI SETTERI pentru proprietatile zonei 0
//
//	// metode de acces pentru zona 0
//	public DocInsotitor getDocumentCurent() {
//		return documentCurent;
//	}
//
//	public void setDocumentCurent(DocInsotitor documentCurent) {
//		this.documentCurent = documentCurent;
//	}
//
//	public List<DocInsotitor> getListaDocumente() {
//		return listaDocumente;
//	}
//
//	public void setListaDocumente(List<DocInsotitor> listaDocumente) {
//		this.listaDocumente = listaDocumente;
//	}
//
//	public MasterRepositoryDefault getMasterRepo() {
//		return masterRepo;
//	}
//
//	public void setMasterRepo(MasterRepositoryDefault masterRepo) {
//		this.masterRepo = masterRepo;
//	}
//
//	public DocumentRepositoryDefault getDocRepo() {
//		return docRepo;
//	}
//
//	public void setDocRepo(DocumentRepositoryDefault docRepo) {
//		this.docRepo = docRepo;
//	}

}
