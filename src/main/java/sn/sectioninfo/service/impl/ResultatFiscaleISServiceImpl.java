package sn.sectioninfo.service.impl;
import sn.sectioninfo.service.ResultatFiscaleISService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import sn.sectioninfo.dao.ResultatFiscalISRepository;
import sn.sectioninfo.entities.ResultatFiscaleIS;


@Service
public class ResultatFiscaleISServiceImpl implements ResultatFiscaleISService{

 

    @Autowired
    ResultatFiscalISRepository resultatFiscaleISRepository;

 

    @Override
    public List<ResultatFiscaleIS> getResultatFiscaleISs() {
        return resultatFiscaleISRepository.findAll();
    }

 

    @Override
    public ResultatFiscaleIS getResultatFiscaleISById(Long id) {
        Optional<ResultatFiscaleIS> resultatFiscaleIS = resultatFiscaleISRepository.findById(id);
        if (resultatFiscaleIS.isPresent()) {
            return resultatFiscaleIS.get();

 

        } else {
            throw new ResourceNotFoundException("ResultatFiscaleIS not found with id : " + id);
        }

 

    }

 

    @Override
    public ResultatFiscaleIS create(ResultatFiscaleIS resultatFiscaleIS) {

 

        return resultatFiscaleISRepository.save(resultatFiscaleIS);
    }

 

    @Override
    public boolean update(ResultatFiscaleIS resultatFiscaleIS) {
        Optional<ResultatFiscaleIS> resultatFiscaleISUpdate = resultatFiscaleISRepository.findById(resultatFiscaleIS.getIdRs());
        boolean isUpdated = false;
        if (resultatFiscaleISUpdate.isPresent()) {
            resultatFiscaleISRepository.save(resultatFiscaleIS);
            isUpdated = true;
        }
        return isUpdated;
    }

 

    @Override
    public boolean delete(ResultatFiscaleIS resultatFiscaleIS) {
        Optional<ResultatFiscaleIS> resultatFiscaleISUpdate = resultatFiscaleISRepository.findById(resultatFiscaleIS.getIdRs());
        boolean isDeleted = false;
        if (resultatFiscaleISUpdate.isPresent()) {
            ResultatFiscaleIS resultatFiscaleISToDelete = resultatFiscaleISUpdate.get();
            resultatFiscaleISRepository.delete(resultatFiscaleISToDelete);
            isDeleted = true;
        }
        return isDeleted;

 

    }

 

}