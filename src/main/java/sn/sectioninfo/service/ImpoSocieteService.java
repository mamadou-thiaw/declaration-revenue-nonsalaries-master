package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.ImpoSociete;

public interface ImpoSocieteService {

	public List<ImpoSociete> getImpoSocietes();

	public ImpoSociete getImpoSocieteById(Long id);
	
	public ImpoSociete create(ImpoSociete imposociete);
	
	public boolean update(ImpoSociete imposociete);
	
	public boolean delete(ImpoSociete imposociete);
	
	public 	List<ImpoSociete> getImpoSocietesByContribuable(Long id);

}
