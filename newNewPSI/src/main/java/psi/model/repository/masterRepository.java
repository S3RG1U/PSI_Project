package psi.model.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import psi.metamodel.AbstractRepository;
import psi.Entities.Document;
import psi.Entities.Gestiune;
import psi.Entities.MijlocFix;
import psi.Entities.Transfer;



public class masterRepository extends AbstractRepository {

	
	public MijlocFix addMijlocFix(MijlocFix mijlocFix) {
		return (MijlocFix)this.create(mijlocFix);

	}

	public Gestiune addGestiune(Gestiune gestiune) {
		return (Gestiune)this.create(gestiune);

	}
	
	public Transfer addTransfer(Transfer transfer) {
		return (Transfer)this.create(transfer);

	}
	
	public Document addDocument(Document document) {
		return (Document)this.create(document);

	}
	
	public void deleteMijlocFix(MijlocFix mijlocFix) {
		this.delete(mijlocFix);

	}
	
	public void deleteGestiune(Gestiune gestiune) {
		this.delete(gestiune);

	}
	
	public void deleteTransfer(Transfer transfer) {
		this.delete(transfer);

	}
	
	public void deleteDocument(Document document) {
		this.delete(document);

	}
	
	public MijlocFix findMijlocFixById(Long id) {
		
		return (MijlocFix) this.getEm().createQuery("Select m from MijlocFix m where nrMijlocFix=:id").setParameter("id", id)
				.getSingleResult();
	}
	
	public List<MijlocFix> findMijlocFixAll() {
		return this.getEm().createQuery("Select m from MijlocFix m")
				.getResultList();
	}

	public List<Transfer> findTransfer(){
		return this.getEm().createQuery("select t from Transfer t").getResultList();
	}
	
	public Transfer findTransferById(Long id) {
		return (Transfer)this.getEm().createQuery("select t from Transfer t where id=:id").setParameter("id", id)
				.getSingleResult();
	
	}
	
	public List<Transfer> findTransferByGestiuneSursa(Gestiune gestiune) {
		return this.getEm().createQuery("Select t from Transfer t where gestiuneSursa=:id")
				.setParameter("id", gestiune.getCodGestiune()).getResultList();
	}
	

	@SuppressWarnings("unchecked")
	public List<Gestiune> findGestiuniAll() {
		return this.getEm().createQuery("Select g from Gestiune g")
				.getResultList();
	}
	
	public Gestiune findGestiuneById(Long id) {
		return (Gestiune)this.getEm().createQuery("select g from Gestiune g where codGestiune=:id").setParameter("id", id)
				.getSingleResult();
	}

	
	public MijlocFix updateMijlocFix(MijlocFix mijlocFix) {
		return (MijlocFix) this.getEm()
				.createQuery("Update MijlocFix m Set m.denumireMijloc=:denumireMijloc, m.gestiune=:gestiune where m.NrdMijlocFix=:id")
				.setParameter("id", mijlocFix.getNrdMijlocFix()).setParameter("gestiune", mijlocFix.getGestiune())
				.setParameter("denumireMijloc", mijlocFix.getDenumireMijloc()).getSingleResult();
	}

	
	public Gestiune updateGestiune(Gestiune gestiune) {
		return (Gestiune) this.getEm().createQuery(
				"Update Gestiune c Set g.codGestiune=:codGestiune, g.denumireGestiune=:denumireGestiune, g.numeGestionar=:numeGestionar, g.mijlocfix=:mijlocfix")
				.setParameter("codGestiune", gestiune.getCodGestiune()).setParameter("denumireGestiune", gestiune.getDenumireGestiune())
				.setParameter("numeGestionar", gestiune.getNumeGestionar()).setParameter("mijlocfix", gestiune.getMijlocfix())
				.getSingleResult();
	}
	
}
