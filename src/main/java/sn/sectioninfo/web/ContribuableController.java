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
import sn.sectioninfo.service.ContribuableService;

@RestController
@CrossOrigin("*")
public class ContribuableController {
	
	@Autowired
	private ContribuableService contribuableService;
	
	@GetMapping("/Contribuables")
	public List<Contribuable> getContribuables(){
			return contribuableService.getContribuables();
	}
	
	@GetMapping(value = "/Contribuable/{id}")
	public Contribuable getContribuable(@PathVariable(value = "id") Long id) {
		return contribuableService.getContribuableById(id);
	}
	
	@PostMapping(value = "/Contribuable")
	public Contribuable create(@RequestBody Contribuable c) {
		return contribuableService.create(c);
	}
	
	@PutMapping(value = "/Contribuable")
	public boolean update(@RequestBody Contribuable c) {
		return contribuableService.update(c);
	}
	
	@DeleteMapping(value = "/Contribuable")
	public boolean delete(@RequestBody Contribuable c) {
		return contribuableService.delete(c);
	}
	
	@PostMapping(value = "/Contribuable/login")
	public Contribuable getLogin(@RequestBody Contribuable c) {
		return contribuableService.getContribuableByLoginAndPassword(c.getLogin(), c.getPassword());
	}
	
}
