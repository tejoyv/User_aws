package com.project.User.dto;

import com.project.User.entity.Cart;

public class CartDTO {

	int BUYERID;
	int PRODID;
	int QUANTITY;
	
	public CartDTO() {
		super();
	}

	public CartDTO(int BUYERID, int PRODID, int QUANTITY) {
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
	
	//convert entity to dto
	public static CartDTO valueOf(Cart cart) {
		CartDTO cartDTO = new CartDTO();
		cartDTO.setBUYERID(cart.getBUYERID());
		cartDTO.setPRODID(cart.getPRODID());
		cartDTO.setQUANTITY(cart.getQUANTITY());
		return cartDTO;
	}
	
	//convert dto to entity
	public Cart createEntity() {
		Cart cart = new Cart();
		cart.setBUYERID(this.getBUYERID());
		cart.setPRODID(this.getPRODID());
		cart.setQUANTITY(this.getQUANTITY());
		return cart;
	}

	@Override
	public String toString() {
		return "CartDTO [BUYERID=" + BUYERID + ", PRODID=" + PRODID + ", QUANTITY=" + QUANTITY + "]";
	}
	
	
}
