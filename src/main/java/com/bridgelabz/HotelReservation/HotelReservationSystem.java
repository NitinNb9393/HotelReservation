package com.bridgelabz.HotelReservation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelReservationSystem {
	private List<Hotel> hotels;

	public HotelReservationSystem() {
		this.hotels = new ArrayList<>();
	}

	public boolean addHotel(Hotel hotel) {
		return this.hotels.add(hotel);
	}

	public int findCheapestHotel() {
		int LakeWoodRate = 110;
		int BridgeWoodRate = 160;
		int Ridgewood = 220;
		int cheapestHotel = (LakeWoodRate > BridgeWoodRate) ? (LakeWoodRate > Ridgewood ? LakeWoodRate : Ridgewood)
				: (BridgeWoodRate > Ridgewood ? BridgeWoodRate : Ridgewood);
		System.out.println("The cheapest Hotel is " + cheapestHotel);
		return cheapestHotel;
	}

	public void weekday_weekend_rate() {
		String hotel = null;
		if (hotel == "LakeWood") {
			int weekday_rate = 110;
			int weekend_rate = 90;
			System.out.println("Weekday Rate of Regular Customers of LakeWood Hotel:" + weekday_rate);
			System.out.println("Weekend Rate of Regular Customers of LakeWood Hotel:" + weekend_rate);
		}
		if (hotel == "BridgeWood") {
			int weekday_rate = 150;
			int weekend_rate = 50;
			System.out.println("Weekday Rate of Regular Customers of BridgeWood Hotel:" + weekday_rate);
			System.out.println("Weekend Rate of Regular Customers of BridgeWood Hotel:" + weekend_rate);
		}
		if (hotel == "RidgeWood") {
			int weekday_rate = 220;
			int weekend_rate = 150;
			System.out.println("Weekday Rate of Regular Customers of RidgeWood Hotel:" + weekday_rate);
			System.out.println("Weekend Rate of Regular Customers of RidgeWood Hotel:" + weekend_rate);
		}
	}

	public static void main(String[] args) throws Exception {
		HotelReservationSystem Lakewood = new HotelReservationSystem();
		HotelReservationSystem Bridgewood = new HotelReservationSystem();
		HotelReservationSystem Ridgewood = new HotelReservationSystem();
		Lakewood.weekday_weekend_rate();
		;
		Bridgewood.weekday_weekend_rate();
		Ridgewood.weekday_weekend_rate();
	}

}