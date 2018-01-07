package tn.bettaieb.cineman.services.business;

import java.util.Date;

import javax.ejb.Remote;

import tn.bettaieb.cineman.entities.PaymentMethod;
import tn.bettaieb.cineman.entities.User;

@Remote
public interface BookingServiceRemote {
	void bookForFilm(int nbPlaces, Date dateOfSession, PaymentMethod paymentMethod, User client, int filmId,
			int salleId);
}
