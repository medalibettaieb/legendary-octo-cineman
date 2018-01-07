package tn.bettaieb.cineman.services.basic;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.entities.FilmSession;
import tn.bettaieb.cineman.entities.Salle;
import tn.bettaieb.cineman.utilities.GenericDAO;

/**
 * Session Bean implementation class CinemaService
 */
@Stateless
public class CinemaService extends GenericDAO<Cinema> implements CinemaServiceRemote, CinemaServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private SalleServiceLocal salleServiceLocal;
	@EJB
	private FilmServiceLocal filmServiceLocal;

	/**
	 * Default constructor.
	 */
	public CinemaService() {
		super(Cinema.class);
	}

	@Override
	public void openFilmSession(int filmId, int salleId, Date dateOfSession, String description, int nbPlaces,
			float price) {
		Salle salle = salleServiceLocal.find(salleId);
		Film film = filmServiceLocal.find(filmId);
		FilmSession filmSession = new FilmSession(description, nbPlaces, price, dateOfSession, salle, film);
		
		entityManager.merge(filmSession);
	}

}
