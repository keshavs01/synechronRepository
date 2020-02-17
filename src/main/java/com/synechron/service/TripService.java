package com.synechron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.entity.Trip;
import com.synechron.repo.TripRepository;

@Service
public class TripService {

	@Autowired
	TripRepository tripRepository;

	public Trip addTrip(Trip trip) {
		return tripRepository.save(trip);

	}

}
