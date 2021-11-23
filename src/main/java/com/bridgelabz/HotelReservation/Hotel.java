package com.bridgelabz.HotelReservation;

public class Hotel {
	private String hotelName;
	private String customerType1;
	private String customerType2;
	private int weekdayRatesForRegularCustomer;
	private int weekendPriceForRegularCustomer;
	private int weekdayRatesForRewardCustomer;
	private int weekendPriceForRewardCustomer;
	private int rating;

	// Parameterized constructor to initialize instance variable
	public Hotel(String hotelName, String customerType1, int weekdayRatesForRegularCustomer,
			int weekendPriceForRegularCustomer, String customerType2, int weekdayRatesForRewardCustomer,
			int weekendPriceForRewardCustomer, int rating) {
		this.hotelName = hotelName;
		this.customerType1 = customerType1;
		this.customerType2 = customerType2;
		this.weekdayRatesForRegularCustomer = weekdayRatesForRegularCustomer;
		this.weekendPriceForRegularCustomer = weekendPriceForRegularCustomer;
		this.weekdayRatesForRewardCustomer = weekdayRatesForRewardCustomer;
		this.weekendPriceForRewardCustomer = weekendPriceForRewardCustomer;
		this.rating = rating;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCustomerType1() {
		return customerType1;
	}

	public void setCustomerType1(String customerType1) {
		this.customerType1 = customerType1;
	}

	public String getCustomerType2() {
		return customerType2;
	}

	public void setCustomerType2(String customerType2) {
		this.customerType2 = customerType2;
	}

	public int getWeekdayRatesForRegularCustomer() {
		return weekdayRatesForRegularCustomer;
	}

	public void setWeekdayRatesForRegularCustomer(int weekdayRatesForRegularCustomer) {
		this.weekdayRatesForRegularCustomer = weekdayRatesForRegularCustomer;
	}

	public int getWeekendPriceForRegularCustomer() {
		return weekendPriceForRegularCustomer;
	}

	public void setWeekendPriceForRegularCustomer(int weekendPriceForRegularCustomer) {
		this.weekendPriceForRegularCustomer = weekendPriceForRegularCustomer;
	}

	public int getWeekdayRatesForRewardCustomer() {
		return weekdayRatesForRewardCustomer;
	}

	public void setWeekdayRatesForRewardCustomer(int weekdayRatesForRewardCustomer) {
		this.weekdayRatesForRewardCustomer = weekdayRatesForRewardCustomer;
	}

	public int getWeekendPriceForRewardCustomer() {
		return weekendPriceForRewardCustomer;
	}

	public void setWeekendPriceForRewardCustomer(int weekendPriceForRewardCustomer) {
		this.weekendPriceForRewardCustomer = weekendPriceForRewardCustomer;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}