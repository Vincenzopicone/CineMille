package it.vincenzopicone.cinemille.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import it.vincenzopicone.cinemille.configuration.FilmConfiguration;
import it.vincenzopicone.cinemille.model.Film;
import it.vincenzopicone.cinemille.model.Programmazione;
import it.vincenzopicone.cinemille.model.Sala;
import it.vincenzopicone.cinemille.model.TipoSala;
import it.vincenzopicone.cinemille.service.FilmService;
import it.vincenzopicone.cinemille.service.ProgrammazioneService;
import it.vincenzopicone.cinemille.service.SalaService;

@Component
public class SettaFilmRunner implements ApplicationRunner {
	
	@Autowired FilmService filmService;
	@Autowired SalaService salaService;
	@Autowired ProgrammazioneService progrService;
	@Autowired FilmConfiguration filmConf; 

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		Sala S1 = new Sala(1,TipoSala.IMAX, 250);
//		Sala S2 = new Sala(2,TipoSala.STANDARD, 143);
//		Sala S3 = new Sala(3,TipoSala.STANDARD, 50);
//		Sala S4 = new Sala(4,TipoSala.IMAX, 189);
//		Sala S5 = new Sala(5,TipoSala.STANDARD, 120);
//		Sala S6 = new Sala(6,TipoSala.STANDARD, 180);
//		Sala S7 = new Sala(7,TipoSala.STANDARD, 98);
//		Sala S8 = new Sala(8,TipoSala.STANDARD, 210);
//		Sala S9 = new Sala(9,TipoSala.STANDARD, 170);
//		Sala S10 = new Sala(10,TipoSala.STANDARD, 85);
//		Sala S11 = new Sala(11,TipoSala.STANDARD, 100);
//		Sala S12 = new Sala(12,TipoSala.STANDARD, 120);
//			salaService.creaSala(S1);
//			salaService.creaSala(S2);
//			salaService.creaSala(S3);
//			salaService.creaSala(S4);
//			salaService.creaSala(S5);
//			salaService.creaSala(S6);
//			salaService.creaSala(S7);
//			salaService.creaSala(S8);
//			salaService.creaSala(S9);
//			salaService.creaSala(S10);
//			salaService.creaSala(S11);
//			salaService.creaSala(S12);
			
//	for(int i = 0; i < 30;i++) {
//		Film F = filmConf.newFilmFake();
//		filmService.creaFilm(F);	
//	}
//	
//	for(Long i = 1l; i < 13; i++) {
//		Film F = filmService.findById(i+7);
//		Sala S = salaService.findById(i);
//		
//		Programmazione P = new Programmazione();
//		P.setDatauscita(LocalDate.of(2023, 6, 4));
//		P.setDatafineprogrammazione(P.getDatauscita().plusDays(6));
//		P.setFilm(F);
//		P.setSala(S);
//		progrService.creaProgrammazione(P);
//	}
	

		
	}

}
