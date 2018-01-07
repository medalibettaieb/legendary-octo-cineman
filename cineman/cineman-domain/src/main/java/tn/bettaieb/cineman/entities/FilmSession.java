package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: FilmSession
 *
 */
@Entity

public class FilmSession implements Serializable {
	@EmbeddedId
	private FilmSessionId filmSessionId;
	private String description;
	private int nbPlaces;
	private float price;

	@ManyToOne
	@JoinColumn(name = "salleId", referencedColumnName = "id", updatable = false, insertable = false)
	private Salle salle;

	@ManyToOne
	@JoinColumn(name = "filmId", referencedColumnName = "id", updatable = false, insertable = false)
	private Film film;

	@OneToMany(mappedBy = "filmSession")
	private List<BookingDetail> bookingDetails;
	private static final long serialVersionUID = 1L;

	public FilmSession() {
		super();
	}

	public FilmSession(String description, int nbPlaces, float price, Date dateOfSession, Salle salle, Film film) {
		super();
		this.description = description;
		this.nbPlaces = nbPlaces;
		this.price = price;
		this.salle = salle;
		this.film = film;
		this.filmSessionId = new FilmSessionId(film.getId(), salle.getId(), dateOfSession);
	}

	public int getNbPlaces() {
		return this.nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FilmSessionId getFilmSessionId() {
		return filmSessionId;
	}

	public void setFilmSessionId(FilmSessionId filmSessionId) {
		this.filmSessionId = filmSessionId;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public List<BookingDetail> getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(List<BookingDetail> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

}
