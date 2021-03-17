package com.project.User.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.User.dto.BuyerDTO;
import com.project.User.entity.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
	public Buyer findByEMAIL(String email);
	public Buyer deleteByEMAIL(String email);
	public Optional<Buyer> findByPHONENUMBER(String phonenumber);
	public Buyer findByBUYERID(Integer buyerid);
}
