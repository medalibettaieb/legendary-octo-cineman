package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Salle
 *
 */
@Entity

public class Salle implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String designation;
	
	@ManyToOne
	private Cinema cinema;
	
	@OneToMany(mappedBy="salle")
	private List<FilmSession> filmSessions;
	private static final long serialVersionUID = 1L;

	public Salle() {
		super();
	}  
	
	public Salle(String designation) {
		super();
		this.designation = designation;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<FilmSession> getFilmSessions() {
		return filmSessions;
	}
	public void setFilmSessions(List<FilmSession> filmSessions) {
		this.filmSessions = filmSessions;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
   
}
