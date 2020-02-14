package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TripDetails")
@AllArgsConstructor
@NoArgsConstructor	
public class Trip {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trip_id;
	private String trip_source;
	private String trip_Destination;
	private int user_id;
	private int  car_id;
	

}
