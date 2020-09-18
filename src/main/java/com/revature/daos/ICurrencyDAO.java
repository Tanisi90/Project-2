package com.revature.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Currency;

public interface ICurrencyDAO extends JpaRepository<Currency, Integer> {

}
