package com.synechron.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechron.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

	

}
