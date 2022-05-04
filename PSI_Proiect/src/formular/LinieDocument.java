package formular;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import psi.project.model.entity.AbstractEntity;

@Entity 

public class LinieDocument extends AbstractEntity {
	
	Double cantitate = 0.0;
	Double valoareInventar = 0.0;
	@ManyToOne 
	MijlocFix mijlocfix;
	@ManyToOne
	Document document;
	 
	public LinieDocument(){
	super();
	}	
	
	public LinieDocument( Double cantitate, Double valoareInventar, MijlocFix mijlocfix) {
		this();
		this.cantitate = cantitate;
		this.valoareInventar = valoareInventar;
		this.mijlocfix = mijlocfix;
	}


	public Double getCantitate() {
		return cantitate;
	}

	public void setCantitate(Double cantitate) {
		this.cantitate = cantitate;
	}

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


}
