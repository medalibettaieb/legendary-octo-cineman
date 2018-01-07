package tn.bettaieb.cineman.services.basic;

import javax.ejb.Local;

import tn.bettaieb.cineman.entities.User;
import tn.bettaieb.cineman.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
