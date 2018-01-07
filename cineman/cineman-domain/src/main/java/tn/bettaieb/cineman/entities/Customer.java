package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.bettaieb.cineman.entities.User;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer extends User implements Serializable {

	
	private String pictureUrl;
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}   
	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
   
}
