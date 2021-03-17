package com.project.User.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int SELLERID;
	@Column(nullable = false)
	String NAME;
	@Column(nullable = false)
    String EMAIL;
	@Column(nullable = false)
    String PHONENUMBER;
	@Column(nullable = false)
    String PASSWORD;
	@Column
    int ISACTIVE;
	
	public Seller() {
		super();
	}

	public Seller(int SELLERID, String NAME, String EMAIL, String PHONENUMBER, String PASSWORD, int ISACTIVE) {
		super();
		this.SELLERID = SELLERID;
		this.NAME = NAME;
		this.EMAIL = EMAIL;
		this.PHONENUMBER = PHONENUMBER;
		this.PASSWORD = PASSWORD;
		this.ISACTIVE = ISACTIVE;
	}

	public int getSellerId() {
		return SELLERID;
	}

	public void setSellerId(int SELLERID) {
		this.SELLERID = SELLERID;
	}

	public String getName() {
		return NAME;
	}

	public void setName(String NAME) {
		this.NAME = NAME;
	}

	public String getEmail() {
		return EMAIL;
	}

	public void setEmail(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	public String getPhoneNumber() {
		return PHONENUMBER;
	}

	public void setPhoneNumber(String PHONENUMBER) {
		this.PHONENUMBER = PHONENUMBER;
	}

	public String getPassword() {
		return PASSWORD;
	}

	public void setPassword(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}

	public int getIsActive() {
		return ISACTIVE;
	}

	public void setISACTIVE(int ISACTIVE) {
		this.ISACTIVE = ISACTIVE;
	}
	
	
}
