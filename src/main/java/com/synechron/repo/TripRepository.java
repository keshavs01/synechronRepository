package com.synechron.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechron.entity.Driver;
import com.synechron.entity.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

	

}
