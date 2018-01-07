package tn.bettaieb.cineman.services.basic;

import javax.ejb.Remote;

import tn.bettaieb.cineman.entities.User;
import tn.bettaieb.cineman.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
