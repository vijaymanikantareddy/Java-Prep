package com;
import com.Driver;


public class TestDriver {
	public static void main(String args[]) {
		Driver drivers[] = new Driver[3];
		drivers[0] = new Driver(1, "car", "xxx", 2000);
		drivers[1] = new Driver(2, "lorry", "yyy", 4000);
		drivers[2] = new Driver(3, "auto", "zzz", 1000);
		
		Travel t = new Travel();
		
		// isCarDriver;
		int driverIndex = 0;
		if(t.isCarDriver(drivers[driverIndex])) {
			System.out.println("Driver ID : " + drivers[driverIndex].getDriverId() + " is a Car Driver");
		}else {
			System.out.println("Driver ID : " + drivers[driverIndex].getDriverId() + " is NOT a Car Driver");
		}
		
		// retrivebyDriverId;
		String driverDetails = t.retrivebyDriverId(drivers, 1);
		System.out.println(driverDetails);
		
		// retriveCountOfDriver;
		int countOfDrivers = t.retriveCountOfDriver(drivers, "car");
		System.out.println("Count of Drivers in car Category: " + countOfDrivers);
		
		
		// retriveDriver
		Driver[] driversInCategory = new Driver[3];
		driversInCategory = t.retriveDriver(drivers, "car");
		for(Driver d: driversInCategory) {
			if(d == null) break;
			System.out.println("Category: " + d.getCategory() + " Name: " + d.getDriverName() +
					" ID: " + d.getDriverId() + " Total Distance: " + d.getTotalDistance());
		}
		
		// retriveMaximumDistanceTravelledDriver
		Driver maximumDistanceTravelledDriver = t.retriveMaximumDistanceTravelledDriver(drivers);
		System.out.println("Maximum Distance Travelled Driver : " +maximumDistanceTravelledDriver.getDriverName());
		
	}
}
