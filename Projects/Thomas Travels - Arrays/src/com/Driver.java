package com;

public class Driver {
	private String category;
	private String driverName;
	private int driverId;
	private int totalDistance;

	Driver() {

	}

	Driver(int driverId, String category, String driverName, int totalDistance) {
		this.driverId = driverId;
		this.category = category;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}

	public String getCategory() {
		return category;
	}

	public int getDriverId() {
		return driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public int getTotalDistance() {
		return totalDistance;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}
}
