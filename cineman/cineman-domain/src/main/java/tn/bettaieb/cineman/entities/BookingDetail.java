package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: BookingDetail
 *
 */
@Entity

public class BookingDetail implements Serializable {
	@EmbeddedId
	private BookingDetailId bookingDetailId;
	private int nbPlaces;
	private Date dateOfBooking;
	private PaymentMethod paymentMethod;
	private boolean status;

	@ManyToOne
	@JoinColumn(name = "clientId", referencedColumnName = "USR_CODE", updatable = false, insertable = false)
	private User client;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "filmId", referencedColumnName = "filmId", updatable = false, insertable = false),
			@JoinColumn(name = "salleId", referencedColumnName = "salleId", updatable = false, insertable = false),
			@JoinColumn(name = "dateOfSession", referencedColumnName = "dateOfSession", updatable = false, insertable = false) })
	private FilmSession filmSession;
	private static final long serialVersionUID = 1L;

	public BookingDetail() {
		super();
	}

	public BookingDetail(int nbPlaces, Date dateOfSession, PaymentMethod paymentMethod, User client,
			FilmSession filmSession) {
		super();
		this.nbPlaces = nbPlaces;
		this.dateOfBooking = new Date();
		this.paymentMethod = paymentMethod;
		this.client = client;
		this.filmSession = filmSession;
		this.bookingDetailId = new BookingDetailId(client.getCode(), filmSession.getFilm().getId(),
				filmSession.getSalle().getId(), dateOfSession);

	}

	public int getNbPlaces() {
		return this.nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public Date getDateOfBooking() {
		return this.dateOfBooking;
	}

	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BookingDetailId getBookingDetailId() {
		return bookingDetailId;
	}

	public void setBookingDetailId(BookingDetailId bookingDetailId) {
		this.bookingDetailId = bookingDetailId;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public FilmSession getFilmSession() {
		return filmSession;
	}

	public void setFilmSession(FilmSession filmSession) {
		this.filmSession = filmSession;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
