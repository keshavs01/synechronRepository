package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int category_id;
	private String category_type;
	private int numberOfPassengers;
	private double costPerKm;
	
	
	

}
