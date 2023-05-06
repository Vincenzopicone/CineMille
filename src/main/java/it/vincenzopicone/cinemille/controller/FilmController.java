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

import it.vincenzopicone.cinemille.service.FilmService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/film")
public class FilmController {

	@Autowired FilmService service;
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Film>>(service.getAllFilm(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAll(@PathVariable Long id){
		return new ResponseEntity <Film>(service.findById(id), HttpStatus.OK);
	}

}
