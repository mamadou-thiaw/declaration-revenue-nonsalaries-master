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

import sn.sectioninfo.entities.Contribuable;
import sn.sectioninfo.entities.RevenusCapitauxMobiliers;
import sn.sectioninfo.service.ContribuableService;
import sn.sectioninfo.service.RevenusCapitauxMobiliersService;

@RestController
@CrossOrigin("*")
public class RevenusCapitauxMobiliersController {
	
	@Autowired
	private RevenusCapitauxMobiliersService revenusCapitauxMobiliersService;
	
	@GetMapping("/RevenusCapitauxMobiliers")
	public List<RevenusCapitauxMobiliers> getRevenusCapitauxMobiliers() {
		return revenusCapitauxMobiliersService.getRevenusCapitauxMobiliers();

	}
	
	@GetMapping("/RevenusCapitauxMobiliers/{id}")
	public ResponseEntity<RevenusCapitauxMobiliers> getContribualeById(@PathVariable(value = "id") Long id) {
		RevenusCapitauxMobiliers revenusCapitauxMobiliers = revenusCapitauxMobiliersService.getRevenusCapitauxMobiliersById(id);
		return ResponseEntity.ok().body(revenusCapitauxMobiliers);
	}
	
	
	
	@PostMapping("/RevenusCapitauxMobiliers")
	public ResponseEntity<RevenusCapitauxMobiliers> create(@RequestBody RevenusCapitauxMobiliers revenusCapitauxMobiliers) {
	return  ResponseEntity.ok().body(revenusCapitauxMobiliersService.create(revenusCapitauxMobiliers));
	}
	@PutMapping("/RevenusCapitauxMobiliers")
	public ResponseEntity<Boolean> update(@RequestBody RevenusCapitauxMobiliers revenusCapitauxMobiliers) {
	
		return  ResponseEntity.ok().body(revenusCapitauxMobiliersService.update(revenusCapitauxMobiliers));
		
	}
	
	@DeleteMapping("/RevenusCapitauxMobiliers/{id}")
	public boolean delete(@PathVariable(value = "id") Long id ) {
		    RevenusCapitauxMobiliers rcm =  revenusCapitauxMobiliersService.getRevenusCapitauxMobiliersById(id);
			return revenusCapitauxMobiliersService.delete(rcm);

	}
	
	@GetMapping("/RevenusCapitauxMobiliers/contribuable/{id}")
	public List<RevenusCapitauxMobiliers> getRevenusCapitauxMobilierByContribuable(@PathVariable(value = "id") Long id) {
		return revenusCapitauxMobiliersService.findRevenusCapitauxMobiliersByContribuable(id);
	}
	
}
