package com.example.demo.service.bookingdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.BookingDetails;
import com.example.demo.repository.BookingDetailsRepository;

@Component
public class GetAllBookingDetailsService {

	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;

	public List<BookingDetails> getAllBookingDetails() {
		return bookingDetailsRepository.findAll();
	}
}
