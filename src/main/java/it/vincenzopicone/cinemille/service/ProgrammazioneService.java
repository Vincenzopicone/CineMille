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
			log.info("La sala" + programmazione.getSala().getNumerosala() +" è già stata assegnata il giorno " + programmazione.getDatauscita());
		} else {
			repo.save(programmazione);
		}
		return programmazione;
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

}
