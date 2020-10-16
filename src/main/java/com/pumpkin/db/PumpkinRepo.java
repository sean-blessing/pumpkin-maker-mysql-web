package com.pumpkin.db;

import org.springframework.data.repository.CrudRepository;

import com.pumpkin.business.Pumpkin;

public interface PumpkinRepo extends CrudRepository<Pumpkin, Integer> {

}
