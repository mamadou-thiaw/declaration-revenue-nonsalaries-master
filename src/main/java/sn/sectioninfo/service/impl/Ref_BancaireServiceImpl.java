package sn.sectioninfo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.Ref_BancaireRepository;
import sn.sectioninfo.entities.Ref_Bancaire;
import sn.sectioninfo.service.Ref_BancaireService;

@Service
public class Ref_BancaireServiceImpl implements Ref_BancaireService{
	
	@Autowired
	Ref_BancaireRepository ref_bancaire;

	@Override
	public List<Ref_Bancaire> getRef_Bancaires() {
		// TODO Auto-generated method stub
		return ref_bancaire.findAll();
	}

	@Override
	public Ref_Bancaire getRef_BancaireById(Long id) {
		// TODO Auto-generated method stub
		 Optional<Ref_Bancaire> ref_banque = ref_bancaire.findById(id);
	        if (ref_banque.isPresent()) {
	            return ref_banque.get();
	        } else {
	            throw new ResourceNotFoundException("Ref_Banquaire not found with id : " + id);
	        }

	}

	@Override
	public Ref_Bancaire create(Ref_Bancaire nvref_bancaire) {
		// TODO Auto-generated method stub
		return ref_bancaire.save(nvref_bancaire);
	}

	@Override
	public boolean update(Ref_Bancaire ref_bancaires) {
		// TODO Auto-generated method stub
		Optional<Ref_Bancaire> ref_banqueUpdate = ref_bancaire.findById(ref_bancaires.getNumCpte());
        boolean isUpdated = false;
        if (ref_banqueUpdate.isPresent()) {
            ref_bancaire.save(ref_bancaires);
            isUpdated = true;
        }
        return isUpdated;
	}

	@Override
	public boolean delete(Ref_Bancaire ref_bancaires) {
		// TODO Auto-generated method stub
		Optional<Ref_Bancaire> ref_banqueDelete = ref_bancaire.findById(ref_bancaires.getNumCpte());
        boolean isDeleted = false;
        if (ref_banqueDelete.isPresent()) {
            Ref_Bancaire ref_banqueToDelete = ref_banqueDelete.get();
            ref_bancaire.delete(ref_banqueToDelete);
            isDeleted = true;
        }
        return isDeleted;
	}

}
