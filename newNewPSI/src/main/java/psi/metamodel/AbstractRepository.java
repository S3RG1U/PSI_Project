package psi.metamodel;

import javax.persistence.*;


public abstract class AbstractRepository {
	
	private static EntityManager em = Persistence.createEntityManagerFactory(
			"newPsi").createEntityManager();

	public void beginTransaction() {
		this.getEm().getTransaction().begin();
	}

	public void commitTransaction() {
		this.getEm().getTransaction().commit();
	}

	public Object create(Object o) {
		this.getEm().persist(o);
		return o;
	}

	public Object update(Object o) {
		Object managedEntity = this.em.merge(o);
		return managedEntity;
	}

	public void delete(Object o) {
		this.getEm().remove(o);

	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}
