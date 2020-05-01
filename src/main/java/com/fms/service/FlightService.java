package com.fms.service;

import java.util.List;
import java.math.BigInteger;

import com.fms.dto.Flight;

public interface FlightService {
	
    public Flight addFlight(Flight flight);				//Adding the flight 

	
	public List<Flight> viewAllFlight();					//To view all the flights available

	public Flight viewFlight(BigInteger flightNumber);		//To search flight with flight Id

	public Flight modifyFlight(Flight flight);				//To modify flight
			
	public boolean deleteFlight(BigInteger flightNumber);		//To remove flight


	


	

}

