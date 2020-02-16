package com.synechron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.entity.Driver;
import com.synechron.repo.DriverRepository;

@Service
public class DriverService {

	@Autowired
	DriverRepository driverRepository;

	public Driver addDriver(Driver driver) {
		Driver driver2 = driverRepository.save(driver);
		System.out.println(driver2);
		return driver2;
	}

	public List<Driver> viewAllDrivers() {
		return driverRepository.findAll();
	}

	public Driver getDriverById(Long driverId) {
		return driverRepository.findById(driverId).get();
	}

	public void deleteDriverById(Long driverId) {
		driverRepository.deleteById(driverId);
	}

}
