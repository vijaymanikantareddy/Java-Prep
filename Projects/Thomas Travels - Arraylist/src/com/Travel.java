package com;

import java.util.ArrayList;
import com.Driver;

public class Travel {
	public boolean isCarDriver(Driver d) {
		if (d.getCategory().equals("car")) {
			return true;
		} else {
			return false;
		}
	}

	public String retrivebyDriverId(ArrayList<Driver> drivers, int driverId) {
		Driver needDriver = null;
		for (Driver driver : drivers) {
			if (driver.getDriverId() == driverId) {
				needDriver = driver;
				break;
			}
		}
		String result = "Driver name is " + needDriver.getDriverName() +
				" Belonging to the category " + needDriver.getCategory() + " traveled " + needDriver.getTotalDistance()
				+ " KM so far.";
		return result;
	}

	public int retriveCountOfDriver(ArrayList<Driver> drivers, String category) {
		int countOfDriver = 0;
		for (Driver driver : drivers) {
			if (driver.getCategory().equals(category)) {
				countOfDriver++;
			}
		}
		return countOfDriver;
	}

	public ArrayList<Driver> retriveDriver(ArrayList<Driver> drivers, String category) {
		ArrayList<Driver> driversInCategory = new ArrayList<>();
		for (Driver driver : drivers) {
			if (driver.getCategory().equals(category)) {
				driversInCategory.add(driver);
			}
		}
		return driversInCategory;
	}

	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		int maxDistance = 0;
		for (Driver driver : drivers) {
			if (driver.getTotalDistance() > maxDistance) {
				maxDistance = driver.getTotalDistance();
			}
		}
		for (Driver driver : drivers) {
			if (driver.getTotalDistance() == maxDistance) {
				return driver;
			}
		}
		return drivers.getFirst();
	}
}
