package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: FidalityCard
 *
 */
@Entity

public class FidalityCard implements Serializable {

	@Id
	private int id;
	private Date expirationDate;

	@OneToOne(mappedBy = "fidalityCard")
	private User client;
	private static final long serialVersionUID = 1L;

	public FidalityCard() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

}
