package psi.test.repository;

import java.util.List;

import psi.Entities.Gestiune;

import psi.model.repository.masterRepository;

/**
 * Test pentru Gestiuni. Teste efectuate:
 * # extragere lista de gestiuni
 * # adaugare Gestiune 
 * 
 *
 * 
 */
public class testGestiune {

	static masterRepository repo = new masterRepository();

	public static void main(String[] args) {
		List<Gestiune> x = repo.findGestiuniAll();
		if (x.size() == 0)// daca nu sunt date in tabela, adaugam date de test
		{
			adaugaGestiuni();
			x = repo.findGestiuniAll();
		}
		
		// acum ar trebui sa avem date de test
		assert x.size() > 0;

		
	}

	public static void adaugaGestiuni() {
		Gestiune g = null;
		repo.beginTransaction();

		for (int i=0; i<3; i++) {
			
			g=new Gestiune();
			g.setCodGestiune(1000+i);
			g.setDenumireGestiune("Gestiune "+g.getCodGestiune());
			repo.addGestiune(g);
		}
		repo.commitTransaction();
	}
}
