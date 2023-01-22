package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.ImpotAPayerIS;

public interface ImpotAPayerISService {

	
	public List<ImpotAPayerIS> getImpoAPayerISs();

	public ImpotAPayerIS getImpoAPayer(Long id);
	
	public ImpotAPayerIS create(ImpotAPayerIS impoapayer);
	
	public boolean update(ImpotAPayerIS impoapayer);
	
	public boolean delete(ImpotAPayerIS impoapayer);
}
