package com.fms.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.fms.dto.Flight;

public class FlightDao {
	
	 public FlightDao() {
		Flight f1 = new Flight(BigInteger.valueOf(1),"MODEL1", "AIR1", 10);
		Flight f2 = new Flight(BigInteger.valueOf(2),"MODEL2", "AIR2", 10);

		 List<Flight> flightList=new ArrayList<Flight>();
		 flightList.add(f1);
		 flightList.add(f2);
	}
	 
	 
}
