package sn.sectioninfo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.RevenusCapitauxMobiliersRepository;
import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.ImpoSociete;
import sn.sectioninfo.entities.RevenusCapitauxMobiliers;
import sn.sectioninfo.service.ContribuableService;
import sn.sectioninfo.service.RevenusCapitauxMobiliersService;

@Service
public class RevenusCapitauxMobiliersServiceImpl implements RevenusCapitauxMobiliersService{

	@Autowired
	RevenusCapitauxMobiliersRepository revenusCapitauxMobiliersRepository;
	
	@Autowired
	private ContribuableService contribuableService ;
	

	@Override
	public List<RevenusCapitauxMobiliers> getRevenusCapitauxMobiliers() {
		return revenusCapitauxMobiliersRepository.findAll();
	}

	@Override
	public RevenusCapitauxMobiliers getRevenusCapitauxMobiliersById(Long id) {
		Optional<RevenusCapitauxMobiliers> RevenusCapitauxMobiliers = revenusCapitauxMobiliersRepository.findById(id);
		if (RevenusCapitauxMobiliers.isPresent()) {
			return RevenusCapitauxMobiliers.get();

		} else {
			throw new ResourceNotFoundException("RevenusCapitauxMobiliers not found with id : " + id);
		}

	}

	@Override
	public RevenusCapitauxMobiliers create(RevenusCapitauxMobiliers RevenusCapitauxMobiliers) {

		return revenusCapitauxMobiliersRepository.save(RevenusCapitauxMobiliers);
	}

	@Override
	public boolean update(RevenusCapitauxMobiliers RevenusCapitauxMobiliers) {
		Optional<RevenusCapitauxMobiliers> RevenusCapitauxMobiliersUpdate = revenusCapitauxMobiliersRepository.findById(RevenusCapitauxMobiliers.getIdRCM());
		boolean isUpdated = false;
		if (RevenusCapitauxMobiliersUpdate.isPresent()) {
			revenusCapitauxMobiliersRepository.save(RevenusCapitauxMobiliers);
			isUpdated = true;
		}
		return isUpdated;
	}

	@Override
	public boolean delete(RevenusCapitauxMobiliers RevenusCapitauxMobiliers) {
		Optional<RevenusCapitauxMobiliers> RevenusCapitauxMobiliersUpdate = revenusCapitauxMobiliersRepository.findById(RevenusCapitauxMobiliers.getIdRCM());
		boolean isDeleted = false;
		if (RevenusCapitauxMobiliersUpdate.isPresent()) {
			RevenusCapitauxMobiliers RevenusCapitauxMobiliersToDelete = RevenusCapitauxMobiliersUpdate.get();
			revenusCapitauxMobiliersRepository.delete(RevenusCapitauxMobiliersToDelete);
			isDeleted = true;
		}
		return isDeleted;
	}
	
	public List<RevenusCapitauxMobiliers> findRevenusCapitauxMobiliersByContribuable(Long id){
		Contribuable contribuable = contribuableService.getContribuableById(id) ;
		return revenusCapitauxMobiliersRepository.findRevenusCapitauxMobiliersByContribuable(contribuable);
	}


}
