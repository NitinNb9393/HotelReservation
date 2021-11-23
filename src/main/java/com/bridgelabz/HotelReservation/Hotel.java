package com.bridgelabz.HotelReservation;

public class Hotel {
	private String hotelName;
	private String customerType;
	private int weekdayRatesForRegularCustomer;
	private int weekendPriceForRegularCustomer;
	private int weekdayRatesForRewardCustomer;
	private int weekendPriceForRewardCustomer;
	private int rating;

	// Parameterized constructor to initialize instance variable
	public Hotel(String hotelName, String customerType, int weekdayRatesForRegularCustomer,
			int weekendPriceForRegularCustomer, int weekdayRatesForRewardCustomer, int weekendPriceForRewardCustomer,
			int rating) {
		this.hotelName = hotelName;
		this.customerType = customerType;
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

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
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