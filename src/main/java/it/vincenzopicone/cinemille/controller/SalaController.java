package it.vincenzopicone.cinemille.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.vincenzopicone.cinemille.model.Film;
import it.vincenzopicone.cinemille.model.Sala;

import it.vincenzopicone.cinemille.service.SalaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/sale")
public class SalaController {
	
	@Autowired SalaService service;
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Sala>>(service.getAllSala(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAll(@PathVariable Long id){
		return new ResponseEntity <Sala>(service.findById(id), HttpStatus.OK);
	}


}
