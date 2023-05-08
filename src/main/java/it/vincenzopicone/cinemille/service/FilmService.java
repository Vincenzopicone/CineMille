package it.vincenzopicone.cinemille.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.vincenzopicone.cinemille.model.Film;

import it.vincenzopicone.cinemille.repository.FilmRepository;
import it.vincenzopicone.cinemille.repository.SalaRepository;
import jakarta.persistence.EntityExistsException;

@Service
public class FilmService {
	
	@Autowired FilmRepository repo;

	
	public List<Film> getAllFilm() {
		return (List<Film>) repo.findAll();
	}
	
	public Page<Film> getAllFilmPage(Pageable page) {
		return (Page<Film>) repo.findAll(page);
	}
	
	public Film findById(Long id) {
		return repo.findById(id).get();
		}
	
	public Film creaFilm(Film film) {
		if(repo.existsByTitolo(film.getTitolo())) {
			throw new EntityExistsException("Esiste un film con questo titolo");
		} else {
			repo.save(film);
		}
		return film;
		
	}
	public String removeFilm(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Questo film non esiste!");
		}
		repo.deleteById(id);
		return "Film cancellato!";
	}

}
