package psi.Entities;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import psi.metamodel.AbstractEntity;
import psi.Entities.MijlocFix;
import psi.Entities.LinieDocument;


/**
 * Entity implementation class for Entity: Document
 *
 */
@Entity 
@Table(name="Document")
public class Document extends AbstractEntity {

	
	private String codDocument;
	private String tipDocument;
	private String numeDocument;
	@Temporal(value = TemporalType.DATE)
	private Date dataDocument;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataOperare;
	@OneToMany(mappedBy = "document", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<LinieDocument> liniiDocument = new HashSet<LinieDocument>();
	
	
	public void addLinieDocument(LinieDocument linie) {
		this.liniiDocument.add(linie);
		linie.setDocument(this);// set the inverse relation. MANDATORY!
	}

	public void addLinieDocument(MijlocFix mijlocFix, Double cantitate,
			Double valoareInventar) {
		LinieDocument linie = new LinieDocument(cantitate, valoareInventar, mijlocFix);
		this.liniiDocument.add(linie);
		linie.setDocument(this);// set the inverse relation. MANDATORY!
	}

	public void removeLinieDocument(LinieDocument linie) {
		this.liniiDocument.remove(linie);
		linie.setDocument(null);// detach the inverse relation. MANDATORY!
	}
	/**
	 * 
	 * @return - lista read-only
	 */
	// ----------the usual getters and setters for Java Beans------//
	public String getTipDocument() {
		return tipDocument;
	}

	public void setTipDocument(String tipDocument) {
		this.tipDocument = tipDocument;
	}

	public String getcodDocument() {
		return codDocument;
	}

	public void setNumarDocument(String codDocument) {
		this.codDocument = codDocument;
	}

	public String getnumeDocument() {
		return numeDocument;
	}

	public void setnumeDocument(String numeDocument) {
		this.numeDocument = numeDocument;
	}

	public Date getDataDocument() {
		return dataDocument;
	}

	public void setDataDocument(Date dataDocument) {
		this.dataDocument = dataDocument;
	}

	public Date getDataOperare() {
		return dataOperare;
	}

	public void setDataOperare(Date dataOperare) {
		this.dataOperare = dataOperare;
	}

	public Document(String codDocument, String tipDocument, String numeDocument, Date dataDocument, Date dataOperare) {
		super();
		this.codDocument = codDocument;
		this.tipDocument = tipDocument;
		this.numeDocument = numeDocument;
		this.dataDocument = dataDocument;
		this.dataOperare = dataOperare;
	}

	public Document() {
		super();

	}

}
