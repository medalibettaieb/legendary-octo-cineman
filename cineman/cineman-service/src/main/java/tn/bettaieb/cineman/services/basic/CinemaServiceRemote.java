package tn.bettaieb.cineman.services.basic;

import java.util.Date;

import javax.ejb.Remote;

import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.utilities.IGenericDAO;

@Remote
public interface CinemaServiceRemote extends IGenericDAO<Cinema> {
	void openFilmSession(int filmId, int salleId, Date dateOfSession, String description, int nbPlaces, float price);
}
