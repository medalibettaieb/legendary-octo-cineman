package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Cinema
 *
 */
@Entity

public class Cinema implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
	private List<Salle> salles;

	@OneToMany(mappedBy = "premiereCinema")
	private List<Film> premiereFilms;
	private static final long serialVersionUID = 1L;

	public Cinema() {
		super();
	}

	public Cinema(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Salle> getSalles() {
		return salles;
	}

	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}

	public List<Film> getPremiereFilms() {
		return premiereFilms;
	}

	public void setPremiereFilms(List<Film> premiereFilms) {
		this.premiereFilms = premiereFilms;
	}

	public void linkSallesToThisCinema(List<Salle> salles) {
		this.salles = salles;
		for (Salle s : salles) {
			s.setCinema(this);
		}
	}
}
