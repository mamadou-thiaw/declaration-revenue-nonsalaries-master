package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.ImpoSociete;
import sn.sectioninfo.entities.RevenusCapitauxMobiliers;

public interface RevenusCapitauxMobiliersService {
	
	public List<RevenusCapitauxMobiliers> getRevenusCapitauxMobiliers();

	public RevenusCapitauxMobiliers getRevenusCapitauxMobiliersById(Long id);

	public RevenusCapitauxMobiliers create(RevenusCapitauxMobiliers RevenusCapitauxMobiliers);

	public boolean update(RevenusCapitauxMobiliers RevenusCapitauxMobiliers);

	public boolean delete(RevenusCapitauxMobiliers RevenusCapitauxMobiliers);
	
	public List<RevenusCapitauxMobiliers> findRevenusCapitauxMobiliersByContribuable(Long id);

}
