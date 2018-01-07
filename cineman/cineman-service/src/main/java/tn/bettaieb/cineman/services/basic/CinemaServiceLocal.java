package tn.bettaieb.cineman.services.basic;

import java.util.Date;

import javax.ejb.Local;

import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.utilities.IGenericDAO;

@Local
public interface CinemaServiceLocal extends IGenericDAO<Cinema> {
	void openFilmSession(int filmId, int salleId, Date dateOfSession, String description, int nbPlaces, float price);
}
