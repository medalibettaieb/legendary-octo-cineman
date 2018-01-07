package tn.bettaieb.cineman.services.basic;

import javax.ejb.Remote;

import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.utilities.IGenericDAO;

@Remote
public interface FilmServiceRemote extends IGenericDAO<Film> {

}
