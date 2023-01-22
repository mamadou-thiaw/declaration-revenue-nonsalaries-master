package sn.sectioninfo.service;

import java.util.List;

import sn.sectioninfo.entities.ResultatFiscaleIS;

public interface ResultatFiscaleISService {
	
	public List<ResultatFiscaleIS> getResultatFiscaleISs();

	public ResultatFiscaleIS getResultatFiscaleISById(Long id);

	public ResultatFiscaleIS create(ResultatFiscaleIS resultatFiscaleIS);

	public boolean update(ResultatFiscaleIS resultatFiscaleIS);

	public boolean delete(ResultatFiscaleIS resultatFiscaleIS);

}
