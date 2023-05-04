package it.vincenzopicone.cinemille.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import it.vincenzopicone.cinemille.model.Sala;

public interface SalaRepository extends CrudRepository<Sala, Long>, PagingAndSortingRepository<Sala, Long> {

	public Sala findByNumerosala(int numerosala);
	public boolean existsByNumerosala(int numerosala);
}
