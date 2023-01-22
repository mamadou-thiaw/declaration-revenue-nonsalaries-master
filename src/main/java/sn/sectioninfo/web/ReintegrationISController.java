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

import sn.sectioninfo.entities.ReintegrationIS;
import sn.sectioninfo.service.ReintegrationISService;

@RestController
@CrossOrigin("*")
public class ReintegrationISController {
	
	@Autowired
	private ReintegrationISService reintegrationISService ;
	
	@GetMapping("/ReintegrationISs")
	public List<ReintegrationIS> getReintegrationISs() {
		return reintegrationISService.getReintegrationISs();

	}
	
	@PostMapping(value = "/ReintegrationISs")
	public ReintegrationIS create(@RequestBody ReintegrationIS ris) {
		return reintegrationISService.create(ris);
	}
	
	@PutMapping(value = "/ReintegrationIS")
	public boolean update(@RequestBody ReintegrationIS ris) {
		return reintegrationISService.update(ris);
	}
	
	@DeleteMapping(value = "/ReintegrationIS")
	public boolean delete(@RequestBody ReintegrationIS ris) {
		return reintegrationISService.delete(ris);
	}
}
