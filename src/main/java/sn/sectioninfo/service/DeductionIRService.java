package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.DeductionIR;

public interface DeductionIRService {
   
	 public List<DeductionIR> getDeductionIRs();
	 
	 public DeductionIR getDeductionById(Long id);
	 
	 public DeductionIR create(DeductionIR deductionIR);
	 
	 public boolean update(DeductionIR deductionIR);
	 
	 public boolean delete(DeductionIR deductionIR);
}
