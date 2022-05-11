package formular;

import javax.persistence.Entity;

import psi.project.model.entity.AbstractEntity;

@Entity
public class Angajati extends AbstractEntity{

	private String codAngajat;
	private String numeAngajat;
	private String functieAngajat;
	
	public Angajati(String codAngajat, String numeAngajat, String functieAngajat) {
		super();
		this.codAngajat = codAngajat;
		this.numeAngajat = numeAngajat;
		this.functieAngajat = functieAngajat;
	}
	
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
