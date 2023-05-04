package it.vincenzopicone.cinemille.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.vincenzopicone.cinemille.model.Programmazione;
import it.vincenzopicone.cinemille.service.ProgrammazioneService;


@RestController
@RequestMapping("/programmazioni")
public class ProgrammazioneController {
	
@Autowired ProgrammazioneService service;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Programmazione>>(service.getAllProgrammazione(), HttpStatus.OK);
	}

}
