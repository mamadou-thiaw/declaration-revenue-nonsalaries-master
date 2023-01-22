package sn.sectioninfo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResultatFiscaleIS implements Serializable {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRs ;
	private double beneficeTotale ;
	private double deficitTotale ;
	public ResultatFiscaleIS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultatFiscaleIS(double beneficeTotale, double deficitTotale) {
		super();
		this.beneficeTotale = beneficeTotale;
		this.deficitTotale = deficitTotale;
	}
	public Long getIdRs() {
		return idRs;
	}
	public void setIdRs(Long idRs) {
		this.idRs = idRs;
	}
	public double getBeneficeTotale() {
		return beneficeTotale;
	}
	public void setBeneficeTotale(double beneficeTotale) {
		this.beneficeTotale = beneficeTotale;
	}
	public double getDeficitTotale() {
		return deficitTotale;
	}
	public void setDeficitTotale(double deficitTotale) {
		this.deficitTotale = deficitTotale;
	}
	
	
	
}
