package sn.sectioninfo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReintegrationIS implements Serializable{
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReintIS;
	private double ANDIS ;
	private double ICMF ;
	private double PCND ;
	private double AP ;
	private double  FNDL ;
	private double IECCA ;
	private double TSVPPM ;
	private double DSND ;
	private double QPFS ;
	private double CCFPE ;
	private double AR ;
	
	public ReintegrationIS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReintegrationIS(double aND, double iCMF, double pCND, double aP, double fNDL, double iECCA, double tSVPPM,
			double dSND, double qPFS, double cCFPE, double aR) {
		super();
		ANDIS = aND;
		ICMF = iCMF;
		PCND = pCND;
		AP = aP;
		FNDL = fNDL;
		IECCA = iECCA;
		TSVPPM = tSVPPM;
		DSND = dSND;
		QPFS = qPFS;
		CCFPE = cCFPE;
		AR = aR;
	}

	public Long getIdReintIS() {
		return idReintIS;
	}
	public void setIdReintIS(Long idReint) {
		this.idReintIS = idReint;
	}
	public double getANDIS() {
		return ANDIS;
	}
	public void setANDIS(double aND) {
		ANDIS = aND;
	}

	public Long getIdReint() {
		return idReintIS;
	}
	public void setIdReint(Long idReint) {
		this.idReintIS = idReint;
	}
	public double getAND() {
		return ANDIS;
	}
	public void setAND(double aND) {
		ANDIS = aND;
	}
	public double getICMF() {
		return ICMF;
	}
	public void setICMF(double iCMF) {
		ICMF = iCMF;
	}
	public double getPCND() {
		return PCND;
	}
	public void setPCND(double pCND) {
		PCND = pCND;
	}
	public double getAP() {
		return AP;
	}
	public void setAP(double aP) {
		AP = aP;
	}
	public double getFNDL() {
		return FNDL;
	}
	public void setFNDL(double fNDL) {
		FNDL = fNDL;
	}
	public double getIECCA() {
		return IECCA;
	}
	public void setIECCA(double iECCA) {
		IECCA = iECCA;
	}
	public double getTSVPPM() {
		return TSVPPM;
	}
	public void setTSVPPM(double tSVPPM) {
		TSVPPM = tSVPPM;
	}
	public double getDSND() {
		return DSND;
	}
	public void setDSND(double dSND) {
		DSND = dSND;
	}
	public double getQPFS() {
		return QPFS;
	}
	public void setQPFS(double qPFS) {
		QPFS = qPFS;
	}
	public double getCCFPE() {
		return CCFPE;
	}
	public void setCCFPE(double cCFPE) {
		CCFPE = cCFPE;
	}
	public double getAR() {
		return AR;
	}
	public void setAR(double aR) {
		AR = aR;
	}
}
