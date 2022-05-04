package formular;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import psi.project.model.entity.AbstractEntity;

public class Document extends AbstractEntity {
	private String codDocument;
	private String tipDocument;
	private String numeDocument;
	@Temporal(value = TemporalType.DATE)
	private Date dataDocument;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataOperare;
	@OneToMany(mappedBy = "document", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<LinieDocument> linieDocument = new HashSet<LinieDocument>();


	public void addLinieDocument(LinieDocument linie) {
		this.linieDocument.add(linie);
		linie.setDocument(this);// set the inverse relation. MANDATORY!
	}

	public void addLinieDocument(MijlocFix mijlocfix, Double cantitate,
			Double valoareInventar) {
		LinieDocument linie = new LinieDocument(cantitate, valoareInventar, mijlocfix);
		this.linieDocument.add(linie);
		linie.setDocument(this);// set the inverse relation. MANDATORY!
	}

	public void removeLinieDocument(LinieDocument linie) {
		this.linieDocument.remove(linie);
		linie.setDocument(null);// detach the inverse relation. MANDATORY!
	}

	/**
	 * 
	 * @return - lista read-only
	 */
	public List<LinieDocument> getLinieDocument() {
		return Collections.unmodifiableList(new LinkedList(linieDocument));
	}

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

	public void setnumeDocument(String codDocument) {
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

}
