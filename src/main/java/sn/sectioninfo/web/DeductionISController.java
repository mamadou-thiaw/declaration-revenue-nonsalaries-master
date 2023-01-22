package sn.sectioninfo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.DeductionIS;
import sn.sectioninfo.service.DeductionISService;

@RestController
@CrossOrigin("*")
public class DeductionISController {
	
	@Autowired
	private DeductionISService deductionSIService ;
	
	@PostMapping(value = "/DeductionISs")
	public DeductionIS create(@RequestBody DeductionIS dis) {
		return deductionSIService.create(dis);
	}
	
	@PutMapping(value = "/DeductionIS")
	public boolean update(@RequestBody DeductionIS dis) {
		return deductionSIService.update(dis);
	}
	
	@DeleteMapping(value = "/DeductionIS")
	public boolean delete(@RequestBody DeductionIS dis) {
		return deductionSIService.delete(dis);
	}
	@GetMapping("/DeductionIS")
	public List<DeductionIS> getDeductionISs(){
			return deductionSIService.getDeductionISs();
	}
	
	@GetMapping(value = "/DeductionIS/{id}")
	public DeductionIS getDeductionIS(@PathVariable(value = "id") Long id) {
		return deductionSIService.getDeductionISById(id);
	}
}
