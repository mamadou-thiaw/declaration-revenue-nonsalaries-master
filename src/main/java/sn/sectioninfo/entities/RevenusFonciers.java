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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RevenusFonciers implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrevFonc;
	private Long num_titreFonfier;
		@Temporal(TemporalType.DATE)
	private Date dateAcquisition;
		@Temporal(TemporalType.DATE)
	private Date dateDeclaration;
	private double RNPD;
	private double RNPSC;
	// Association avec L'entite Contribuable en attente
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "idContribuable")
	private Contribuable contribuable;

	public RevenusFonciers() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public RevenusFonciers(Long num_titreFonfier, Date dateAcquisition, Date dateDeclaration, double rNPD, double rNPSC,
			Contribuable contribuable) {
		super();
		this.num_titreFonfier = num_titreFonfier;
		this.dateAcquisition = dateAcquisition;
		this.dateDeclaration = dateDeclaration;
		RNPD = rNPD;
		RNPSC = rNPSC;
		this.contribuable = contribuable;
	}



	public RevenusFonciers(Long num_titreFonfier, Date dateAcquisition, Date dateDeclaration, double rNPD,
			double rNPSC) {
		super();
		this.num_titreFonfier = num_titreFonfier;
		this.dateAcquisition = dateAcquisition;
		this.dateDeclaration = dateDeclaration;
		RNPD = rNPD;
		RNPSC = rNPSC;
	}



	public Long getNum_titreFonfier() {
		return num_titreFonfier;
	}

	public void setNum_titreFonfier(Long num_titreFonfier) {
		this.num_titreFonfier = num_titreFonfier;
	}

	public Date getDateAcquisition() {
		return dateAcquisition;
	}

	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public Date getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

	public double getRNPD() {
		return RNPD;
	}

	public void setRNPD(double rNPD) {
		RNPD = rNPD;
	}

	public double getRNPSC() {
		return RNPSC;
	}

	public void setRNPSC(double rNPSC) {
		RNPSC = rNPSC;
	}

	public Contribuable getContribuable() {
		return contribuable;
	}

	public void setContribuable(Contribuable contribuable) {
		this.contribuable = contribuable;
	}

	public Long getIdrevFonc() {
		return idrevFonc;
	}

	public void setIdrevFonc(Long idrevFonc) {
		this.idrevFonc = idrevFonc;
	}
	

}
