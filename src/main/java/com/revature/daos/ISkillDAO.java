package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Skill;

public interface ISkillDAO extends JpaRepository<Skill, Integer> {

}
