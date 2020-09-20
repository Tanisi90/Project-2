package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.models.Class;

public interface IClassDAO extends JpaRepository<Class, Integer> {

}
