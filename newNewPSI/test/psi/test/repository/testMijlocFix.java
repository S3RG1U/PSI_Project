package psi.test.repository;

import java.util.List;

import junit.framework.Assert;
import psi.Entities.MijlocFix;

import psi.model.repository.masterRepository;

/**
 * Test pentru BunMaterial. Teste efectuate:
 * # extragere lista de materiale
 * # adaugare BunMaterial 
 * 
 * @author cretuli
 * 
 */
public class testMijlocFix {

	static masterRepository repo = new masterRepository();

	public static void main(String[] args) {
		List<MijlocFix> x = repo.findMijlocFixAll();
		if (x.size() == 0)// daca nu sunt date in tabela, adaugam date de test
		{
			adaugaMijlocFix();
			x = repo.findMijlocFixAll();
		}
		
		// acum ar trebui sa avem date de test
		Assert.assertTrue( x.size() > 0);

		
		
	}

	public static void adaugaMijlocFix() {
		MijlocFix g = null;
		repo.beginTransaction();

		for (int i=0; i<3; i++) {
			
			g=new MijlocFix();
			g.setNrdMijlocFix("M"+1000+i);
			g.setDenumireMijloc("MijlocFix "+g.getNrdMijlocFix());
			
			repo.addMijlocFix(g);
		}
		repo.commitTransaction();
	}
}
