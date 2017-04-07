package com.nullwelldev;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	
	private String hotelName;
	private double pricePernight;
	private int noOfNights;
	
	public HotelBooking() {
		// TODO Auto-generated constructor stub
	}
	
	public HotelBooking(String hName, double price, int nights) {
		// TODO Auto-generated constructor stub
		this.hotelName = hName;
		this.pricePernight = price;
		this.noOfNights = nights;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public double getPricePernight() {
		return pricePernight;
	}
	public void setPricePernight(double pricePernight) {
		this.pricePernight = pricePernight;
	}
	public int getNoOfNights() {
		return noOfNights;
	}
	public void setNoOfNights(int noOfNights) {
		this.noOfNights = noOfNights;
	}
	public double getTotalPrice(){
		return pricePernight * noOfNights;
		
	}
	
	public long getId() {
		return id;
	}

}
