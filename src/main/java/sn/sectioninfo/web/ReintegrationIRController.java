
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

import sn.sectioninfo.entities.ReintegrationIR;
import sn.sectioninfo.service.ReintegrationIRService;

@RestController
@CrossOrigin("*")
public class ReintegrationIRController {
	
	@Autowired
	private ReintegrationIRService reintegrationIRService ;
	
	@GetMapping("/ReintegrationIRs")
	public List<ReintegrationIR> getReintegrationIRs() {
		return reintegrationIRService.getReintegrationIRs();

	}
	
	@PostMapping(value = "/ReintegrationIR")
	public ReintegrationIR create(@RequestBody ReintegrationIR rir) {
		return reintegrationIRService.create(rir);
	}
	
	@PutMapping(value = "/ReintegrationIR")
	public boolean update(@RequestBody ReintegrationIR rir) {
		return reintegrationIRService.update(rir);
	}
	
	@DeleteMapping(value = "/ReintegrationIR")
	public boolean delete(@RequestBody ReintegrationIR rir) {
		return reintegrationIRService.delete(rir);
	}
}
