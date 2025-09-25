package com;
import com.Driver;
import java.util.ArrayList;

public class TestDriver {
	public static void main(String args[]) {
		ArrayList<Driver> drivers = new ArrayList<>();
		drivers.add(new Driver(1, "car", "xxx", 2000));
		drivers.add(new Driver(2, "lorry", "yyy", 4000));
		drivers.add(new Driver(3, "auto", "zzz", 1000));
		
		Travel t = new Travel();
		
		// isCarDriver;
		int driverIndex = 0;
		if(t.isCarDriver(drivers.get(driverIndex))) {
			System.out.println("Driver ID : " + drivers.get(driverIndex).getDriverId() + " is a Car Driver");
		}else {
			System.out.println("Driver ID : " + drivers.get(driverIndex).getDriverId() + " is NOT a Car Driver");
		}
		
		// retrivebyDriverId;
		String driverDetails = t.retrivebyDriverId(drivers, 1);
		System.out.println(driverDetails);
		
		// retriveCountOfDriver;
		int countOfDrivers = t.retriveCountOfDriver(drivers, "car");
		System.out.println("Count of Drivers in car Category: " + countOfDrivers);
		
		
		// retriveDriver
		ArrayList<Driver> driversInCategory = new ArrayList<>();
		driversInCategory = t.retriveDriver(driversInCategory, "car");
		for(Driver d: driversInCategory) {
			System.out.println("Category: " + d.getCategory() + " Name: " + d.getDriverName() +
					" ID: " + d.getDriverId() + " Total Distance: " + d.getTotalDistance());
		}
		
		// retriveMaximumDistanceTravelledDriver
		Driver maximumDistanceTravelledDriver = t.retriveMaximumDistanceTravelledDriver(drivers);
		System.out.println("Maximum Distance Travelled Driver : " +maximumDistanceTravelledDriver.getDriverName());
		
	}
}
