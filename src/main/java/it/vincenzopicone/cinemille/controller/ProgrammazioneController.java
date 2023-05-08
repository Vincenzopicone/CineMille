package it.vincenzopicone.cinemille.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import it.vincenzopicone.cinemille.model.Programmazione;
import it.vincenzopicone.cinemille.service.ProgrammazioneService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/programmazioni")
public class ProgrammazioneController {
	
@Autowired ProgrammazioneService service;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Programmazione>>(service.getAllProgrammazione(), HttpStatus.OK);
	}
	
	@GetMapping("/data")
	public ResponseEntity<?> getPageData(@RequestParam("start") LocalDate startDate, @RequestParam("end") LocalDate endDate, Pageable pag) {
		return new ResponseEntity<Page<Programmazione>>(service.filtraPerRangeData(startDate, endDate, pag), HttpStatus.OK);
	}
	
	
	@PostMapping("/inserisci")
	public ResponseEntity<?> createNewProgrammazione(@RequestBody Programmazione progr) {
		return new ResponseEntity<Programmazione>(service.creaProgrammazione(progr), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/elimina/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id){
		return new ResponseEntity<String>(service.removeProgrammazione(id), HttpStatus.OK);
	}

}
