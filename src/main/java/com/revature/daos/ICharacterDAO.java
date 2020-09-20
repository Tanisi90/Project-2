package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.models.Character;

public interface ICharacterDAO extends JpaRepository<Character, Integer> {
	

}
