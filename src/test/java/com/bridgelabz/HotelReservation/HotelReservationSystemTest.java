package com.bridgelabz.HotelReservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	HotelReservationSystem hotelReservation = new HotelReservationSystem();

	@Test
	public void add_Hotels() {
		Assert.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "Regular", 110, 90, 3)));
		Assert.assertTrue(hotelReservation.addHotel(new Hotel("Bridgewood", "Regular", 150, 50, 4)));
		Assert.assertTrue(hotelReservation.addHotel(new Hotel("Ridgewood", "Regular", 220, 150, 5)));
	}

	@Test
	public void toFindTheCheapestHotel() {
		HotelReservationSystem cheapHotel = new HotelReservationSystem();
		cheapHotel.findCheapestHotel();
	}

	@Test
	public void addWeekdayAndWeekendRate() {
		HotelReservationSystem weekdayWeekend = new HotelReservationSystem();
		weekdayWeekend.weekday_weekend_rate();
	}

	@Test
	public void toFindTheCheapestHotel_OnWeekdayAndWeekend() {
		HotelReservationSystem cheapHotel = new HotelReservationSystem();
		cheapHotel.cheapestWeekdayWeekendHotel();
	}

	@Test
	public void addRatings() {
		HotelReservationSystem ratings = new HotelReservationSystem();
		ratings.hotel_rating();
	}

	@Test
	public void toFindTheCheapestBestRatedHotelOnWeekdayAndWeekend() {
		HotelReservationSystem cheapBestHotel = new HotelReservationSystem();
		cheapBestHotel.cheapest_bestRated_hotel();
	}
}