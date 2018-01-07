package tn.bettaieb.cineman.services.basic;

import javax.ejb.Local;

import tn.bettaieb.cineman.entities.Salle;
import tn.bettaieb.cineman.utilities.IGenericDAO;

@Local
public interface SalleServiceLocal extends IGenericDAO<Salle> {

}
