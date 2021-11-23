package com.bridgelabz.HotelReservation;

public class Hotel {
	private String hotelName;
	private int hotelRegularRate;

	public Hotel(String lakeWood, String hotelName, int i, int hotelRegularRate) {
		this.hotelName = hotelName;
		this.hotelRegularRate = hotelRegularRate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getHotelRegularRate() {
		return hotelRegularRate;
	}

	public void setHotelRegularRate(int hotelRegularRate) {
		this.hotelRegularRate = hotelRegularRate;
	}
}