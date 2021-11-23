package com.bridgelabz.HotelReservation;

import java.util.ArrayList;

public class HotelReservationSystem {
	// ArrayList to store Hotel details
	public ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System ");
	}

	// Created method to add hotes in the list
	public void addHotelDetails() {
		hotelList.add(new Hotel("Lakewood", "Regular", 110, 90, "Reward", 80, 80, 3));
		hotelList.add(new Hotel("Bridgewood", "Regular", 160, 110, "Reward", 60, 50, 4));
		hotelList.add(new Hotel("Lakewood", "Regular", 220, 100, "Reward", 150, 40, 5));
	}

	// Find the cheapest hotel
	public void findCheapestHotel() {
		int LakeWood_Rate = 110, BridgeWood_Rate = 160, RidgeWood_Rate = 220;
		int LakeWoodRate1 = (LakeWood_Rate * 2);
		int BridgeWoodRate1 = (BridgeWood_Rate * 2);
		int RidgeWoodRate1 = (RidgeWood_Rate * 2);
		int min = LakeWoodRate1;
		if (min > BridgeWoodRate1) {
			System.out.println("BridgeWood");
			System.out.println(BridgeWood_Rate);
		} else if (min > RidgeWoodRate1) {
			System.out.println("RidgeWood");
			System.out.println(RidgeWood_Rate);
		} else {
			System.out.println("LakeWood");
			System.out.println(LakeWoodRate1);
		}
	}
}