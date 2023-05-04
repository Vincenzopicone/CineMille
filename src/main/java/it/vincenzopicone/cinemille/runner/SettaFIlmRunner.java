package it.vincenzopicone.cinemille.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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
//		Boolean avvia= true;
//		while(avvia) {
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
//			break;
//		};
//		Film F1 = new Film("titolo 1333", "Descr1");
//		Film F2 = new Film("titolo 24444", "Descr2");
//		Film F3 = new Film("titolo 35555", "Descr3");
//		Film F4 = new Film("titolo 45555", "Descr4");
//		Film F5 = new Film("titolo 5555", "Descr5");
//		Film F6 = new Film("titolo 6555", "Descr6");
//		Film F7 = new Film("titolo 75555", "Descr7");
//		Film F8 = new Film("titolo 85555", "Descr8");
//		Film F9 = new Film("titolo 95555", "Descr9");
//		Film F10 = new Film("titolo 105555", "Descr10");
//		Film F11 = new Film("titolo 11555", "Descr11");
//		Film F12 = new Film("titolo 125555", "Descr12");
//
//			filmService.creaFilm(F1);
//			filmService.creaFilm(F2);
//			filmService.creaFilm(F3);
//			filmService.creaFilm(F4);
//			filmService.creaFilm(F5);
//			filmService.creaFilm(F6);
//			filmService.creaFilm(F7);
//			filmService.creaFilm(F8);
//			filmService.creaFilm(F9);
//			filmService.creaFilm(F10);
//			filmService.creaFilm(F11);
//			filmService.creaFilm(F12);
//			
//			
//
//		Programmazione P1 = new Programmazione(F2,S10,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P1);
//		Programmazione P2 = new Programmazione(F1,S11,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P2);
//		Programmazione P3 = new Programmazione(F3,S2,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P3);
//		Programmazione P4 = new Programmazione(F4,S1,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P4);
//		Programmazione P5 = new Programmazione(F5,S3,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P5);
//		Programmazione P6 = new Programmazione(F6,S4,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P6);
//		Programmazione P7 = new Programmazione(F7,S5,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P7);
//		Programmazione P8 = new Programmazione(F8,S6,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P8);
//		Programmazione P9= new Programmazione(F9,S7,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P9);
//		Programmazione P10 = new Programmazione(F10,S8,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P10);
//		Programmazione P11 = new Programmazione(F11,S9,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P11);
//		Programmazione P12 = new Programmazione(F12,S12,LocalDate.of(2023, 5, 1));
//		progrService.creaProgrammazione(P12);
		
		Programmazione P33 = new Programmazione(filmService.findById(1l),salaService.findById(2l),LocalDate.of(2023, 5, 9));
		progrService.creaProgrammazione(P33);
		Programmazione P22 = new Programmazione(filmService.findById(4l),salaService.findById(4l),LocalDate.of(2023, 5, 9));
		progrService.creaProgrammazione(P22);
		Programmazione P34 = new Programmazione(filmService.findById(3l),salaService.findById(6l),LocalDate.of(2023, 5, 9));
		progrService.creaProgrammazione(P34);
		Programmazione P44 = new Programmazione(filmService.findById(5l),salaService.findById(3l),LocalDate.of(2023, 5, 9));
		progrService.creaProgrammazione(P44);
		Programmazione P54 = new Programmazione(filmService.findById(9l),salaService.findById(9l),LocalDate.of(2023, 5, 18));
		progrService.creaProgrammazione(P54);
		
	}

}
