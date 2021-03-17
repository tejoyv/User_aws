package com.project.User.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(BuyerProductId.class)
@Table(name = "wishlist")
public class Wishlist {
	@Id
	int BUYERID;
	@Id
	int PRODID;
	
	//default constructor
	public Wishlist() {
		super();
	}
	
	//parameterized constructor
	public Wishlist(int BUYERID, int PRODID) {
		super();
		this.BUYERID = BUYERID;
		this.PRODID = PRODID;
	}

	public int getBUYERID() {
		return BUYERID;
	}

	public void setBUYERID(int BUYERID) {
		this.BUYERID = BUYERID;
	}

	public int getPRODID() {
		return PRODID;
	}

	public void setPRODID(int PRODID) {
		this.PRODID = PRODID;
	}
	
	
}
