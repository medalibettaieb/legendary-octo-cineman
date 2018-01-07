package tn.bettaieb.cineman.services.basic;

import javax.ejb.Remote;

import tn.bettaieb.cineman.entities.Salle;
import tn.bettaieb.cineman.utilities.IGenericDAO;

@Remote
public interface SalleServiceRemote extends IGenericDAO<Salle> {

}
