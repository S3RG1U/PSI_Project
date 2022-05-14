package psi.Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import psi.metamodel.AbstractEntity;


@Entity
@Table(name = "Angajati")

public class Angajati extends AbstractEntity{

	 String codAngajat;
	 String numeAngajat;
	 String functieAngajat;
	
	
	public String getCodAngajat() {
		return codAngajat;
	}
	public void setCodAngajat(String codAngajat) {
		this.codAngajat = codAngajat;
	}
	public String getNumeAngajat() {
		return numeAngajat;
	}
	public void setNumeAngajat(String numeAngajat) {
		this.numeAngajat = numeAngajat;
	}
	public String getFunctieAngajat() {
		return functieAngajat;
	}
	public void setFunctieAngajat(String functieAngajat) {
		this.functieAngajat = functieAngajat;
	}
	
	public Angajati(String codAngajat, String numeAngajat, String functieAngajat) {
		super();
		this.codAngajat = codAngajat;
		this.numeAngajat = numeAngajat;
		this.functieAngajat = functieAngajat;
	}
	
}
