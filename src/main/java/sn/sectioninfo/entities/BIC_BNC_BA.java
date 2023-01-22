package sn.sectioninfo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class BIC_BNC_BA implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bic_bnc_ba;
	private double numRegCom;
	private double BeneficeTotale;
	private double deficitTotale;
	private String typeBenefice;
		@Temporal(TemporalType.DATE)
	private Date dateDeclaration;
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name = "idReint")
	private ReintegrationIR reintegration;
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name = "idded")
	private DeductionIR deduction;
		@ManyToOne()
		@JoinColumn(name = "idContribuable")
	private Contribuable contribuable ;
	
	public BIC_BNC_BA() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public BIC_BNC_BA(double numRegCom, double beneficeTotale, double deficitTotale, String typeBenefice,
			Date dateDeclaration) {
		super();
		this.numRegCom = numRegCom;
		BeneficeTotale = beneficeTotale;
		this.deficitTotale = deficitTotale;
		this.typeBenefice = typeBenefice;
		this.dateDeclaration = dateDeclaration;
	}


	public BIC_BNC_BA(double numRegCom, double beneficeTotale, double deficitTotale, String typeBenefice,
			Date dateDeclaration, ReintegrationIR reintegration, DeductionIR deduction, Contribuable contribuable) {
		super();
		this.numRegCom = numRegCom;
		BeneficeTotale = beneficeTotale;
		this.deficitTotale = deficitTotale;
		this.typeBenefice = typeBenefice;
		this.dateDeclaration = dateDeclaration;
		this.reintegration = reintegration;
		this.deduction = deduction;
		this.contribuable = contribuable;
	}


	public Long getBic_bnc_ba() {
		return bic_bnc_ba;
	}



	public void setBic_bnc_ba(Long bic_bnc_ba) {
		this.bic_bnc_ba = bic_bnc_ba;
	}



	public double getNumRegCom() {
		return numRegCom;
	}



	public void setNumRegCom(double numRegCom) {
		this.numRegCom = numRegCom;
	}



	public double getBeneficeTotale() {
		return BeneficeTotale;
	}



	public void setBeneficeTotale(double beneficeTotale) {
		BeneficeTotale = beneficeTotale;
	}



	public double getDeficitTotale() {
		return deficitTotale;
	}



	public void setDeficitTotale(double deficitTotale) {
		this.deficitTotale = deficitTotale;
	}



	public String getTypeBenefice() {
		return typeBenefice;
	}



	public void setTypeBenefice(String typeBenefice) {
		this.typeBenefice = typeBenefice;
	}



	public Date getDateDeclaration() {
		return dateDeclaration;
	}



	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}



	public ReintegrationIR getReintegration() {
		return reintegration;
	}



	public void setReintegration(ReintegrationIR reintegration) {
		this.reintegration = reintegration;
	}



	public DeductionIR getDeduction() {
		return deduction;
	}



	public void setDeduction(DeductionIR deduction) {
		this.deduction = deduction;
	}



	public Contribuable getContribuable() {
		return contribuable;
	}



	public void setContribuable(Contribuable contribuable) {
		this.contribuable = contribuable;
	}
	
	
	
	

}
