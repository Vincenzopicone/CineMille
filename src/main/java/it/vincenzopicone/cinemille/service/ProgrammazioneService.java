package it.vincenzopicone.cinemille.service;

import java.time.LocalDate;
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
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProgrammazioneService {
@Autowired ProgrammazioneRepository repo;
	
	public List<Programmazione> getAllProgrammazione() {
		return (List<Programmazione>) repo.findAll();
	}
	
	public Page<Programmazione> getAllProgrammazionePage(Pageable page) {
		return (Page<Programmazione>) repo.findAll(page);
	}
	
	public Programmazione creaProgrammazione(Programmazione programmazione) {
		List<Programmazione> listaP = checkProgrammazione(programmazione.getSala(), programmazione.getDatauscita());
//		List<Programmazione> listaPrenotazioneData = checkProgrammazioneData(programmazione.getSala().getId(), programmazione.getDatauscita());

		if(listaP.size() > 0) {
			throw new EntityExistsException("Questa sala è già stata assegnata");
		} else {
			repo.save(programmazione);
		}
		return programmazione;
	}
	public String removeProgrammazione(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Questa programamzione non esiste!");
		}
		repo.deleteById(id);
		return "Programmazione cancellata!";
	}
	public Programmazione aggiornaProgrammazione(Programmazione programmazione) {
			repo.save(programmazione);
		return programmazione;
	}
	
	public List<Programmazione> checkProgrammazione (Sala sala, LocalDate data) {
		return (List<Programmazione>) repo.listaDiPrenotazioniConData(sala, data);
	}
//	public List<Programmazione> checkProgrammazioneData (Long id, LocalDate data) {
//		return (List<Programmazione>) repo.listaDiPrenotazioniConDataeData(id, data);
//	}
	
	public Page<Programmazione> filtraPerRangeData(LocalDate startDate, LocalDate endDate, Pageable pageable){
		   return repo.ricercaPerData(startDate, endDate, pageable);
	   }

}
