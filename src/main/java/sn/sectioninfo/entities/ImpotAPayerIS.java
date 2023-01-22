package sn.sectioninfo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImpotAPayerIS implements Serializable{
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idmp;
	private double m_ir_rs;
	private double ar;
	private double mpap;
	
	public ImpotAPayerIS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ImpotAPayerIS(double m_ir_rs, double ar, double mpap) {
		super();
		this.m_ir_rs = m_ir_rs;
		this.ar = ar;
		this.mpap = mpap;
	}

	public Long getIdmp() {
		return idmp;
	}

	public void setIdmp(Long idmp) {
		this.idmp = idmp;
	}

	public double getM_ir_rs() {
		return m_ir_rs;
	}

	public void setM_ir_rs(double m_ir_rs) {
		this.m_ir_rs = m_ir_rs;
	}

	public double getAr() {
		return ar;
	}

	public void setAr(double ar) {
		this.ar = ar;
	}

	public double getMpap() {
		return mpap;
	}

	public void setMpap(double mpap) {
		this.mpap = mpap;
	}
}
