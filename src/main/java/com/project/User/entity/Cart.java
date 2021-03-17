package com.project.User.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(BuyerProductId.class)
public class Cart {
     
	@Id
	int BUYERID;
	@Id
	int PRODID;
	@Column(nullable = false)
	int QUANTITY;
	
	public Cart() {
		super();
	}

	public Cart(int BUYERID, int PRODID, int QUANTITY) {
		super();
		this.BUYERID = BUYERID;
		this.PRODID = PRODID;
		this.QUANTITY = QUANTITY;
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

	public int getQUANTITY() {
		return QUANTITY;
	}

	public void setQUANTITY(int QUANTITY) {
		this.QUANTITY = QUANTITY;
	}
	
	
	
}
