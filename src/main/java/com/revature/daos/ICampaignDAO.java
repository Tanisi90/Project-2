package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Campaign;

public interface ICampaignDAO extends JpaRepository<Campaign, Integer> {

}
