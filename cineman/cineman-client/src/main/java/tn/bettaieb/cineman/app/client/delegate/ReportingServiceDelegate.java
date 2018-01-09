package tn.bettaieb.cineman.app.client.delegate;

import java.util.List;

import tn.bettaieb.cineman.app.client.locator.ServiceLocator;
import tn.bettaieb.cineman.entities.Cinema;
import tn.bettaieb.cineman.entities.Film;
import tn.bettaieb.cineman.services.business.ReportingServiceRemote;

public class ReportingServiceDelegate {
	private static final String jndiNameReportingService = "cineman-ear/cineman-service/ReportingService!tn.bettaieb.cineman.services.business.ReportingServiceRemote";

	private static ReportingServiceRemote getProxyOnReportingServiceRemote() {
		return (ReportingServiceRemote) ServiceLocator.getInstance().getProxy(jndiNameReportingService);

	}

	public static List<Film> findFilmsByCinema(Cinema cinema) {
		return getProxyOnReportingServiceRemote().findFilmsByCinema(cinema);

	}
}
