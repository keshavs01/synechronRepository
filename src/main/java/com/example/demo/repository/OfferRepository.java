package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.example.demo.entity.Driver;
import com.example.demo.entity.Offer;


@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {
	
	
	//List<Offer> findAll();
	
	/*
	 * @Query(value = "from Offer off where :today BETWEEN :startDate AND :endDate")
	 * public List<Offer> getAllBetweenDates(@Param("startDate")Date
	 * startDate,@Param("endDate")Date endDate,Date today);
	 */
	
	
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value = "from Offer off where :today BETWEEN :startDate AND :endDate")
	 * public List<Offer> getAllBetweenDates(Date today,Date
	 * startDate,@Param("endDate")Date endDate);
	 * 
	 * void findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(Date endDate,
	 * Date startDate);
	 */
	

	
	
	
}
