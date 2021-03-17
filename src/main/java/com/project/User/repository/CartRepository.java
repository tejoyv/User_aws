package com.project.User.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.User.entity.BuyerProductId;
import com.project.User.entity.Cart;
import com.project.User.entity.Wishlist;

public interface CartRepository extends JpaRepository<Cart, BuyerProductId>{
	public List<Cart> findByBUYERID(int buyerid);
}
