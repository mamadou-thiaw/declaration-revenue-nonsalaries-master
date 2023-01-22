package sn.sectioninfo.service.impl;
import sn.sectioninfo.service.BIC_BNC_BAService;
import sn.sectioninfo.service.ContribuableService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.BIC_BNC_BARepository;
import sn.sectioninfo.entities.BIC_BNC_BA;
import sn.sectioninfo.entities.Contribuable;


@Service
public class BIC_BNC_BAServiceImpl implements BIC_BNC_BAService{
 
	@Autowired
	ContribuableService contribuableService;

	@Autowired
	BIC_BNC_BARepository bIC_BNC_BARepository;

	@Override
	public List<BIC_BNC_BA> getBIC_BNC_BAs() {
		return bIC_BNC_BARepository.findAll();
	}

	@Override
	public BIC_BNC_BA getBIC_BNC_BAById(Long id) {
		Optional<BIC_BNC_BA> bIC_BNC_BA = bIC_BNC_BARepository.findById(id);
		if (bIC_BNC_BA.isPresent()) {
			return bIC_BNC_BA.get();

		} else {
			throw new ResourceNotFoundException("BIC_BNC_BA not found with id : " + id);
		}

	}

	@Override
	public BIC_BNC_BA create(BIC_BNC_BA bIC_BNC_BA) {

		return bIC_BNC_BARepository.save(bIC_BNC_BA);
	}

	@Override
	public boolean update(BIC_BNC_BA bIC_BNC_BA) {
		Optional<BIC_BNC_BA> bIC_BNC_BAUpdate = bIC_BNC_BARepository.findById(bIC_BNC_BA.getBic_bnc_ba());
		boolean isUpdated = false;
		if (bIC_BNC_BAUpdate.isPresent()) {
			bIC_BNC_BARepository.save(bIC_BNC_BA);
			isUpdated = true;
		}
		return isUpdated;
	}

	@Override
	public boolean delete(BIC_BNC_BA bIC_BNC_BA) {
		Optional<BIC_BNC_BA> bIC_BNC_BAUpdate = bIC_BNC_BARepository.findById(bIC_BNC_BA.getBic_bnc_ba());
		boolean isDeleted = false;
		if (bIC_BNC_BAUpdate.isPresent()) {
			BIC_BNC_BA bIC_BNC_BAToDelete = bIC_BNC_BAUpdate.get();
			bIC_BNC_BARepository.delete(bIC_BNC_BAToDelete);
			isDeleted = true;
		}
		return isDeleted;

	}
	@Override
	public List<BIC_BNC_BA> getBIC_BNC_BAByContribuable(Long id){
		Contribuable contribuable = contribuableService.getContribuableById(id);
		return bIC_BNC_BARepository.findBIC_BNC_BAByContribuable(contribuable);
		
	}


}