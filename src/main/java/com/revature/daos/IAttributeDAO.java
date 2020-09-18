package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Attribute;

public interface IAttributeDAO extends JpaRepository<Attribute, Integer> {

}
