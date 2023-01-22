package sn.sectioninfo.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//annotation jpa 
@Entity
public class Ref_Bancaire implements Serializable {
		@Id  
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long NumCpte;
	private String Banque;
	private int Code_Banque;
	private int Code_Guichet;
	private int Cle_RIB ;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="idDecla") //cle etranger
	private Contribuable contribuable;
	public Long getNumCpte() {
		return NumCpte;
	}
	public void setNumCpte(Long numCpte) {
		NumCpte = numCpte;
	}
	public String getBanque() {
		return Banque;
	}
	public void setBanque(String banque) {
		Banque = banque;
	}
	public int getCode_Banque() {
		return Code_Banque;
	}
	public void setCode_Banque(int code_Banque) {
		Code_Banque = code_Banque;
	}
	public int getCode_Guichet() {
		return Code_Guichet;
	}
	public void setCode_Guichet(int code_Guichet) {
		Code_Guichet = code_Guichet;
	}
	public int getClre_RIB() {
		return Cle_RIB;
	}
	public void setClre_RIB(int clre_RIB) {
		Cle_RIB = clre_RIB;
	}
	public Ref_Bancaire(String banque, int code_Banque, int code_Guichet, int cle_RIB) {
		super();
		Banque = banque;
		Code_Banque = code_Banque;
		Code_Guichet = code_Guichet;
		Cle_RIB = cle_RIB;
	}
	public Ref_Bancaire() {
		super();
		// TODO Auto-generated constructor stub
	}


}
