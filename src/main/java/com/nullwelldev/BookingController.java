package com.nullwelldev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

	BookingRepository bookingRepository;

	@Autowired
	public BookingController(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<HotelBooking> getAll() {
		return bookingRepository.findAll();
	}

	// @RequestMapping(value = "/affordable/{price}", method =
	// RequestMethod.GET)
	// public List<HotelBooking> getAffordable(@PathVariable double price) {
	// return bookings.stream().filter(x -> x.getPricePernight() <=
	// price).collect(Collectors.toList());
	// }

	@RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
	public List<HotelBooking> getAffordable(@PathVariable double price) {
		return bookingRepository.findByPricePernightLessThan(price);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking) {

		bookingRepository.save(hotelBooking);
		return bookingRepository.findAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public List<HotelBooking> remove(@PathVariable long id) {
		bookingRepository.delete(id);
		return bookingRepository.findAll();
	}

}
