package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CarDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carId;
	private long registrationNumber;
	private String carBrand;
	private int carRating;	
	
	@Enumerated(EnumType.STRING)
	private CarCategory carCategory;	
	private int categoryId;
	private boolean deleteStatus;
	
	
	

}



