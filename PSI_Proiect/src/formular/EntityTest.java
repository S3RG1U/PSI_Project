package formular;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityTest {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("SGSMPersistenceUnit").createEntityManager();
		em.createQuery("").getResultList();
	}

}
