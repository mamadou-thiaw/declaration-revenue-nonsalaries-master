package sn.sectioninfo.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.ImpotAPayerISRepository;
import sn.sectioninfo.entities.ImpotAPayerIS;
import sn.sectioninfo.service.ImpotAPayerISService;

@Service
public class ImpoAPayerISServiceImpl implements ImpotAPayerISService{

	@Autowired
	ImpotAPayerISRepository impo_payer;
	
	@Override
	public List<ImpotAPayerIS> getImpoAPayerISs() {
		// TODO Auto-generated method stub
		return impo_payer.findAll();
	}

	@Override
	public ImpotAPayerIS getImpoAPayer(Long id) {
		// TODO Auto-generated method stub
		 Optional<ImpotAPayerIS> impoapayer = impo_payer.findById(id);
	        if (impoapayer.isPresent()) {
	            return impoapayer.get();
	        } else {
	            throw new ResourceNotFoundException("ImpoAPayer not found with id : " + id);
	        }
	}

	@Override
	public ImpotAPayerIS create(ImpotAPayerIS impoapayer) {
		// TODO Auto-generated method stub
		return impo_payer.save(impoapayer);
	}

	@Override
	public boolean update(ImpotAPayerIS impoapayer) {
		// TODO Auto-generated method stub
		Optional<ImpotAPayerIS> impoapayerUpdate = impo_payer.findById(impoapayer.getIdmp());
        boolean isUpdated = false;
        if (impoapayerUpdate.isPresent()) {
            impo_payer.save(impoapayer);
            isUpdated = true;
        }
        return isUpdated;
      }

	@Override
	public boolean delete(ImpotAPayerIS impoapayer) {
		// TODO Auto-generated method stub
		Optional<ImpotAPayerIS> impoapayerDelete = impo_payer.findById(impoapayer.getIdmp());
        boolean isDeleted = false;
        if (impoapayerDelete.isPresent()) {
            ImpotAPayerIS impoapayerToDelete = impoapayerDelete.get();
            impo_payer.delete(impoapayerToDelete);
            isDeleted = true;
        }
        return isDeleted;
	}

}
