package psi.Entities;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import psi.metamodel.AbstractEntity;

import psi.Entities.LinieDocument;
import psi.Entities.Gestiune;
import psi.Entities.MijlocFix;


/**
 * Entity implementation class for Entity: Document
 *
 */
@Entity 
@Table(name="Document")
public class Document extends AbstractEntity {

	
	private Integer codDocument;
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
		linie.setDocument(this);
	}

	public void addLinieDocument(MijlocFix mijlocfix, Double valoareInventar) {
		LinieDocument linie = new LinieDocument(valoareInventar, mijlocfix, null);
		this.liniiDocument.add(linie);
		linie.setDocument(this);
	}

	public void removeLinieDocument(LinieDocument linie) {
		this.liniiDocument.remove(linie);
		linie.setDocument(null);
	}


	public Integer getCodDocument() {
		return codDocument;
	}

	public void setCodDocument(Integer codDocument) {
		this.codDocument = codDocument;
	}

	public String getTipDocument() {
		return tipDocument;
	}

	public void setTipDocument(String tipDocument) {
		this.tipDocument = tipDocument;
	}

	public String getNumeDocument() {
		return numeDocument;
	}

	public void setNumeDocument(String numeDocument) {
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

	public Set<LinieDocument> getLiniiDocument() {
		return liniiDocument;
	}

	public void setLiniiDocument(Set<LinieDocument> liniiDocument) {
		this.liniiDocument = liniiDocument;
	}

	public Document(Integer codDocument, String tipDocument, String numeDocument, Date dataDocument, Date dataOperare,
			Set<psi.Entities.LinieDocument> liniiDocument) {
		super();
		this.codDocument = codDocument;
		this.tipDocument = tipDocument;
		this.numeDocument = numeDocument;
		this.dataDocument = dataDocument;
		this.dataOperare = dataOperare;
		this.liniiDocument = liniiDocument;
	}

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
