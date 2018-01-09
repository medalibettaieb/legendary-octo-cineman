package tn.bettaieb.cineman.app.client.gui;

import tn.bettaieb.cineman.app.client.delegate.BasicServiceDelegate;
import tn.bettaieb.cineman.app.client.delegate.ReportingServiceDelegate;
import tn.bettaieb.cineman.entities.Cinema;

public class TestFindFilmsByCinema {

	public static void main(String[] args) {
		Cinema cinema = BasicServiceDelegate.findCinemaById(1);

		System.out.println(ReportingServiceDelegate.findFilmsByCinema(cinema).get(0).getName());

	}

}
