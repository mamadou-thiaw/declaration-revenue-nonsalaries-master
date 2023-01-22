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
import sn.sectioninfo.entities.BIC_BNC_BA;
import sn.sectioninfo.service.BIC_BNC_BAService;
 
@RestController
@CrossOrigin("*")
public class BIC_BNC_BAController {
	
		@Autowired
	private BIC_BNC_BAService bnc_bic_baService ;
		
	
	@GetMapping("/BIC_BNC_BAs")
	public List<BIC_BNC_BA> getBIC_BNC_BA(){
			return bnc_bic_baService.getBIC_BNC_BAs();
	}
	
	@GetMapping(value = "/BIC_BNC_BA/{id}")
	public BIC_BNC_BA getBIC_BNC_BA(@PathVariable(value = "id") Long id) {
		return bnc_bic_baService.getBIC_BNC_BAById(id);
	}
	
	@PostMapping(value = "/BIC_BNC_BA")
	public BIC_BNC_BA create(@RequestBody BIC_BNC_BA bnc_bic) {
		return bnc_bic_baService.create(bnc_bic);
	}
	
	@PutMapping(value = "/BIC_BNC_BA")
	public boolean update(@RequestBody BIC_BNC_BA bnc_bic) {
		return bnc_bic_baService.update(bnc_bic);
	}
	
	@DeleteMapping(value = "/BIC_BNC_BA")
	public boolean delete(@RequestBody BIC_BNC_BA bnc_bic) {
		return bnc_bic_baService.delete(bnc_bic);
	}
	@GetMapping(value = "/BIC_BNC_BA/contribuable/{id}")
	public List<BIC_BNC_BA> getBIC_BNC_BAByContribuable(@PathVariable(value = "id") Long id) {
		return bnc_bic_baService.getBIC_BNC_BAByContribuable(id);
	}

}
