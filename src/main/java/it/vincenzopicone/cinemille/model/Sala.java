package it.vincenzopicone.cinemille.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name="sale")
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable= false)
	private int numerosala;
	@Column(nullable= false)
	@Enumerated(EnumType.STRING)
	private TipoSala tiposala;
	@Column(nullable= false)
	private int capienza;
	
	public Sala(int numerosala, TipoSala tiposala, int capienza) {
		super();
		this.numerosala = numerosala;
		this.tiposala = tiposala;
		this.capienza = capienza;
	}
	
	
	
}
