package formular;

import java.util.Date;

import javax.persistence.Entity;

import psi.project.model.entity.AbstractEntity;

@Entity

public class MijlocFix extends AbstractEntity{
  String NrdMijlocFix;
  String denumireMijloc;
  String gestionar;
  Double valoareMijlocFix;
  String um;
  String caractTehnice;
  Date dataFolosinta;
  Date dataAmortizareCompleta;
  Double valoareAmortizare;
  Double valoareaRamasa;
  String durataNormalaFunctionare;
  String tipAmortizare;
  Boolean folosinta;
  
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

  
}
