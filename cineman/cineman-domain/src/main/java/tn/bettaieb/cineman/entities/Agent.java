package tn.bettaieb.cineman.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.bettaieb.cineman.entities.User;

/**
 * Entity implementation class for Entity: Agent
 *
 */
@Entity

public class Agent extends User implements Serializable {

	
	private String level;
	private static final long serialVersionUID = 1L;

	public Agent() {
		super();
	}   
	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
   
}
