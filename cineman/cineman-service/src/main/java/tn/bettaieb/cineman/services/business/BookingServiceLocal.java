package tn.bettaieb.cineman.services.business;

import java.util.Date;

import javax.ejb.Local;

import tn.bettaieb.cineman.entities.PaymentMethod;
import tn.bettaieb.cineman.entities.User;

@Local
public interface BookingServiceLocal {
	void bookForFilm(int nbPlaces, Date dateOfSession, PaymentMethod paymentMethod, User client, int filmId,
			int salleId);
}
