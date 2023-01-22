package sn.sectioninfo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReintegrationIR implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReintIR;
	private double ANDIR;
	private double PCND;
	private double FNDL;
	private double DSND;
	private double AR;
	
	public ReintegrationIR() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReintegrationIR(double aND, double pCND, double fNDL, double dSND, double aR) {
		super();
		ANDIR = aND;
		PCND = pCND;
		FNDL = fNDL;
		DSND = dSND;
		AR = aR;
	}
	public Long getIdReintIR() {
		return idReintIR;
	}
	public void setIdReintIS(Long idReint) {
		this.idReintIR = idReint;
	}
	public double getANDIR() {
		return ANDIR;
	}
	public void setANDIR(double aND) {
		ANDIR = aND;
	}
	public Long getIdReint() {
		return idReintIR;
	}
	public void setIdReint(Long idReint) {
		this.idReintIR = idReint;
	}
	public double getAND() {
		return ANDIR;
	}
	public void setAND(double aND) {

		ANDIR = aND;
	}
	public double getPCND() {
		return PCND;
	}
	public void setPCND(double pCND) {
		PCND = pCND;
	}
	public double getFNDL() {
		return FNDL;
	}
	public void setFNDL(double fNDL) {
		FNDL = fNDL;
	}
	public double getDSND() {
		return DSND;
	}
	public void setDSND(double dSND) {
		DSND = dSND;
	}
	public double getAR() {
		return AR;
	}
	public void setAR(double aR) {
		AR = aR;
	}
}
