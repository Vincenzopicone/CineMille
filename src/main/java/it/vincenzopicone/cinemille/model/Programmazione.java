package it.vincenzopicone.cinemille.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="programmazione")
public class Programmazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable= false)
	@ManyToMany(mappedBy="id_film")
	private List<Film> film = new ArrayList<>();
	@Column(nullable= false)
	@ManyToMany(mappedBy="id_sala")
	private List<Sala> sale = new ArrayList<>();
	@Column(nullable= false)
	private LocalDate datauscita;
	@Column(nullable= false)
	private LocalDate datafine;
	
	public Programmazione(Film film, Sala sale, LocalDate datauscita) {
		super();
		this.film.add(film);
		this.sale.add(sale);
		this.datauscita = datauscita;
		this.datafine = datauscita.plusWeeks(1);
	}
	
	

}
