package com.project.User.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.User.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer>{
	public Seller findByEMAIL(String email);
	public Seller deleteByEMAIL(String email);
	public Optional<Seller> findByPHONENUMBER(String phoneNumber);
}
