package tn.bettaieb.cineman.app.client.delegate;

import java.util.Date;

import tn.bettaieb.cineman.app.client.locator.ServiceLocator;
import tn.bettaieb.cineman.entities.PaymentMethod;
import tn.bettaieb.cineman.entities.User;
import tn.bettaieb.cineman.services.business.BookingServiceRemote;

public class BookingServiceDelegate {
	private static final String jndiNameBookingService = "cineman-ear/cineman-service/BookingService!tn.bettaieb.cineman.services.business.BookingServiceRemote";

	private static BookingServiceRemote getProxyOnUserServiceRemote() {
		return (BookingServiceRemote) ServiceLocator.getInstance().getProxy(jndiNameBookingService);

	}

	public static void bookForFilm(int nbPlaces, Date dateOfSession, PaymentMethod paymentMethod, User client,
			int filmId, int salleId) {
		getProxyOnUserServiceRemote().bookForFilm(nbPlaces, dateOfSession, paymentMethod, client, filmId, salleId);

	}
}
