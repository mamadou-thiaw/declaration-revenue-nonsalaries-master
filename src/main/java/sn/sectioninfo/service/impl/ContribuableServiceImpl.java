package sn.sectioninfo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.ContribuableRepository;
import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.service.ContribuableService;

@Service
public class ContribuableServiceImpl implements ContribuableService{

	@Autowired
	ContribuableRepository contribuableRepository;
	@Override
	public List<Contribuable> getContribuables() {
		
		return contribuableRepository.findAll();
	}

	@Override
	public Contribuable getContribuableById(Long id) {
		Optional<Contribuable> contribuable = contribuableRepository.findById(id);
		if(contribuable.isPresent()){
			return contribuable.get();
		}
		else {
			throw new ResourceNotFoundException("Contribuable not found with id : "+ id);
		}
		
		
	}

	@Override
	public Contribuable create(Contribuable contribuable) {
		
		return contribuableRepository.save(contribuable);
	}

	@Override
	public boolean update(Contribuable contribuable) {
		Optional<Contribuable> contribuableUpdate = contribuableRepository.findById(contribuable.getIdDecla());
		boolean isUpdated = false;
		if (contribuableUpdate.isPresent()) {
			contribuableRepository.save(contribuable);
			isUpdated = true;
		}
		return isUpdated;
	}

	@Override
	public boolean delete(Contribuable contribuable) {
		Optional<Contribuable> contribuableUpdate= contribuableRepository.findById(contribuable.getIdDecla());
		boolean isDelete = false;
		if(contribuableUpdate.isPresent()) {
			Contribuable contribuableToDelete = contribuableUpdate.get();
			contribuableRepository.delete(contribuableToDelete);
			isDelete = true;
		}
		return isDelete;
	}
	
	public Contribuable getContribuableByLoginAndPassword(String login,String password){
		return contribuableRepository.getContribuableByLoginAndPassword(login, password) ;
	}

}
