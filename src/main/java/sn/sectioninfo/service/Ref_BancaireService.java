package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.Ref_Bancaire;


public interface Ref_BancaireService {

	
	public List<Ref_Bancaire> getRef_Bancaires();

	public Ref_Bancaire getRef_BancaireById(Long id);
	
	public Ref_Bancaire create(Ref_Bancaire ref_bancaire);
	
	public boolean update(Ref_Bancaire ref_bancaire);
	
	public boolean delete(Ref_Bancaire ref_bancaire);
}
