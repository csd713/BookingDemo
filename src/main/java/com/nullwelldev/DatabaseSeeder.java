package com.nullwelldev;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

	private BookingRepository bookingRepository;

	@Autowired
	public DatabaseSeeder(BookingRepository bookingRepository) {
		// TODO Auto-generated constructor stub
		this.bookingRepository = bookingRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
		// TODO Auto-generated method stub
		List<HotelBooking> bookings = new ArrayList<>();
		bookings = new ArrayList<>();

		bookings.add(new HotelBooking("Marriot", 200.50, 3));
		bookings.add(new HotelBooking("Sheraton", 175.50, 2));
		bookings.add(new HotelBooking("Ashoka", 150, 5));

		bookingRepository.save(bookings);
	}
}
