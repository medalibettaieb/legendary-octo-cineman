package tn.bettaieb.cineman.services.basic;

import javax.ejb.Local;

import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.utilities.IGenericDAO;

@Local
public interface FilmServiceLocal extends IGenericDAO<Film> {

}
