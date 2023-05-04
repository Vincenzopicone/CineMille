package it.vincenzopicone.cinemille.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.vincenzopicone.cinemille.model.Programmazione;
import it.vincenzopicone.cinemille.model.Sala;
import it.vincenzopicone.cinemille.repository.ProgrammazioneRepository;
import it.vincenzopicone.cinemille.repository.SalaRepository;
import jakarta.persistence.EntityExistsException;

@Service
public class ProgrammazioneService {
@Autowired ProgrammazioneRepository repo;
	
	public List<Programmazione> getAllProgrammazione() {
		return (List<Programmazione>) repo.findAll();
	}
	
	public Page<Programmazione> getAllProgrammazionePage(Pageable page) {
		return (Page<Programmazione>) repo.findAll(page);
	}
	
	public Programmazione creaProgrammazione(Programmazione programmazione) {
//		if(repo.existsByNumerosala(programmazione.getNumerosala())) {
//			throw new EntityExistsException("Esiste una sala con questo numero");
//		} else {
			repo.save(programmazione);
//		}
		return programmazione;
	}
	public Programmazione aggiornaProgrammazione(Programmazione programmazione) {
			repo.save(programmazione);
		return programmazione;
	}

}
