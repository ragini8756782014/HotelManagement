package com.example.demo.service.bookingdetail;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.BookingDetails;
import com.example.demo.repository.BookingDetailsRepository;

@Component
public class GetBookingDetailByIdService {

	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;

	public Optional<BookingDetails> getBookingDetailsById(Long id) {
		return bookingDetailsRepository.findById(id);

	}
}
