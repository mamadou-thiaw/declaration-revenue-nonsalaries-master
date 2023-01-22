package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.ReintegrationIS;

public interface ReintegrationISService {
	
	public List<ReintegrationIS> getReintegrationISs();

	public ReintegrationIS getReintegrationISById(Long id);

	public ReintegrationIS create(ReintegrationIS reintegrationIS);

	public boolean update(ReintegrationIS reintegrationIS);

	public boolean delete(ReintegrationIS reintegrationIS);

}
