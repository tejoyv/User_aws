package com.project.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.User.entity.BuyerProductId;
import com.project.User.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist,BuyerProductId>{
	public Wishlist findByBUYERID(Integer buyerid);
}
