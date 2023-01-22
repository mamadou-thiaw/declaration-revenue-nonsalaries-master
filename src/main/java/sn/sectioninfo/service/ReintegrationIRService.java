package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.ReintegrationIR;

public interface ReintegrationIRService {
	
	public List<ReintegrationIR> getReintegrationIRs();

	public ReintegrationIR getReintegrationIRById(Long id);

	public ReintegrationIR create(ReintegrationIR reintegrationIR);

	public boolean update(ReintegrationIR reintegrationIR);

	public boolean delete(ReintegrationIR reintegrationIR);

}