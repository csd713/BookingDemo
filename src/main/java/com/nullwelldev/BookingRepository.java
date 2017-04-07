package com.nullwelldev;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long>{

	List<HotelBooking> findByPricePernightLessThan(double price);
}
