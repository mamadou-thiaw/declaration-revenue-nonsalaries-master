package sn.sectioninfo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.sectioninfo.entities.RevenusFonciers;
import sn.sectioninfo.service.RevenusFonciersService;

@RestController
@CrossOrigin("*")
public class RevenusFonciersController {
	
	@Autowired
	private RevenusFonciersService revenusFonciersService;
	
	@GetMapping("/RevenusFonciers")
	public List<RevenusFonciers> getRevenusFonciers() {
		return revenusFonciersService.getRevenusFonciers();

	}
	@GetMapping("/RevenusFonciers/{id}")
	public ResponseEntity<RevenusFonciers> getContribualeById(@PathVariable(value = "id") Long id) {
		RevenusFonciers revenusFonciers = revenusFonciersService.getRevenusFonciersById(id);
		return ResponseEntity.ok().body(revenusFonciers);
	}
	
	@PostMapping("/RevenusFonciers")
	public ResponseEntity<RevenusFonciers> create(@RequestBody RevenusFonciers revenusFonciers) {
	return  ResponseEntity.ok().body(revenusFonciersService.create(revenusFonciers));
	}
	
	@PutMapping("/RevenusFonciers")
	public ResponseEntity<Boolean> update(@RequestBody RevenusFonciers revenusFonciers) {
	
		return  ResponseEntity.ok().body(revenusFonciersService.update(revenusFonciers));
		
	}
	@DeleteMapping("/RevenusFonciers")
	public ResponseEntity<Boolean> delete(@RequestBody RevenusFonciers revenusFonciers) {
			return ResponseEntity.ok().body(revenusFonciersService.delete(revenusFonciers));

	}
}
