package tn.bettaieb.cineman.services.business;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.cineman.entities.BookingDetail;
import tn.bettaieb.cineman.entities.FilmSession;
import tn.bettaieb.cineman.entities.FilmSessionId;
import tn.bettaieb.cineman.entities.PaymentMethod;
import tn.bettaieb.cineman.entities.User;

/**
 * Session Bean implementation class BookingService
 */
@Stateless
public class BookingService implements BookingServiceRemote, BookingServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public BookingService() {
	}

	@Override
	public void bookForFilm(int nbPlaces, Date dateOfSession, PaymentMethod paymentMethod, User client, int filmId,
			int salleId) {

		FilmSession filmSession = entityManager.find(FilmSession.class,
				new FilmSessionId(filmId, salleId, dateOfSession));
		BookingDetail bookingDetail = new BookingDetail(nbPlaces, dateOfSession, paymentMethod, client, filmSession);

		entityManager.merge(bookingDetail);

	}

}
