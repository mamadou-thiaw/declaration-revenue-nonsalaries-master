package sn.sectioninfo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.ImpoSociete;
import sn.sectioninfo.entities.RevenusCapitauxMobiliers;

public interface RevenusCapitauxMobiliersRepository extends JpaRepository<RevenusCapitauxMobiliers, Long>{
	List<RevenusCapitauxMobiliers> findRevenusCapitauxMobiliersByContribuable(Contribuable contribuable);
}
