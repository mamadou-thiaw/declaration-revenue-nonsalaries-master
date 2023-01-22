package sn.sectioninfo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.sectioninfo.entities.BIC_BNC_BA;
import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.ImpoSociete;

public interface BIC_BNC_BARepository extends JpaRepository<BIC_BNC_BA, Long>{
	List<BIC_BNC_BA> findBIC_BNC_BAByContribuable(Contribuable contribuable);


}
