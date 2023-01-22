package sn.sectioninfo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ImpoSociete implements Serializable{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idIS ;
		@Temporal(TemporalType.DATE)
	private Date dateDeclaration ;
	
		@OneToOne(cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
		@JoinColumn(name = "idRs")
	private ResultatFiscaleIS resultatFiscale ;
		@OneToOne(cascade= CascadeType.ALL)
		@JoinColumn(name = "idReint")
	private ReintegrationIS reintegration ;
	
	//Association  avec L'entite Deduction en attente
		@OneToOne(cascade= CascadeType.ALL)
		@JoinColumn(name = "idDeduction")
	private DeductionIS deduction ;
	
	//Association  avec L'entite ImpotAPayer en attente
		@OneToOne(cascade= CascadeType.ALL)
		@JoinColumn(name = "idIMP")
	private ImpotAPayerIS impotApayer ;
	
	//Association  avec  L'entite Contribuable en attente
		@ManyToOne
		@JoinColumn(name = "idContribuable")
	private Contribuable contribuable ;
	
	public ImpoSociete(Date dateDeclaration, ResultatFiscaleIS resultatFiscale, ReintegrationIS reintegration,
			DeductionIS deduction, ImpotAPayerIS impotApayer, Contribuable contribuable) {
		super();
		this.dateDeclaration = dateDeclaration;
		this.resultatFiscale = resultatFiscale;
		this.reintegration = reintegration;
		this.deduction = deduction;
		this.impotApayer = impotApayer;
		this.contribuable = contribuable;
	}

	public ImpoSociete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImpoSociete(Date dateDeclaration) {
		super();
		this.dateDeclaration = dateDeclaration;
	}

	public Long getIdIS() {
		return idIS;
	}

	public void setIdIS(Long idIS) {
		this.idIS = idIS;
	}

	public Date getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

	public ResultatFiscaleIS getResultatFiscale() {
		return resultatFiscale;
	}

	public void setResultatFiscale(ResultatFiscaleIS resultatFiscale) {
		this.resultatFiscale = resultatFiscale;
	}

	public ReintegrationIS getReintegration() {
		return reintegration;
	}

	public void setReintegration(ReintegrationIS reintegration) {
		this.reintegration = reintegration;
	}

	public DeductionIS getDeduction() {
		return deduction;
	}

	public void setDeduction(DeductionIS deduction) {
		this.deduction = deduction;
	}

	public ImpotAPayerIS getImpotApayer() {
		return impotApayer;
	}

	public void setImpotApayer(ImpotAPayerIS impotApayer) {
		this.impotApayer = impotApayer;
	}

	public Contribuable getContribuable() {
		return contribuable;
	}

	public void setContribuable(Contribuable contribuable) {
		this.contribuable = contribuable;
	}

	
}
