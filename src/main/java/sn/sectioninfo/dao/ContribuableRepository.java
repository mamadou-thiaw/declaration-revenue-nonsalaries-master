package sn.sectioninfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sn.sectioninfo.entities.Contribuable;

public interface ContribuableRepository extends JpaRepository<Contribuable, Long>{
	
	//@Query("Select c from Contribuable where login=:x and password=:y")
	public Contribuable getContribuableByLoginAndPassword(String login,String password); 
	
}
