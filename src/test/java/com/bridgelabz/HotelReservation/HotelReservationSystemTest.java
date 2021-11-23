package com.bridgelabz.HotelReservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	HotelReservationSystem hotelReservation = new HotelReservationSystem();

	@Test
	public void add_Hotels() {
		Assert.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "LakeWood", 110, 110)));
		Assert.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "Bridgewood", 110, 160)));
		Assert.assertTrue(hotelReservation.addHotel(new Hotel("LakeWood", "Ridgewood", 110, 220)));
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
}