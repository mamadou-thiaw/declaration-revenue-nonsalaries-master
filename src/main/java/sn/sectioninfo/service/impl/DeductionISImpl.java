package sn.sectioninfo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.DeductionISRepository;
import sn.sectioninfo.entities.DeductionIS;
import sn.sectioninfo.service.DeductionISService;

@Service
public class DeductionISImpl implements DeductionISService{

	@Autowired
	DeductionISRepository deductionISRepository;
	@Override
	public List<DeductionIS> getDeductionISs() {
		
		return deductionISRepository.findAll();
	}

	@Override
	public DeductionIS getDeductionISById(Long id) {
		Optional<DeductionIS> deductionIS = deductionISRepository.findById(id);
		if (deductionIS.isPresent()) {
			return deductionIS.get();

		} else {
			throw new ResourceNotFoundException("DeductionIS not found with id : " + id);
		}

	}

	@Override
	public DeductionIS create(DeductionIS deductionIS) {
		return deductionISRepository.save(deductionIS);
	}

	@Override
	public boolean update(DeductionIS deductionIS) {
		
		Optional<DeductionIS> deductionISUpdate = deductionISRepository.findById(deductionIS.getIdD());
		boolean isUpdated = false;
		if (deductionISUpdate.isPresent()) {
			deductionISRepository.save(deductionIS);
			isUpdated = true;
		}
		return isUpdated;
	}

	@Override
	public boolean delete(DeductionIS deductionIS) {
		Optional<DeductionIS> deductionISUpdate = deductionISRepository.findById(deductionIS.getIdD());
		boolean isDeleted = false;
		if (deductionISUpdate.isPresent()) {
			DeductionIS deductionISToDelete = deductionISUpdate.get();
			deductionISRepository.delete(deductionISToDelete);
			isDeleted = true;
		}
		return isDeleted;

	}
	

}
