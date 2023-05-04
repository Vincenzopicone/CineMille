package it.vincenzopicone.cinemille.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.vincenzopicone.cinemille.model.Sala;
import it.vincenzopicone.cinemille.repository.SalaRepository;
import jakarta.persistence.EntityExistsException;

@Service
public class SalaService {

	@Autowired SalaRepository repo;
	
	public List<Sala> getAllSala() {
		return (List<Sala>) repo.findAll();
	}
	
	public Page<Sala> getAllSalaPage(Pageable page) {
		return (Page<Sala>) repo.findAll(page);
	}
	
	public Sala creaSala(Sala sala) {
		if(repo.existsByNumerosala(sala.getNumerosala())) {
			throw new EntityExistsException("Esiste una sala con questo numero");
		} else {
			repo.save(sala);
		}
		return sala;
	}
	public Sala aggiornaSala(Sala sala) {
			repo.save(sala);
		return sala;
	}
	
}
