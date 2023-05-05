package it.vincenzopicone.cinemille.configuration;

import java.time.LocalDate;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import it.vincenzopicone.cinemille.model.Programmazione;
import it.vincenzopicone.cinemille.service.FilmService;

@Service
public class ProgramazioneConfiguration {
	
//	@Autowired FilmService filmService;
//	
//	@Bean("ProgrammazioneFake")
//	@Scope("prototype")
//	public Programmazione programmazioneFake(Integer numerosala, LocalDate data) {
//		Faker fake = Faker.instance(new Locale("it-IT"));
//		return Programmazione.builder()
//				.datauscita(data)
//				.film(filmService.findById(fake.))
//				.sala
//				.build();
//		
//	}

}
