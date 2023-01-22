package sn.sectioninfo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.sectioninfo.entities.ResultatFiscaleIS;
import sn.sectioninfo.service.ResultatFiscaleISService;

@RestController
@CrossOrigin("*")
public class ResultatFiscaleISController {
	
	@Autowired
	private ResultatFiscaleISService resultatFiscalISService ;
	
	@PostMapping(value = "/ResultatFiscaleISs")
	public ResultatFiscaleIS create(@RequestBody ResultatFiscaleIS rfis) {
		return resultatFiscalISService.create(rfis) ;
	}
	
	@PutMapping(value = "/ResultatFiscaleIS")
	public boolean update(@RequestBody ResultatFiscaleIS rfis) {
		return resultatFiscalISService.update(rfis) ;
	}
	
	@DeleteMapping(value = "/ResultatFiscaleIS")
	public boolean delete(@RequestBody ResultatFiscaleIS rfis) {
		return resultatFiscalISService.delete(rfis) ;
	}
}
