package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.RevenusFonciers;

public interface RevenusFonciersService {
	
	public List<RevenusFonciers> getRevenusFonciers();

	public RevenusFonciers getRevenusFonciersById(Long id);

	public RevenusFonciers create(RevenusFonciers RevenusFonciers);

	public boolean update(RevenusFonciers RevenusFonciers);

	public boolean delete(RevenusFonciers RevenusFonciers);

}
