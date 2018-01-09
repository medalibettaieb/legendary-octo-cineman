package tn.bettaieb.cineman.utilities;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.entities.Customer;
import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.entities.Salle;
import tn.bettaieb.cineman.services.basic.CinemaServiceLocal;
import tn.bettaieb.cineman.services.basic.FilmServiceLocal;
import tn.bettaieb.cineman.services.basic.SalleServiceLocal;
import tn.bettaieb.cineman.services.basic.UserServiceLocal;

@Singleton
@Startup
public class DBPopulator {
	@EJB
	private UserServiceLocal userServiceLocal;
	@EJB
	private CinemaServiceLocal cinemaServiceLocal;
	@EJB
	private SalleServiceLocal salleServiceLocal;
	@EJB
	private FilmServiceLocal filmServiceLocal;

	public DBPopulator() {
	}

	@PostConstruct
	public void init() {
		Cinema cinema = new Cinema("Colisé");
		Cinema cinema2 = new Cinema("Capitol");

		Salle salle = new Salle("S1");
		Salle salle2 = new Salle("S2");
		Salle salle3 = new Salle("S3");

		Film film = new Film("COCO", "Lee Unkrich");
		Film film2 = new Film("La Promesse", "Terry George");

		List<Salle> salles = new ArrayList<>();
		salles.add(salle);
		salles.add(salle2);

		cinema.linkSallesToThisCinema(salles);

		List<Salle> salles2 = new ArrayList<>();
		salles2.add(salle3);

		cinema2.linkSallesToThisCinema(salles2);

		Customer customer = new Customer();
		customer.setName("daly");

		userServiceLocal.update(customer);
		cinemaServiceLocal.update(cinema);
		cinemaServiceLocal.update(cinema2);

		filmServiceLocal.update(film);
		filmServiceLocal.update(film2);

	}
}
