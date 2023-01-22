package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.BIC_BNC_BA;
import sn.sectioninfo.entities.Contribuable;

public interface BIC_BNC_BAService {
	
	public List<BIC_BNC_BA> getBIC_BNC_BAs();

	public BIC_BNC_BA getBIC_BNC_BAById(Long id);

	public BIC_BNC_BA create(BIC_BNC_BA bIC_BNC_BA);

	public boolean update(BIC_BNC_BA bIC_BNC_BA);

	public boolean delete(BIC_BNC_BA bIC_BNC_BA);
	public List<BIC_BNC_BA> getBIC_BNC_BAByContribuable(Long id);


}
