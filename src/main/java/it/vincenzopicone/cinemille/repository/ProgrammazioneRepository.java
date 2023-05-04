package it.vincenzopicone.cinemille.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import it.vincenzopicone.cinemille.model.Programmazione;

public interface ProgrammazioneRepository
		extends CrudRepository<Programmazione, Long>, PagingAndSortingRepository<Programmazione, Long> {

}
