package sn.sectioninfo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.DeductionIRRepository;
import sn.sectioninfo.entities.DeductionIR;
import sn.sectioninfo.service.DeductionIRService;

@Service
public class DeductionIRImpl implements DeductionIRService {
    
	@Autowired
	DeductionIRRepository deductionIRRepository;
	@Override
	public List<DeductionIR> getDeductionIRs() {
		
		return deductionIRRepository.findAll();
	}

	@Override
	public DeductionIR getDeductionById(Long id) {
		Optional<DeductionIR> deductionIR = deductionIRRepository.findById(id);
		if(deductionIR.isPresent()){
			return deductionIR.get();
		}
		else {
			throw new ResourceNotFoundException("deductionIR not found with id : "+ id);
		}
		
	}

	@Override
	public DeductionIR create(DeductionIR deductionIR) {
		
		return deductionIRRepository.save(deductionIR);
	}

	@Override
	public boolean update(DeductionIR deductionIR) {
		Optional<DeductionIR> deductionIRUpdate = deductionIRRepository.findById(deductionIR.getIdD());
		boolean isUpdated = false;
		if (deductionIRUpdate.isPresent()) {
			deductionIRRepository.save(deductionIR);
			isUpdated = true;
		}
		return isUpdated;
		
	}

	@Override
	public boolean delete(DeductionIR deductionIR) {
		
		Optional<DeductionIR> deductionIRUpdate = deductionIRRepository.findById(deductionIR.getIdD());
		boolean isDeleted = false;
		if (deductionIRUpdate.isPresent()) {
			DeductionIR deductionIRToUpdate = deductionIRUpdate.get();
			deductionIRRepository.delete(deductionIRToUpdate);
			isDeleted = true;
		}
		return isDeleted;
	}

}
