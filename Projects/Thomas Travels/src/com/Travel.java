package com;

import com.Driver;

public class Travel {
	public boolean isCarDriver(Driver d) {
		if (d.getCategory().equals("car")) {
			return true;
		} else {
			return false;
		}
	}

	public String retrivebyDriverId(Driver[] drivers, int driverId) {
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

	public int retriveCountOfDriver(Driver[] drivers, String category) {
		int countOfDriver = 0;
		for (Driver driver : drivers) {
			if (driver.getCategory().equals(category)) {
				countOfDriver++;
			}
		}
		return countOfDriver;
	}

	public Driver[] retriveDriver(Driver [] drivers, String category) {
		Driver[] driversInCategory = new Driver[3];
		int index = 0;
		for (Driver driver : drivers) {
			if (driver.getCategory().equals(category)) {
				driversInCategory[index++] = driver;
			}
		}
		return driversInCategory;
	}

	public Driver retriveMaximumDistanceTravelledDriver(Driver[] drivers) {
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
		return drivers[0];
	}
}
