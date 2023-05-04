package it.vincenzopicone.cinemille.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import it.vincenzopicone.cinemille.model.Programmazione;
import it.vincenzopicone.cinemille.model.Sala;

public interface ProgrammazioneRepository
		extends CrudRepository<Programmazione, Long>, PagingAndSortingRepository<Programmazione, Long> {
	
	public Boolean existsByDatauscita(LocalDate datauscita);
	public Programmazione findByDatauscita(LocalDate datauscita);
	
	@Query(value = "SELECT p FROM Programmazione p INNER JOIN sala s WHERE s = :sala AND datauscita = :data")
	public List<Programmazione> listaDiPrenotazioniConData(Sala sala, LocalDate data);
	
//	@query(value = "select count(p) from programmazione p where p.sala.id = :idsala and (:datainizio between p.datauscita and p.datafineprogrammazione)")
//	public list<programmazione> listadiprenotazionicondataedata(long idsala, localdate datainizio);
	

}
