package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Film
 *
 */
@Entity

public class Film implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String filmPster;
	private String directorName;
	private Date dateOfPremiere;
	private FilmCategory filmCategory;
	
	@OneToMany(mappedBy="film")
	private List<FilmSession> filmSessions;
	
	@ManyToOne
	private Cinema premiereCinema;
	private static final long serialVersionUID = 1L;

	public Film() {
		super();
	}

	public Film(String name, String directorName) {
		super();
		this.name = name;
		this.directorName = directorName;
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

	public String getDirectorName() {
		return this.directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Date getDateOfPremiere() {
		return this.dateOfPremiere;
	}

	public void setDateOfPremiere(Date dateOfPremiere) {
		this.dateOfPremiere = dateOfPremiere;
	}

	public List<FilmSession> getFilmSessions() {
		return filmSessions;
	}

	public void setFilmSessions(List<FilmSession> filmSessions) {
		this.filmSessions = filmSessions;
	}

	public Cinema getPremiereCinema() {
		return premiereCinema;
	}

	public void setPremiereCinema(Cinema premiereCinema) {
		this.premiereCinema = premiereCinema;
	}

	public FilmCategory getFilmCategory() {
		return filmCategory;
	}

	public void setFilmCategory(FilmCategory filmCategory) {
		this.filmCategory = filmCategory;
	}

	public String getFilmPster() {
		return filmPster;
	}

	public void setFilmPster(String filmPster) {
		this.filmPster = filmPster;
	}


}
