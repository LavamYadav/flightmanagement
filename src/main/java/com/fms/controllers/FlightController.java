package com.fms.controllers;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fms.dto.Flight;
import com.fms.service.FlightService;

@Controller
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping(value = "/flight/view")
	public ResponseEntity<?> getAllData()
	{
		List<Flight> flightList = flightService.viewAllFlight();
		if (flightList.isEmpty()) 
		{
			
			return new ResponseEntity("No Flight Present", null);
		}
		else 
		{
			
			return new ResponseEntity<List<Flight>>(flightList, null);
		}
	}
	@GetMapping(value = "/flight/search")
	public ResponseEntity<?> searchData(@RequestParam BigInteger flightNumber)
	{
		Flight flightSearched = flightService.viewFlight(flightNumber);

		if (flightSearched == null) {
			
			return new ResponseEntity<Object>("Flight not present", null);
		} else {
			
			return new ResponseEntity<Flight>(flightSearched, null);
		}
	}
	@PutMapping(value = "/flight/modify")
	public ResponseEntity<Flight> modifyData(@RequestBody Flight flight){

		
		Flight flightToBeModified = flightService.modifyFlight(flight);

		if (flightToBeModified == null) {
			
			return new ResponseEntity("Flight not modified", null);
		} 
		else 
		{
			return new ResponseEntity<Flight>(flightToBeModified, null);
		}

	}
	@DeleteMapping(value = "/flight/delete")
	public boolean deleteData(@RequestParam BigInteger flightNumber) {
		
		boolean flightToBeDeleted = flightService.deleteFlight(flightNumber);
		
		return flightToBeDeleted;

	}

	
}
