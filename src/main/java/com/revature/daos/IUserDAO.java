package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.User;

import lombok.Getter;

public interface IUserDAO extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
