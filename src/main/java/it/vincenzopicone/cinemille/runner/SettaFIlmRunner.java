package it.vincenzopicone.cinemille.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import it.vincenzopicone.cinemille.model.Film;
import it.vincenzopicone.cinemille.model.Sala;
import it.vincenzopicone.cinemille.model.TipoSala;
import it.vincenzopicone.cinemille.service.FilmService;
import it.vincenzopicone.cinemille.service.SalaService;

@Component
public class SettaFIlmRunner implements ApplicationRunner {
	
	@Autowired FilmService filmService;
	@Autowired SalaService salaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Sala S1 = new Sala(1,TipoSala.IMAX, 250);
		salaService.creaSala(S1);
		Sala S2 = new Sala(2,TipoSala.STANDARD, 143);
		salaService.creaSala(S2);
		Sala S3 = new Sala(3,TipoSala.STANDARD, 50);
		salaService.creaSala(S3);
		Sala S4 = new Sala(4,TipoSala.IMAX, 189);
		salaService.creaSala(S4);
		Sala S5 = new Sala(5,TipoSala.STANDARD, 120);
		salaService.creaSala(S5);
		Sala S6 = new Sala(6,TipoSala.STANDARD, 180);
		salaService.creaSala(S6);
		Sala S7 = new Sala(7,TipoSala.STANDARD, 98);
		salaService.creaSala(S7);
		Sala S8 = new Sala(8,TipoSala.STANDARD, 210);
		salaService.creaSala(S8);
		Sala S9 = new Sala(9,TipoSala.STANDARD, 170);
		salaService.creaSala(S9);
		Sala S10 = new Sala(10,TipoSala.STANDARD, 85);
		salaService.creaSala(S10);
		Sala S11 = new Sala(11,TipoSala.STANDARD, 100);
		salaService.creaSala(S11);
		Sala S12 = new Sala(12,TipoSala.STANDARD, 120);
		salaService.creaSala(S12);
		Film F1 = new Film("titolo 1", "Descr1");
		filmService.creaFilm(F1);
		Film F2 = new Film("titolo 2", "Descr2");
		filmService.creaFilm(F2);
		Film F3 = new Film("titolo 3", "Descr3");
		filmService.creaFilm(F3);
		Film F4 = new Film("titolo 4", "Descr4");
		filmService.creaFilm(F4);
		Film F5 = new Film("titolo 5", "Descr5");
		filmService.creaFilm(F5);
		Film F6 = new Film("titolo 6", "Descr6");
		filmService.creaFilm(F6);
		Film F7 = new Film("titolo 7", "Descr7");
		filmService.creaFilm(F7);
		Film F8 = new Film("titolo 8", "Descr8");
		filmService.creaFilm(F8);
		Film F9 = new Film("titolo 9", "Descr9");
		filmService.creaFilm(F9);
		Film F10 = new Film("titolo 10", "Descr10");
		filmService.creaFilm(F10);
		Film F11 = new Film("titolo 11", "Descr11");
		filmService.creaFilm(F11);
		Film F12 = new Film("titolo 12", "Descr12");
		filmService.creaFilm(F12);
		

	}

}
