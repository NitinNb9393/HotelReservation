package com.bridgelabz.HotelReservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	HotelReservationSystem Obj = new HotelReservationSystem();

	@Test
	public void checkAllThreeHotelsAreAdded() {
		Obj.addHotelDetails();
		Assert.assertEquals(3, Obj.hotelList.size());
	}
}