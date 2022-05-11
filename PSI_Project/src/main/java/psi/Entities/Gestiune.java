package psi.Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import psi.metamodel.AbstractEntity;

@Entity
@Table(name = "Gestiune")

public class Gestiune extends AbstractEntity {

	Integer codGestiune;
	private String denumireGestiune;
	private String numeGestionar;

	public Integer getCodGestiune() {
		return codGestiune;
	}

	public void setCodGestiune(Integer codGestiune) {
		this.codGestiune = codGestiune;
	}

	public String getDenumireGestiune() {
		return denumireGestiune;
	}

	public void setDenumireGestiune(String denumireGestiune) {
		this.denumireGestiune = denumireGestiune;
	}

	public String getNumeGestionar() {
		return numeGestionar;
	}

	public void setNumeGestionar(String numeGestionar) {
		this.numeGestionar = numeGestionar;
	}

	public Gestiune(Integer codGestiune, String denumireGestiune, String numeGestionar) {
		super();
		this.codGestiune = codGestiune;
		this.denumireGestiune = denumireGestiune;
		this.numeGestionar = numeGestionar;
	}

}