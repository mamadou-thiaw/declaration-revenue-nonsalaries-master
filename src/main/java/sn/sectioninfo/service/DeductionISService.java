package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.DeductionIS;

public interface DeductionISService {
public List<DeductionIS> getDeductionISs();
	
	public DeductionIS getDeductionISById(Long id);
	
	public DeductionIS create(DeductionIS deductionIS);
	
	public boolean update(DeductionIS deductionIS);
	
	public boolean delete(DeductionIS deductionIS);

}
