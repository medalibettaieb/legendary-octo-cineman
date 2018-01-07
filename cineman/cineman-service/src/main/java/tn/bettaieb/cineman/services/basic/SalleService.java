package tn.bettaieb.cineman.services.basic;

import javax.ejb.Stateless;

import tn.bettaieb.cineman.entities.Salle;
import tn.bettaieb.cineman.utilities.GenericDAO;

/**
 * Session Bean implementation class SalleService
 */
@Stateless
public class SalleService extends GenericDAO<Salle> implements SalleServiceRemote, SalleServiceLocal {

    /**
     * Default constructor. 
     */
    public SalleService() {
       super(Salle.class);
    }

}
