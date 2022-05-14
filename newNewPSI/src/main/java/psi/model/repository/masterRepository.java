package psi.model.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import psi.metamodel.AbstractRepository;
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

	
	public void deleteMijlocFix(MijlocFix mijlocFix) {
		this.delete(mijlocFix);

	}

	
	public void deleteGestiune(Gestiune gestiune) {
		this.delete(gestiune);

	}

	
	public MijlocFix findMijlocFixById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<MijlocFix> findMijlocFixAll() {
		return this.getEm().createQuery("Select m from MijlocFix m")
				.getResultList();
	}

	
	public Transfer findDocById(Long id) {
		return (Transfer)this.getEm().createQuery("select d from Document d where id=:id").setParameter("id", id).getSingleResult();
	
	}
	

	public List<Transfer> findDoc(){
		return this.getEm().createQuery("select t from Transfer t").getResultList();
	}

	
	public Gestiune findGestiuneById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Gestiune> findGestiuniAll() {
		return this.getEm().createQuery("Select g from Gestiune g")
				.getResultList();
	}

	
	public MijlocFix updateMijlocFix(MijlocFix mijlocFix) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Gestiune updateGestiune(Gestiune gestiune) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
