package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Driver;


@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
	
	List<Driver> findByDeleteStatus(boolean status);
	
	List<Driver> findByCity(String city);

	Driver findByPhoneNumber(long phoneNumber);
	
	@Transactional
	@Modifying
	@Query("update Driver d set d.deleteStatus = :deleteStatus where d.driverId =:driverId")
	void updateStatus(Boolean deleteStatus, int driverId);
	
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query("update Driver d set d.deleteStatus = :deleteStatus where d.driverId =:driverId"
	 * ) void showDriversByCity(Boolean deleteStatus, int driverId);
	 */
	
}
