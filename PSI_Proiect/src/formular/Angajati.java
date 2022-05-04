package formular;

import javax.persistence.Entity;

import psi.project.model.entity.AbstractEntity;

@Entity
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
	
}
