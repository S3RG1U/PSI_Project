package psi.Entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import psi.metamodel.AbstractEntity;

@Entity
@Table(name = "Transfer")

public class Transfer extends AbstractEntity{
	@ManyToOne
	Gestiune gestiuneSursa;
	@ManyToOne
	Gestiune gestiuneDestinatie;
	
	
	
	
	public Transfer(Gestiune gestiuneSursa, Gestiune gestiuneDestinatie) {
		this();
		this.gestiuneSursa = gestiuneSursa;
		this.gestiuneDestinatie = gestiuneDestinatie;
	}
	public Gestiune getGestiuneSursa() {
		return gestiuneSursa;
	}
	public void setGestiuneSursa(Gestiune gestiuneSursa) {
		this.gestiuneSursa = gestiuneSursa;
	}
	public Gestiune getGestiuneDestinatie() {
		return gestiuneDestinatie;
	}
	public void setGestiuneDestinatie(Gestiune gestiuneDestinatie) {
		this.gestiuneDestinatie = gestiuneDestinatie;
	}
	public Transfer(){
		super();
	}
}
