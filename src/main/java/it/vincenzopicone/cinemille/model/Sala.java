package it.vincenzopicone.cinemille.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	@JsonIgnoreProperties("programmazioni")
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER)
	private List<Programmazione> programmazioni;
	
	public Sala(int numerosala, TipoSala tiposala, int capienza) {
		super();
		this.numerosala = numerosala;
		this.tiposala = tiposala;
		this.capienza = capienza;
	}
	
	
	
}
