package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.HitPoints;

public interface IHitPointsDAO extends JpaRepository<HitPoints, Integer> {

}
