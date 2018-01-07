package tn.bettaieb.cineman.app.client.gui;

import java.util.Date;

import tn.bettaieb.cineman.app.client.delegate.BasicServiceDelegate;

public class TestCreateSession {

	public static void main(String[] args) {
		BasicServiceDelegate.openFilmSession(1, 1, new Date(), "night", 20, 15);

	}

}
