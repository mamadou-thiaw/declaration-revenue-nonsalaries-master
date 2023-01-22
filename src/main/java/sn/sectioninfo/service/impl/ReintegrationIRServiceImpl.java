package sn.sectioninfo.service.impl;
import sn.sectioninfo.service.ReintegrationIRService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.ReintegrationIRRepository;
import sn.sectioninfo.entities.ReintegrationIR;


@Service
public class ReintegrationIRServiceImpl implements ReintegrationIRService{

 

    @Autowired
    ReintegrationIRRepository reintegrationIRRepository;

 

    @Override
    public List<ReintegrationIR> getReintegrationIRs() {
        return reintegrationIRRepository.findAll();
    }

 

    @Override
    public ReintegrationIR getReintegrationIRById(Long id) {
        Optional<ReintegrationIR> reintegrationIR = reintegrationIRRepository.findById(id);
        if (reintegrationIR.isPresent()) {
            return reintegrationIR.get();

 

        } else {
            throw new ResourceNotFoundException("ReintegrationIR not found with id : " + id);
        }

 

    }

 

    @Override
    public ReintegrationIR create(ReintegrationIR reintegrationIR) {

 

        return reintegrationIRRepository.save(reintegrationIR);
    }

 

    @Override
    public boolean update(ReintegrationIR reintegrationIR) {
        Optional<ReintegrationIR> reintegrationIRUpdate = reintegrationIRRepository.findById(reintegrationIR.getIdReintIR());
        boolean isUpdated = false;
        if (reintegrationIRUpdate.isPresent()) {
            reintegrationIRRepository.save(reintegrationIR);
            isUpdated = true;
        }
        return isUpdated;
    }

 

    @Override
    public boolean delete(ReintegrationIR reintegrationIR) {
        Optional<ReintegrationIR> reintegrationIRUpdate = reintegrationIRRepository.findById(reintegrationIR.getIdReintIR());
        boolean isDeleted = false;
        if (reintegrationIRUpdate.isPresent()) {
            ReintegrationIR reintegrationIRToDelete = reintegrationIRUpdate.get();
            reintegrationIRRepository.delete(reintegrationIRToDelete);
            isDeleted = true;
        }
        return isDeleted;

 

    }

 

}