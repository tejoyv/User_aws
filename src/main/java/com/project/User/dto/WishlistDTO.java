package com.project.User.dto;

import com.project.User.entity.Wishlist;

public class WishlistDTO {
	int BUYERID;
	int PRODID;
	
	//default constructor
	public WishlistDTO() {
		super();
	}
	
	//parameterized constructor
	public WishlistDTO(int BUYERID, int PRODID) {
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
	
	//convert entity to dto
	public static WishlistDTO valueOf(Wishlist wishlist) {
		WishlistDTO wishlistDTO = new WishlistDTO();
		wishlistDTO.setBUYERID(wishlist.getBUYERID());
		wishlistDTO.setPRODID(wishlist.getPRODID());
		return wishlistDTO;
	}
	
	//convert dto to entity
	public Wishlist createEntity() {
		Wishlist wishlist = new Wishlist();
		wishlist.setBUYERID(this.getBUYERID());
		wishlist.setPRODID(this.getPRODID());
		return wishlist;
	}
}
