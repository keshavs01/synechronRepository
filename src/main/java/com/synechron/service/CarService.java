package com.synechron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.entity.Car;
import com.synechron.repo.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;

	public Car addCar(Car car) {
		return carRepository.save(car);
	}

	public List<Car> viewAllCars() {
		return carRepository.findAll();
	}

	public Car getCarById(Long carId) {
		return carRepository.findById(carId).get();
	}

	public void deleteCarById(Long carId) {
		carRepository.deleteById(carId);
	}

}
