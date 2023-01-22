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
public class RevenusCapitauxMobiliers implements Serializable {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRCM;
	private double RO;
	private double JPRA;
	private double RC16;
	private double RC8;
	private double Lots;
	private double RMSE;
	private double ARM;
		@Temporal(TemporalType.DATE)
	private Date dateDeclaration;
	// Association avec L'entite Contribuable en attente
	@ManyToOne
	@JoinColumn(name = "idContribuable")
	private Contribuable contribuable;

	public RevenusCapitauxMobiliers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RevenusCapitauxMobiliers(double rO, double jPRA, double rC16, double rC8, double lots, double rMSE,
			double aRM, Date dateDeclaration) {
		super();
		RO = rO;
		JPRA = jPRA;
		RC16 = rC16;
		RC8 = rC8;
		Lots = lots;
		RMSE = rMSE;
		ARM = aRM;
		this.dateDeclaration = dateDeclaration;
	}

	public RevenusCapitauxMobiliers(double rO, double jPRA, double rC16, double rC8, double lots, double rMSE,
			double aRM, Date dateDeclaration, Contribuable contribuable) {
		super();
		RO = rO;
		JPRA = jPRA;
		RC16 = rC16;
		RC8 = rC8;
		Lots = lots;
		RMSE = rMSE;
		ARM = aRM;
		this.dateDeclaration = dateDeclaration;
		this.contribuable = contribuable;
	}

	public Long getIdRCM() {
		return idRCM;
	}

	public void setIdRCM(Long idRCM) {
		this.idRCM = idRCM;
	}

	public double getRO() {
		return RO;
	}

	public void setRO(double rO) {
		RO = rO;
	}

	public double getJPRA() {
		return JPRA;
	}

	public void setJPRA(double jPRA) {
		JPRA = jPRA;
	}

	public double getRC16() {
		return RC16;
	}

	public void setRC16(double rC16) {
		RC16 = rC16;
	}

	public double getRC8() {
		return RC8;
	}

	public void setRC8(double rC8) {
		RC8 = rC8;
	}

	public double getLots() {
		return Lots;
	}

	public void setLots(double lots) {
		Lots = lots;
	}

	public double getRMSE() {
		return RMSE;
	}

	public void setRMSE(double rMSE) {
		RMSE = rMSE;
	}

	public double getARM() {
		return ARM;
	}

	public void setARM(double aRM) {
		ARM = aRM;
	}

	public Date getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

	public Contribuable getContribuable() {
		return contribuable;
	}

	public void setContribuable(Contribuable contribuable) {
		this.contribuable = contribuable;
	}
	
	

}
