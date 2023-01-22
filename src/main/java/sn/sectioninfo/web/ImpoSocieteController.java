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
import sn.sectioninfo.entities.ImpoSociete;
import sn.sectioninfo.service.ImpoSocieteService;
 

@RestController
@CrossOrigin("*")
public class ImpoSocieteController {
	
	@Autowired
	private ImpoSocieteService impotSocieteService ;
		
	@GetMapping("/ImpotsSocietes")
	public List<ImpoSociete> getImpotsSociete(){
			return impotSocieteService.getImpoSocietes();
	}
	
	@GetMapping(value = "/ImpotsSociete/{id}")
	public ImpoSociete getImpotSociete(@PathVariable(value = "id") Long id) {
		return impotSocieteService.getImpoSocieteById(id);
	}
	
	@PostMapping(value = "/ImpotsSociete")
	public ImpoSociete create(@RequestBody ImpoSociete is) {
		return impotSocieteService.create(is);
	}
	
	@PutMapping(value = "/ImpotsSociete")
	public boolean update(@RequestBody ImpoSociete is) {
		return impotSocieteService.update(is);
	}
	
	@DeleteMapping(value = "/ImpotsSociete")
	public boolean delete(@RequestBody ImpoSociete is) {
		return impotSocieteService.delete(is);
	}
	@GetMapping(value = "/ImpotsSocietes/contribuable/{id}")
	public List<ImpoSociete> getImpotsSocietesByContribuable(@PathVariable(value = "id") Long id){
		return impotSocieteService.getImpoSocietesByContribuable(id);
	}
	

}
