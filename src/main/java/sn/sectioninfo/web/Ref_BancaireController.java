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

import sn.sectioninfo.entities.Ref_Bancaire;
import sn.sectioninfo.service.Ref_BancaireService;

@RestController
@CrossOrigin("*")
public class Ref_BancaireController {

	@Autowired
	private Ref_BancaireService bancaire;  
	  
	 @GetMapping("/Ref_Bancaires") 
	 public List<Ref_Bancaire> getBancaires(){
		  return bancaire.getRef_Bancaires();
	 }
	  
	 @GetMapping(value = "/Ref_Bancaire/{id}")
		public Ref_Bancaire getRef_Bancaire(@PathVariable(value = "id") Long id) {
			return bancaire.getRef_BancaireById(id);
		}
	   
	@PostMapping(value = "/Ref_Bancaire")
	public Ref_Bancaire create(@RequestBody Ref_Bancaire b) {
		return bancaire.create(b);
	}

	@PutMapping(value = "/Ref_Bancaire")
	public boolean update(@RequestBody Ref_Bancaire b) {
		return bancaire.update(b);
	}

	@DeleteMapping(value = "/Bancaire")
	public boolean delete(@RequestBody Ref_Bancaire b) {
		return bancaire.delete(b);
	}
}
