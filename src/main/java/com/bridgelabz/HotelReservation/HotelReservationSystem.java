package com.bridgelabz.HotelReservation;

import java.text.ParseException;
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

	public void cheapestWeekdayWeekendHotel() {
		String hotel = null;
		int sum_LakeWood = 0, sum_BridgeWood = 0, sum_RidgeWood = 0;
		if (hotel == "LakeWood") {
			int weekday_rate = 110;
			int weekend_rate = 90;
			sum_LakeWood = (sum_LakeWood + weekday_rate + weekend_rate);
			System.out.println("Total Weekday and Weekend rate of LakeWood Hotel:" + sum_LakeWood);
		}
		if (hotel == "BridgeWood") {
			int weekday_rate = 150;
			int weekend_rate = 50;
			sum_BridgeWood = (sum_BridgeWood + weekday_rate + weekend_rate);
			System.out.println("Total Weekday and Weekend rate of BridgeWood Hotel:" + sum_BridgeWood);
		}
		if (hotel == "RidgeWood") {
			int weekday_rate = 220;
			int weekend_rate = 150;
			sum_RidgeWood = (sum_RidgeWood + weekday_rate + weekend_rate);
			System.out.println("Total Weekday and Weekend rate of RidgeWood Hotel:" + sum_RidgeWood);
		}
		if (sum_LakeWood <= sum_BridgeWood && sum_LakeWood < sum_RidgeWood) {
			System.out.println("LakeWood and BridgeWood with total rates $200.");
		}
		if (sum_BridgeWood <= sum_LakeWood && sum_BridgeWood < sum_RidgeWood) {
			System.out.println("LakeWood and BridgeWood with total rates $200.");
		}
		if (sum_RidgeWood < sum_LakeWood && sum_RidgeWood < sum_BridgeWood) {
			System.out.println("RidgeWood with total rates $370.");
		}
	}

	public void hotel_rating() {
		String hotel = null;
		if (hotel == "LakeWood") {
			System.out.println("LakeWood rating is 3.");
		}
		if (hotel == "BridgeWood") {
			System.out.println("LakeWood rating is 4.");
		}
		if (hotel == "RidgeWood") {
			System.out.println("LakeWood rating is 5.");
		}
	}

	public void cheapest_bestRated_hotel() {
		String hotel = null;
		int sum_LakeWood = 0, sum_BridgeWood = 0, sum_RidgeWood = 0;
		int LakeWood_Rate = 3, BridgeWood_Rate = 4, RidgeWood_Rate = 5;
		if (hotel == "LakeWood") {
			int weekday_rate = 110;
			int weekend_rate = 90;
			sum_LakeWood = (sum_LakeWood + weekday_rate + weekend_rate);
		}
		if (hotel == "BridgeWood") {
			int weekday_rate = 150;
			int weekend_rate = 50;
			sum_BridgeWood = (sum_BridgeWood + weekday_rate + weekend_rate);
		}
		if (hotel == "RidgeWood") {
			int weekday_rate = 220;
			int weekend_rate = 150;
			sum_RidgeWood = (sum_RidgeWood + weekday_rate + weekend_rate);
		}
		if ((sum_BridgeWood <= sum_LakeWood && sum_BridgeWood < sum_RidgeWood)
				&& (LakeWood_Rate < BridgeWood_Rate && BridgeWood_Rate < RidgeWood_Rate)) {
			System.out.println("BridgeWood");
			System.out.println("Rating:" + BridgeWood_Rate);
			System.out.println("Total Rates: $" + sum_BridgeWood);
		}
	}

	public static void main(String[] args) throws Exception {
		Hotel hotel1 = new Hotel("LakeWood", "Regular", 110, 90, 3);
		Hotel hotel2 = new Hotel("BridgeWood", "Regular", 150, 50, 4);
		Hotel hotel3 = new Hotel("RidgeWood", "Regular", 220, 150, 5);
		String sDate1 = "10-09-2020";
		String sDate2 = "11-09-2020";
		Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
		Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
		System.out.println(sDate1 + "\t" + date1);
		System.out.println(sDate2 + "\t" + date2);
		HotelReservationSystem hotel = new HotelReservationSystem();
		hotel.weekday_weekend_rate();
		;
		hotel.cheapestWeekdayWeekendHotel();
		hotel.hotel_rating();
		hotel.cheapest_bestRated_hotel();
	}
}