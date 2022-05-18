package psi.Entities;

import java.util.Date;

import javax.persistence.*;

import psi.metamodel.AbstractEntity;


/**
 * Entity implementation class for Entity: Transfer
 *
 */
@Entity
@Table(name="Transfer")

public class Transfer extends AbstractEntity{
	@ManyToOne
	private Gestiune gestiuneSursa;
	@ManyToOne
	private Gestiune gestiuneDestinatie;
	private Date DataOperare;
	private String explicatii;

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
	public Date getDataOperare()
	{
		return DataOperare;
	}
	public void setDataOperare(Date date) {
		this.DataOperare = DataOperare;
	}
	public String getExplicatii() {
		return explicatii;
	}
	public void setExplicatii(String explicatii) {
		this.explicatii = explicatii;
	}
	
	public Transfer(){
		super();
	}
	
	public Transfer(Gestiune gestiuneSursa, Gestiune gestiuneDestinatie) {
		this();
		this.gestiuneSursa = gestiuneSursa;
		this.gestiuneDestinatie = gestiuneDestinatie;
		this.explicatii = explicatii;
	}


}
