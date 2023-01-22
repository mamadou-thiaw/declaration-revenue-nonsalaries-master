package sn.sectioninfo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.ImpoSocieteRepository;
import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.ImpoSociete;
import sn.sectioninfo.service.ContribuableService;
import sn.sectioninfo.service.ImpoSocieteService;


@Service
public class ImpoSocieteServiceImpl implements ImpoSocieteService{

	@Autowired
	ImpoSocieteRepository imposociete;
	@Autowired
	ContribuableService contribuableService;
	@Override
	public List<ImpoSociete> getImpoSocietes() {
		// TODO Auto-generated method stub
		return imposociete.findAll();
	}

	@Override
	public ImpoSociete getImpoSocieteById(Long id) {
		 Optional<ImpoSociete> imposocietes = imposociete.findById(id);
	        if (imposocietes.isPresent()) {
	            return imposocietes.get();
	        } else {
	            throw new ResourceNotFoundException("ImpoSociete not found with id : " + id);
	        }
	}

	@Override
	public ImpoSociete create(ImpoSociete nvimposociete) {
		// TODO Auto-generated method stub
		return imposociete.save(nvimposociete);
	}

	@Override
	public boolean update(ImpoSociete imposocietes) {
		// TODO Auto-generated method stub
		Optional<ImpoSociete> imposocieteUpdate = imposociete.findById(imposocietes.getIdIS());
        boolean isUpdated = false;
        if (imposocieteUpdate.isPresent()) {
            imposociete.save(imposocietes);
            isUpdated = true;
        }
        return isUpdated;
	}

	@Override
	public boolean delete(ImpoSociete imposocietes) {
		// TODO Auto-generated method stub
		Optional<ImpoSociete> imposocieteDelete = imposociete.findById(imposocietes.getIdIS());
        boolean isDeleted = false;
        if (imposocieteDelete.isPresent()) {
            ImpoSociete imposocieteToDelete = imposocieteDelete.get();
            imposociete.delete(imposocieteToDelete);
            isDeleted = true;
        }
        return isDeleted;
	}
	@Override
	public List<ImpoSociete> getImpoSocietesByContribuable(Long id){
		Contribuable contribuable = contribuableService.getContribuableById(id);
		return imposociete.findImpoSocietesByContribuable(contribuable);
		
	}


}
