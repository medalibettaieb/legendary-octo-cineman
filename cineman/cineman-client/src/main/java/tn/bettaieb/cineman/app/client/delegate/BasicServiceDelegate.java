package tn.bettaieb.cineman.app.client.delegate;

import java.util.Date;

import tn.bettaieb.cineman.app.client.locator.ServiceLocator;
import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.entities.User;
import tn.bettaieb.cineman.services.basic.CinemaServiceRemote;
import tn.bettaieb.cineman.services.basic.FilmServiceRemote;
import tn.bettaieb.cineman.services.basic.SalleServiceRemote;
import tn.bettaieb.cineman.services.basic.UserServiceRemote;

public class BasicServiceDelegate {
	private static final String jndiNameUserService = "cineman-ear/cineman-service/UserService!tn.bettaieb.cineman.services.basic.UserServiceRemote";
	private static final String jndiNameCinemaService = "cineman-ear/cineman-service/CinemaService!tn.bettaieb.cineman.services.basic.CinemaServiceRemote";
	private static final String jndiNameFilmService = "cineman-ear/cineman-service/FilmService!tn.bettaieb.cineman.services.basic.FilmServiceRemote";
	private static final String jndiNameSalleService = "cineman-ear/cineman-service/SalleService!tn.bettaieb.cineman.services.basic.SalleServiceRemote";

	private static UserServiceRemote getProxyOnUserServiceRemote() {
		return (UserServiceRemote) ServiceLocator.getInstance().getProxy(jndiNameUserService);

	}

	private static CinemaServiceRemote getProxyOnCinemaServiceRemote() {
		return (CinemaServiceRemote) ServiceLocator.getInstance().getProxy(jndiNameCinemaService);

	}

	private static SalleServiceRemote getProxyOnSalleServiceRemote() {
		return (SalleServiceRemote) ServiceLocator.getInstance().getProxy(jndiNameSalleService);

	}

	private static FilmServiceRemote getProxyOnFilmServiceRemote() {
		return (FilmServiceRemote) ServiceLocator.getInstance().getProxy(jndiNameFilmService);

	}

	public static void openFilmSession(int filmId, int salleId, Date dateOfSession, String description, int nbPlaces,
			float price) {
		getProxyOnCinemaServiceRemote().openFilmSession(filmId, salleId, dateOfSession, description, nbPlaces, price);

	}

	public static User findUserById(int code) {
		return getProxyOnUserServiceRemote().find(code);
	}

	public static Cinema findCinemaById(int id) {
		return getProxyOnCinemaServiceRemote().find(id);
	}

}
