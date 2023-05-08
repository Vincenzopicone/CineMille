package it.vincenzopicone.cinemille.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

import it.vincenzopicone.cinemille.model.Film;

@Configuration
public class FilmConfiguration {
	
	@Bean("FakeFilm")
	@Scope("prototype")
	public Film newFilmFake() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		return Film.builder()
				.regia(fake.book().author())
				.descrizione(fake.lorem().characters(25, 50))
				.genere(fake.book().genre())
				.durata(fake.number().numberBetween(90, 150))
				.titolo(fake.book().title())
				.build();				
	}

}
