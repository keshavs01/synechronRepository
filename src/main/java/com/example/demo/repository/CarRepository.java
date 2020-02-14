package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.entity.Car;
import com.example.demo.entity.CarCategory;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {	
	
	Car findByRegistrationNumber(long regNo);
	
	@Transactional
	@Modifying
	@Query("update Car c set c.deleteStatus = :deleteStatus where c.carId =:carId")
	void updateStatus(Boolean deleteStatus, int carId);
	
	List<Car> findByDeleteStatus(boolean status);

	List<Car> findByCarCategoryAndDeleteStatus(CarCategory category, boolean b);
}
