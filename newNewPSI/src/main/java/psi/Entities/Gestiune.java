package psi.Entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import psi.metamodel.AbstractEntity;


/**
 * Entity implementation class for Entity: Gestiune
 *
 */
@Entity
public class Gestiune extends AbstractEntity {

	private Integer codGestiune;
	private String denumireGestiune;
	private String numeGestionar;
	@OneToMany(mappedBy = "gestiune", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<MijlocFix> mijlocfix = new HashSet<MijlocFix>();
	
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
	public Set<MijlocFix> getMijlocfix() {
		return mijlocfix;
	}
	public void setMijlocfix(Set<MijlocFix> mijlocfix) {
		this.mijlocfix = mijlocfix;
	}
	
	public Gestiune(Integer codGestiune, String denumireGestiune, String numeGestionar, Set<MijlocFix> mijlocfix) {
		super();
		this.codGestiune = codGestiune;
		this.denumireGestiune = denumireGestiune;
		this.numeGestionar = numeGestionar;
		this.mijlocfix = mijlocfix;
	}
	
	public Gestiune() {
		super();
		// TODO Auto-generated constructor stub
	}


}