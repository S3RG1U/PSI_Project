package psi.Entities;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import psi.metamodel.AbstractEntity;
import psi.Entities.Gestiune;


/**
 * Entity implementation class for Entity: MijlocFix
 *
 */
@Entity
public class MijlocFix extends AbstractEntity {
	private String NrdMijlocFix;
	private String denumireMijloc;
	@ManyToOne
	private Gestiune gestiune;
	private String gestionar;
	private Double valoareMijlocFix;
	private String um;
	private String caractTehnice;
	private Date dataFolosinta;
	private Date dataAmortizareCompleta;
	private Double valoareAmortizare;
	private Double valoareaRamasa;
	private String durataNormalaFunctionare;
	private String tipAmortizare;
	private Boolean folosinta;
	
	public String getNrdMijlocFix() {
		return NrdMijlocFix;
	}

	public void setNrdMijlocFix(String nrdMijlocFix) {
		NrdMijlocFix = nrdMijlocFix;
	}

	public String getDenumireMijloc() {
		return denumireMijloc;
	}

	public void setDenumireMijloc(String denumireMijloc) {
		this.denumireMijloc = denumireMijloc;
	}

	public Gestiune getGestiune() {
		return gestiune;
	}

	public void setGestiune(Gestiune gestiune) {
		this.gestiune = gestiune;
	}

	public String getGestionar() {
		return gestionar;
	}

	public void setGestionar(String gestionar) {
		this.gestionar = gestionar;
	}

	public Double getValoareMijlocFix() {
		return valoareMijlocFix;
	}

	public void setValoareMijlocFix(Double valoareMijlocFix) {
		this.valoareMijlocFix = valoareMijlocFix;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	public String getCaractTehnice() {
		return caractTehnice;
	}

	public void setCaractTehnice(String caractTehnice) {
		this.caractTehnice = caractTehnice;
	}

	public Date getDataFolosinta() {
		return dataFolosinta;
	}

	public void setDataFolosinta(Date dataFolosinta) {
		this.dataFolosinta = dataFolosinta;
	}

	public Date getDataAmortizareCompleta() {
		return dataAmortizareCompleta;
	}

	public void setDataAmortizareCompleta(Date dataAmortizareCompleta) {
		this.dataAmortizareCompleta = dataAmortizareCompleta;
	}

	public Double getValoareAmortizare() {
		return valoareAmortizare;
	}

	public void setValoareAmortizare(Double valoareAmortizare) {
		this.valoareAmortizare = valoareAmortizare;
	}

	public Double getValoareaRamasa() {
		return valoareaRamasa;
	}

	public void setValoareaRamasa(Double valoareaRamasa) {
		this.valoareaRamasa = valoareaRamasa;
	}

	public String getDurataNormalaFunctionare() {
		return durataNormalaFunctionare;
	}

	public void setDurataNormalaFunctionare(String durataNormalaFunctionare) {
		this.durataNormalaFunctionare = durataNormalaFunctionare;
	}

	public String getTipAmortizare() {
		return tipAmortizare;
	}

	public void setTipAmortizare(String tipAmortizare) {
		this.tipAmortizare = tipAmortizare;
	}

	public Boolean getFolosinta() {
		return folosinta;
	}

	public void setFolosinta(Boolean folosinta) {
		this.folosinta = folosinta;
	}

	public MijlocFix(String nrdMijlocFix, String denumireMijloc, Gestiune gestiune, String gestionar,
			Double valoareMijlocFix, String um, String caractTehnice, Date dataFolosinta, Date dataAmortizareCompleta,
			Double valoareAmortizare, Double valoareaRamasa, String durataNormalaFunctionare, String tipAmortizare,
			Boolean folosinta) {
		super();
		NrdMijlocFix = nrdMijlocFix;
		this.denumireMijloc = denumireMijloc;
		this.gestiune = gestiune;
		this.gestionar = gestionar;
		this.valoareMijlocFix = valoareMijlocFix;
		this.um = um;
		this.caractTehnice = caractTehnice;
		this.dataFolosinta = dataFolosinta;
		this.dataAmortizareCompleta = dataAmortizareCompleta;
		this.valoareAmortizare = valoareAmortizare;
		this.valoareaRamasa = valoareaRamasa;
		this.durataNormalaFunctionare = durataNormalaFunctionare;
		this.tipAmortizare = tipAmortizare;
		this.folosinta = folosinta;
	}

	public MijlocFix() {
		super();
		// TODO Auto-generated constructor stub
	}	


}