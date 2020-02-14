package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="DriverDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int driverId;
	@Column(name="First_Name", length=50)
	private String firstName;
	@Column(name="Last_Name", length=50)
	private String lastName;
	@Column(name="Phone_Number", length=10)
	private long phoneNumber;
	private String city;
	@Column(name="Rating")
	private int driverRating;
	@Column(name="Status")
	private boolean deleteStatus;

}
