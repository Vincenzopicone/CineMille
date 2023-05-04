package it.vincenzopicone.cinemille.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import it.vincenzopicone.cinemille.model.Film;
import it.vincenzopicone.cinemille.model.Sala;

public interface FilmRepository extends CrudRepository<Film, Long>, PagingAndSortingRepository<Film, Long> {

	public Sala findByTitolo(String titolo);
	public boolean existsByTitolo(String titolo);
}
