package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class BookingDetailId implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private int clientId;
	private int filmId;
	private int salleId;
	private Date dateOfSession;

	public BookingDetailId() {
	}

	public BookingDetailId(int clientId, int filmId, int salleId, Date dateOfSession) {
		super();
		this.clientId = clientId;
		this.filmId = filmId;
		this.salleId = salleId;
		this.dateOfSession = dateOfSession;
	}

	

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public int getSalleId() {
		return salleId;
	}

	public void setSalleId(int salleId) {
		this.salleId = salleId;
	}

	public Date getDateOfSession() {
		return dateOfSession;
	}

	public void setDateOfSession(Date dateOfSession) {
		this.dateOfSession = dateOfSession;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clientId;
		result = prime * result + ((dateOfSession == null) ? 0 : dateOfSession.hashCode());
		result = prime * result + filmId;
		result = prime * result + salleId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetailId other = (BookingDetailId) obj;
		if (clientId != other.clientId)
			return false;
		if (dateOfSession == null) {
			if (other.dateOfSession != null)
				return false;
		} else if (!dateOfSession.equals(other.dateOfSession))
			return false;
		if (filmId != other.filmId)
			return false;
		if (salleId != other.salleId)
			return false;
		return true;
	}

}
