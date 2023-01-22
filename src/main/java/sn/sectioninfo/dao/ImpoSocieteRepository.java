package sn.sectioninfo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.ImpoSociete;


public interface ImpoSocieteRepository extends JpaRepository<ImpoSociete, Long>{
	List<ImpoSociete> findImpoSocietesByContribuable(Contribuable contribuable);

}
