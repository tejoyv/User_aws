package com.project.User.entity;

import java.io.Serializable;

public class BuyerProductId implements Serializable {

	int BUYERID;
	int PRODID;
	
	public BuyerProductId() {
		super();
	}

	public BuyerProductId(int BUYERID, int PRODID) {
		super();
		this.BUYERID = BUYERID;
		this.PRODID = PRODID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + BUYERID;
		result = prime * result + PRODID;
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
		BuyerProductId other = (BuyerProductId) obj;
		if (BUYERID != other.BUYERID)
			return false;
		if (PRODID != other.PRODID)
			return false;
		return true;
	}

	public int getBUYERID() {
		return BUYERID;
	}

	public void setBUYERID(int bUYERID) {
		BUYERID = bUYERID;
	}

	public int getPRODID() {
		return PRODID;
	}

	public void setPRODID(int pRODID) {
		PRODID = pRODID;
	}	
}
