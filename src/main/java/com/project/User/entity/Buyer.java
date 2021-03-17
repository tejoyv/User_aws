package com.project.User.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyer")
public class Buyer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int BUYERID;
	@Column(nullable = false)
	String NAME;
	@Column(nullable = false)
	String PASSWORD;
	@Column(nullable = false)
	String EMAIL;
	@Column(nullable = false)
	String PHONENUMBER;
	@Column
	int ISPRIVILEGED;
	@Column
	int REWARDPOINTS;
	@Column
	int ISACTIVE;
	
	//parameterless constructor
	public Buyer() {
		super();
	}
    //parametrized constructor
	public Buyer(int BUYERID, String NAME, String PASSWORD, String EMAIL, String PHONENUMBER,int ISPRIVILEGED,
			int REWARDPOINTS, int ISACTIVE) {
		super();
		this.BUYERID = BUYERID;
		this.NAME = NAME;
		this.PASSWORD = PASSWORD;
		this.EMAIL = EMAIL;
		this.PHONENUMBER = PHONENUMBER;
		this.ISPRIVILEGED = ISPRIVILEGED;
		this.REWARDPOINTS = REWARDPOINTS;
		this.ISACTIVE = ISACTIVE;
	}
    //getters and setters
	public int getBuyerId() {
		return BUYERID;
	}

	public void setBuyerId(int BUYERID) {
		this.BUYERID = BUYERID;
	}

	public String getName() {
		return NAME;
	}

	public void setName(String NAME) {
		this.NAME = NAME;
	}

	public String getPassword() {
		return PASSWORD;
	}

	public void setPassword(String PASSWORD) {
		this.PASSWORD = PASSWORD;
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

	public int getIsPrivileged() {
		return ISPRIVILEGED;
	}

	public void setIsPrivileged(int ISPRIVILEGED) {
		this.ISPRIVILEGED = ISPRIVILEGED;
	}

	public int getRewardPoints() {
		return REWARDPOINTS;
	}

	public void setRewardPoints(int REWARDPOINTS) {
		this.REWARDPOINTS = REWARDPOINTS;
	}

	public int getIsActive() {
		return ISACTIVE;
	}

	public void setIsActive(int ISACTIVE) {
		this.ISACTIVE = ISACTIVE;
	}

	
}
