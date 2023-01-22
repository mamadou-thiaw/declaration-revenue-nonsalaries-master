package sn.sectioninfo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.sectioninfo.entities.ImpotAPayerIS;
import sn.sectioninfo.service.ImpotAPayerISService;

@RestController
@CrossOrigin("*")
public class ImpotAPayerController {
	
	@Autowired
	private ImpotAPayerISService impotAPayerISService ;
	
	@GetMapping("/ImpotAPayers")
	public List<ImpotAPayerIS> getImpotAPayers() {
		return impotAPayerISService.getImpoAPayerISs();

	}
	
	@PostMapping(value = "/ImpotAPayerIS")
	public ImpotAPayerIS create(@RequestBody ImpotAPayerIS impis) {
		return impotAPayerISService.create(impis);
	}
	
	@PutMapping(value = "/ImpotAPayerIS")
	public boolean update(@RequestBody ImpotAPayerIS impis) {
		return impotAPayerISService.update(impis);
	}
	
	@DeleteMapping(value = "/ImpotAPayerIS")
	public boolean delete(@RequestBody ImpotAPayerIS impis) {
		return impotAPayerISService.delete(impis);
	}
}
