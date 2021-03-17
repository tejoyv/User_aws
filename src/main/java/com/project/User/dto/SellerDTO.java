package com.project.User.dto;
import com.project.User.entity.Seller;

public class SellerDTO {
    int SELLERID;
    String NAME;
    String EMAIL;
    String PHONENUMBER;
    String PASSWORD;
    int ISACTIVE;
    
	public SellerDTO() {
		super();
	}

	public SellerDTO(int sellerid, String name, String email, String phoneNumber, String password, int isActive) {
		super();
		this.SELLERID = sellerid;
		this.NAME = name;
		this.EMAIL = email;
		this.PHONENUMBER = phoneNumber;
		this.PASSWORD = password;
		this.ISACTIVE = isActive;
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

	public void setName(String name) {
		this.NAME = name;
	}

	public String getEmail() {
		return EMAIL;
	}

	public void setEmail(String email) {
		this.EMAIL = email;
	}

	public String getPhoneNumber() {
		return PHONENUMBER;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PHONENUMBER = phoneNumber;
	}

	public String getPassword() {
		return PASSWORD;
	}

	public void setPassword(String password) {
		this.PASSWORD = password;
	}

	public int getIsActive() {
		return ISACTIVE;
	}

	public void setIsActive(int isActive) {
		this.ISACTIVE = isActive;
	}
	
	// Converts Entity into DTO
	public static SellerDTO valueOf(Seller seller) {
		SellerDTO sellerDTO = new SellerDTO();
		sellerDTO.setSellerId(seller.getSellerId());
		sellerDTO.setEmail(seller.getEmail());
		sellerDTO.setIsActive(seller.getIsActive());
		sellerDTO.setName(seller.getName());
		sellerDTO.setPassword(seller.getPassword());
		sellerDTO.setPhoneNumber(seller.getPhoneNumber());
		return sellerDTO;
	}
	
	// Converts DTO into Entity
	public Seller createEntity() {
		Seller seller = new Seller();
		seller.setEmail(this.getEmail());
		seller.setISACTIVE(this.getIsActive());
		seller.setName(this.getName());
		seller.setPassword(this.getPassword());
		seller.setPhoneNumber(this.getPhoneNumber());
		seller.setSellerId(this.getSellerId());
		return seller;
	}

	@Override
	public String toString() {
		return "SellerDTO [sellerId=" + SELLERID + ", name=" + NAME + ", email=" + EMAIL + ", phoneNumber="
				+ PHONENUMBER + ", password=" + PASSWORD + ", isActive=" + ISACTIVE + "]";
	}
    
	
}
