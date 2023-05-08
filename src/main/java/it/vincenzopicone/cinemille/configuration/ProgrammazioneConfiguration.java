package it.vincenzopicone.cinemille.configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import it.vincenzopicone.cinemille.model.Film;
import it.vincenzopicone.cinemille.model.Programmazione;
import it.vincenzopicone.cinemille.model.Sala;
import it.vincenzopicone.cinemille.service.FilmService;
import it.vincenzopicone.cinemille.service.SalaService;

@Service
public class ProgrammazioneConfiguration {
	
	@Autowired FilmService filmService;
	@Autowired SalaService salaService;
	
	@Bean("ProgrammazioneFake")
	@Scope("prototype")
	public Programmazione programmazioneFake(Long index, Long random, LocalDate data) {
		Film F = filmService.findById(index + random);
		Sala S = salaService.findById(index);
		Programmazione P = new Programmazione();
		P.setDatauscita(data);
		P.setDatafineprogrammazione(P.getDatauscita().plusDays(6));
		P.setFilm(F);
		P.setSala(S);
		P.setPrimo(LocalTime.of(19, 00));
		P.setSecondo(P.getPrimo().plusMinutes(F.getDurata() + 15));
		P.setTerzo(P.getSecondo().plusMinutes(F.getDurata() + 15));
		return P;
		
	}

}
