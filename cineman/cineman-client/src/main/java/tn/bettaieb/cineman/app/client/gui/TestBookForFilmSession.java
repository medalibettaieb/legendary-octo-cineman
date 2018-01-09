package tn.bettaieb.cineman.app.client.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tn.bettaieb.cineman.app.client.delegate.BasicServiceDelegate;
import tn.bettaieb.cineman.app.client.delegate.BookingServiceDelegate;
import tn.bettaieb.cineman.entities.PaymentMethod;
import tn.bettaieb.cineman.entities.User;

public class TestBookForFilmSession {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		User client = BasicServiceDelegate.findUserById(1);
		Date dateOfSession = dateFormat.parse("2018-01-09");
		BookingServiceDelegate.bookForFilm(2, dateOfSession, PaymentMethod.BANKCARD, client, 1, 1);

	}

}
