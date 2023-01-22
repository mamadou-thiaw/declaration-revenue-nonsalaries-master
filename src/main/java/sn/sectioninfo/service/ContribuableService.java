package sn.sectioninfo.service;


import java.util.List;

import org.springframework.data.repository.query.Param;

import sn.sectioninfo.entities.Contribuable;

public interface ContribuableService {
	
	public List<Contribuable> getContribuables();
	
	public Contribuable getContribuableById(Long id);
	
	public Contribuable create(Contribuable contribuable);
	
	public boolean update(Contribuable contribuable);
	
	public boolean delete(Contribuable contribuable);
	
	public Contribuable getContribuableByLoginAndPassword(String login,String password); 
	

}
