package com.bridgelabz.HotelReservation;

import java.util.ArrayList;

public class HotelReservationSystem {

	public ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System ");
	}

	public void addHotelDetails() {
		hotelList.add(new Hotel("Lakewood", "Regular", 110, 90, 80, 80, 3));
		hotelList.add(new Hotel("Bridgewood ", "Regular", 160, 110, 60, 50, 4));
		hotelList.add(new Hotel("Lakewood", "Regular", 220, 100, 150, 40, 5));
	}
}