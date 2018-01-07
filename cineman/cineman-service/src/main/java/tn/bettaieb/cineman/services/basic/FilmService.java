package tn.bettaieb.cineman.services.basic;

import javax.ejb.Stateless;

import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.utilities.GenericDAO;

/**
 * Session Bean implementation class FilmService
 */
@Stateless
public class FilmService extends GenericDAO<Film> implements FilmServiceRemote, FilmServiceLocal {

    /**
     * Default constructor. 
     */
    public FilmService() {
        super(Film.class);
    }

}
