package psi.Entities;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import psi.Entities.LinieDocument;
import psi.metamodel.AbstractEntity;

@Entity
@Table(name = "Document")
@Inheritance(strategy = InheritanceType.JOINED)
public class Document extends AbstractEntity {

	String codDocument;
	private String numeDocument;
	private String tipDocument;
	private String explicatii;
	@Temporal(value = TemporalType.DATE)
	private Date dataDocument;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dataOperare;
	
	//@ManyToOne(mappedBy = "document", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//private Set<LinieDocument> liniiDocument = new HashSet<LinieDocument>();

	// ---------- metode pentru managementul colectiei liniiDocument
	// -----------//

//	public void addLinieDocument(LinieDocument linie) {
//		this.liniiDocument.add(linie);
//		linie.setDocument(this);// set the inverse relation. MANDATORY!
//	}
//
//	public void addLinieDocument(MijlocFix mijlocfix, Double cantitate,
//			Double valoare) {
//		LinieDocument linie = new LinieDocument(cantitate, valoare, mijlocfix);
//		this.liniiDocument.add(linie);
//		linie.setDocument(this);// set the inverse relation. MANDATORY!
//	}
//
//	public void removeLinieDocument(LinieDocument linie) {
//		this.liniiDocument.remove(linie);
//		linie.setDocument(null);// detach the inverse relation. MANDATORY!
//	}
//
//	public List<LinieDocument> getLiniiDocument() {
//		return Collections.unmodifiableList(new LinkedList(liniiDocument));
//	}

	public String getCodDocument() {
		return codDocument;
	}

	public void setCodDocument(String codDocument) {
		this.codDocument = codDocument;
	}

	public String getNumeDocument() {
		return numeDocument;
	}

	public void setNumeDocument(String numeDocument) {
		this.numeDocument = numeDocument;
	}

	public String getTipDocument() {
		return tipDocument;
	}

	public void setTipDocument(String tipDocument) {
		this.tipDocument = tipDocument;
	}

	public String getExplicatii() {
		return explicatii;
	}

	public void setExplicatii(String explicatii) {
		this.explicatii = explicatii;
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
/*
	public void setLiniiDocument(Set<LinieDocument> liniiDocument) {
		this.liniiDocument = liniiDocument;
	}
*/
	public Document(String numeDocument, String tipDocument, String explicatii, Date dataDocument, Date dataOperare,
			Set<LinieDocument> liniiDocument, String codDocument) {
		super();
		this.codDocument = codDocument;
		this.numeDocument = numeDocument;
		this.tipDocument = tipDocument;
		this.explicatii = explicatii;
		this.dataDocument = dataDocument;
		this.dataOperare = dataOperare;
		//this.liniiDocument = liniiDocument;
	}
	
}
