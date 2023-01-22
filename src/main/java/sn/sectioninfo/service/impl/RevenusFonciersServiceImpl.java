package sn.sectioninfo.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.RevenusFonciersRepository;
import sn.sectioninfo.entities.RevenusFonciers;
import sn.sectioninfo.service.RevenusFonciersService;

@Service
public class RevenusFonciersServiceImpl implements RevenusFonciersService{
	

	@Autowired
	RevenusFonciersRepository RevenusFonciersRepository;

	@Override
	public List<RevenusFonciers> getRevenusFonciers() {
		return RevenusFonciersRepository.findAll();
	}

	@Override
	public RevenusFonciers getRevenusFonciersById(Long id) {
		Optional<RevenusFonciers> RevenusFonciers = RevenusFonciersRepository.findById(id);
		if (RevenusFonciers.isPresent()) {
			return RevenusFonciers.get();

		} else {
			throw new ResourceNotFoundException("RevenusFonciers not found with id : " + id);
		}

	}

	@Override
	public RevenusFonciers create(RevenusFonciers RevenusFonciers) {
		return RevenusFonciersRepository.save(RevenusFonciers);
	}

	@Override
	public boolean update(RevenusFonciers RevenusFonciers) {
		Optional<RevenusFonciers> RevenusFonciersUpdate = RevenusFonciersRepository.findById(RevenusFonciers.getIdrevFonc());
		boolean isUpdated = false;
		if (RevenusFonciersUpdate.isPresent()) {
			RevenusFonciersRepository.save(RevenusFonciers);
			isUpdated = true;
		}
		return isUpdated;
	}

	@Override
	public boolean delete(RevenusFonciers RevenusFonciers) {
		Optional<RevenusFonciers> RevenusFonciersUpdate = RevenusFonciersRepository.findById(RevenusFonciers.getIdrevFonc());
		boolean isDeleted = false;
		if (RevenusFonciersUpdate.isPresent()) {
			RevenusFonciers RevenusFonciersToDelete = RevenusFonciersUpdate.get();
			RevenusFonciersRepository.delete(RevenusFonciersToDelete);
			isDeleted = true;
		}
		return isDeleted;

	}


}
