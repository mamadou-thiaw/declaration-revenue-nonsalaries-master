package sn.sectioninfo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contribuable implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDecla;
	private String login;
	private String password ;
	private String prenom;
	private String nom;
	private String email;
	private String tel;
	private boolean APCE;
	private String activitePrincipale;
	private String adresse;
	 	//@OneToMany(mappedBy = "contribuable")
	//private Collection<Ref_Bancaire> refBancaire;
	//	@OneToMany(mappedBy = "contribuable")
	//private Collection<ImpoSociete> impotSociete;
	//	@OneToMany(mappedBy = "contribuable")
	//private Collection<RevenusFonciers> revenusFonciers;
	//	@OneToMany(mappedBy = "contribuable")
	//private Collection<RevenusCapitauxMobiliers> rcm;
	//mappping a BIC_BNC_BA
	//	@OneToMany(mappedBy = "contribuable")
	//private Collection<BIC_BNC_BA> bic_bnc_ba;
	

	public Long getIdDecla() {
		return idDecla;
	}
	public void setIdDecla(Long idDecla) {
		this.idDecla = idDecla;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isAPCE() {
		return APCE;
	}
	public void setAPCE(boolean aPCE) {
		APCE = aPCE;
	}
	public String getActivitePrincipale() {
		return activitePrincipale;
	}
	public void setActivitePrincipale(String activitePrincipale) {
		this.activitePrincipale = activitePrincipale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Contribuable(String login, String password, String prenom, String nom, String email, String tel,
			boolean aPCE, String activitePrincipale, String adresse) {
		super();
		this.login = login;
		this.password = password;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.tel = tel;
		APCE = aPCE;
		this.activitePrincipale = activitePrincipale;
		this.adresse = adresse;
	}
	public Contribuable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/*
	 * public Contribuable(String login, String password, String prenom, String nom,
	 * String email, String tel, boolean aPCE, String activitePrincipale, String
	 * adresse, Collection<Ref_Bancaire> refBancaire, Collection<ImpoSociete>
	 * impotSociete, Collection<RevenusFonciers> revenusFonciers,
	 * Collection<RevenusCapitauxMobiliers> rcm, Collection<BIC_BNC_BA> bic_bnc_ba)
	 * { super(); this.login = login; this.password = password; this.prenom =
	 * prenom; this.nom = nom; this.email = email; this.tel = tel; APCE = aPCE;
	 * this.activitePrincipale = activitePrincipale; this.adresse = adresse;
	 * this.refBancaire = refBancaire; this.impotSociete = impotSociete;
	 * this.revenusFonciers = revenusFonciers; this.rcm = rcm; this.bic_bnc_ba =
	 * bic_bnc_ba; }
	 */

	/*
	 * public Collection<Ref_Bancaire> getRefBancaire() { return refBancaire; }
	 */
	/*
	 * public void setRefBancaire(Collection<Ref_Bancaire> refBancaire) {
	 * this.refBancaire = refBancaire; } public Collection<ImpoSociete>
	 * getImpotSociete() { return impotSociete; } public void
	 * setImpotSociete(Collection<ImpoSociete> impotSociete) { this.impotSociete =
	 * impotSociete; } public Collection<RevenusFonciers> getRevenusFonciers() {
	 * return revenusFonciers; } public void
	 * setRevenusFonciers(Collection<RevenusFonciers> revenusFonciers) {
	 * this.revenusFonciers = revenusFonciers; } public
	 * Collection<RevenusCapitauxMobiliers> getRcm() { return rcm; } public void
	 * setRcm(Collection<RevenusCapitauxMobiliers> rcm) { this.rcm = rcm; } public
	 * Collection<BIC_BNC_BA> getBic_bnc_ba() { return bic_bnc_ba; } public void
	 * setBic_bnc_ba(Collection<BIC_BNC_BA> bic_bnc_ba) { this.bic_bnc_ba =
	 * bic_bnc_ba; }
	 */
	
	
	
	
}
