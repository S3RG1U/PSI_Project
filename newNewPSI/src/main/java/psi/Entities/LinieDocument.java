package psi.Entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import psi.metamodel.AbstractEntity;

@Entity
public class LinieDocument extends AbstractEntity {

	
	
	Double valoareInventar=0.0;
	@ManyToOne
	MijlocFix mijlocfix;
	@ManyToOne
	Document document;
	
	public Double getValoareInventar() {
		return valoareInventar;
	}
	public void setValoareInventar(Double valoareInventar) {
		this.valoareInventar = valoareInventar;
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
	
	public LinieDocument(Double valoareInventar, MijlocFix mijlocfix, Document document) {
		super();
		this.valoareInventar = valoareInventar;
		this.mijlocfix = mijlocfix;
		this.document = document;
	}
	
	public LinieDocument() {
		super();
		// TODO Auto-generated constructor stub
	}

}
