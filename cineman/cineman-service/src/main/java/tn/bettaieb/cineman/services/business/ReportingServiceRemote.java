package tn.bettaieb.cineman.services.business;

import java.util.List;

import javax.ejb.Remote;

import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.entities.FilmCategory;

@Remote
public interface ReportingServiceRemote {
	List<Film> findFilmsByCategory(FilmCategory filmCategory);

	List<Film> findFilmsByCinema(Cinema cinema);
}
