package com.revature.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Campaign;
import com.revature.models.Character;
import com.revature.models.User;

public interface ICharacterDAO extends JpaRepository<Character, Integer> {
	List<Character> findByPlayer(User u);
	List<Character> findByCampaign(Campaign c);
}
