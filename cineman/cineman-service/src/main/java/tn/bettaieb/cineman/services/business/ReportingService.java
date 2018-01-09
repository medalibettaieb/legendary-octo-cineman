package tn.bettaieb.cineman.services.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.entities.FilmCategory;

/**
 * Session Bean implementation class ReportingService
 */
@Stateless
public class ReportingService implements ReportingServiceRemote, ReportingServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ReportingService() {
	}

	@Override
	public List<Film> findFilmsByCategory(FilmCategory filmCategory) {
		return entityManager.createQuery("select f from Film f where f.filmCategory = :c")
				.setParameter("c", filmCategory).getResultList();
	}

	@Override
	public List<Film> findFilmsByCinema(Cinema cinema) {
		return entityManager
				.createQuery(
						"select f from Film f inner join f.filmSessions ffs inner join ffs.salle salle where salle.cinema = :c")
				.setParameter("c", cinema).getResultList();
	}

}
