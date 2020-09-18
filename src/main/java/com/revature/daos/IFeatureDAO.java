package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Feature;

public interface IFeatureDAO extends JpaRepository<Feature, Integer> {

}
