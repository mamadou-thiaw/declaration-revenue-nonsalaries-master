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

import sn.sectioninfo.entities.DeductionIR;
import sn.sectioninfo.service.DeductionIRService;

@RestController
@CrossOrigin("*")
public class DeductionIRController {
	
	@Autowired
	private DeductionIRService deductionIRService ;
	
	@GetMapping("/DeductionIRs")
	public List<DeductionIR> getDeductionIRs() {
		return deductionIRService.getDeductionIRs();

	}
	
	@PostMapping(value = "/DeductionIRs")
	public DeductionIR create(@RequestBody DeductionIR dir) {
		return deductionIRService.create(dir);
	}
	
	@PutMapping(value = "/DeductionIR")
	public boolean update(@RequestBody DeductionIR dir) {
		return deductionIRService.update(dir);
	}
	
	@DeleteMapping(value = "/DeductionIR")
	public boolean delete(@RequestBody DeductionIR dir) {
		return deductionIRService.delete(dir);
	}
}
