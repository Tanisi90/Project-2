package com.revature.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Campaign;
import com.revature.models.User;

public interface ICampaignDAO extends JpaRepository<Campaign, Integer> {
	List<Campaign> findByDm(User u);
}
