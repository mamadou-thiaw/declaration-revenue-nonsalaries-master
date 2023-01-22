package sn.sectioninfo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeductionIR implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idD;
	private double PCND;
	private double PVE;
	private double AD;
	private double DIB;
	private double DTCI;
	public DeductionIR() {
		super();
	}
	public DeductionIR(double pCND, double pVE, double aD, double dIB, double dTCI) {
		super();
		PCND = pCND;
		PVE = pVE;
		AD = aD;
		DIB = dIB;
		DTCI = dTCI;
	}
	public Long getIdD() {
		return idD;
	}
	public void setIdD(Long idD) {
		this.idD = idD;
	}
	public double getPCND() {
		return PCND;
	}
	public void setPCND(double pCND) {
		PCND = pCND;
	}
	public double getPVE() {
		return PVE;
	}
	public void setPVE(double pVE) {
		PVE = pVE;
	}
	public double getAD() {
		return AD;
	}
	public void setAD(double aD) {
		AD = aD;
	}
	public double getDIB() {
		return DIB;
	}
	public void setDIB(double dIB) {
		DIB = dIB;
	}
	public double getDTCI() {
		return DTCI;
	}
	public void setDTCI(double dTCI) {
		DTCI = dTCI;
	}
	
	

}
