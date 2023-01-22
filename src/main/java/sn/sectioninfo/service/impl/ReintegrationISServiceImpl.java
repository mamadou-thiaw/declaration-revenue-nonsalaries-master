package sn.sectioninfo.service.impl;
import sn.sectioninfo.service.ReintegrationISService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.ReintegrationISRepository;
import sn.sectioninfo.entities.ReintegrationIS;


@Service
public class ReintegrationISServiceImpl implements ReintegrationISService{

 

    @Autowired
    ReintegrationISRepository reintegrationISRepository;

 

    @Override
    public List<ReintegrationIS> getReintegrationISs() {
        return reintegrationISRepository.findAll();
    }

 

    @Override
    public ReintegrationIS getReintegrationISById(Long id) {
        Optional<ReintegrationIS> reintegrationIS = reintegrationISRepository.findById(id);
        if (reintegrationIS.isPresent()) {
            return reintegrationIS.get();

 

        } else {
            throw new ResourceNotFoundException("ReintegrationIS not found with id : " + id);
        }

 

    }

 

    @Override
    public ReintegrationIS create(ReintegrationIS reintegrationIS) {

 

        return reintegrationISRepository.save(reintegrationIS);
    }

 

    @Override
    public boolean update(ReintegrationIS reintegrationIS) {
        Optional<ReintegrationIS> reintegrationISUpdate = reintegrationISRepository.findById(reintegrationIS.getIdReintIS());
        boolean isUpdated = false;
        if (reintegrationISUpdate.isPresent()) {
            reintegrationISRepository.save(reintegrationIS);
            isUpdated = true;
        }
        return isUpdated;
    }

 

    @Override
    public boolean delete(ReintegrationIS reintegrationIS) {
        Optional<ReintegrationIS> reintegrationISUpdate = reintegrationISRepository.findById(reintegrationIS.getIdReintIS());
        boolean isDeleted = false;
        if (reintegrationISUpdate.isPresent()) {
            ReintegrationIS reintegrationISToDelete = reintegrationISUpdate.get();
            reintegrationISRepository.delete(reintegrationISToDelete);
            isDeleted = true;
        }
        return isDeleted;

 

    }

 

}