package psi.Entities;

import java.io.Serializable;
import javax.persistence.*;

import psi.metamodel.AbstractEntity;


/**
 * Entity implementation class for Entity: Gestiune
 *
 */
@Entity
public class Gestiune extends AbstractEntity {

	Integer codGestiune;
	String denumireGestiune;
	String numeGestionar;
	@OneToMany(mappedBy = "gestiune", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
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
	
	public Gestiune() {
		super();

	}
	
	public Gestiune(Integer codGestiune, String denumireGestiune, String numeGestionar) {
		super();
		this.codGestiune = codGestiune;
		this.denumireGestiune = denumireGestiune;
		this.numeGestionar = numeGestionar;
	}

	

}