package psi.Entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.swing.text.Document;

import psi.metamodel.AbstractEntity;


@Entity 
@Table(name = "LinieDocument")

public class LinieDocument extends AbstractEntity {
	
	private Double cantitate = 0.0;
	private Double valoare = 0.0;
	@ManyToOne 
	MijlocFix mijlocfix;
	Document document;
	 
	public LinieDocument(){
	super();
	}	
	
	public LinieDocument( Double cantitate, Double valoareInventar, MijlocFix mijlocfix) {
		this();
		this.cantitate = cantitate;
		this.valoare = valoareInventar;
		this.mijlocfix = mijlocfix;
	}
	public Double getCantitate() {
		return cantitate;
	}

	public void setCantitate(Double cantitate) {
		this.cantitate = cantitate;
	}

	public Double getValoareInventar() {
		return valoare;
	}

	public void setValoareInventar(Double valoare) {
		this.valoare = valoare;
	}

	public MijlocFix getMijlocfix() {
		return mijlocfix;
	}

	public void setMijlocfix(MijlocFix mijlocfix) {
		this.mijlocfix = mijlocfix;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
}
