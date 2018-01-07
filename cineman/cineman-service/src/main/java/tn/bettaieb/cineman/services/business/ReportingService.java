package tn.bettaieb.cineman.services.business;

import java.util.List;

import javax.ejb.Stateless;

import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.entities.FilmCategory;

/**
 * Session Bean implementation class ReportingService
 */
@Stateless
public class ReportingService implements ReportingServiceRemote, ReportingServiceLocal {

	/**
	 * Default constructor.
	 */
	public ReportingService() {
	}

	@Override
	public List<Film> findFilmsByCategory(FilmCategory filmCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> findFilmsByCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		return null;
	}

}
