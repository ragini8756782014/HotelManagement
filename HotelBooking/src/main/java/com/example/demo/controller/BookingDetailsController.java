package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.classes.BookingDetailsReturn;
import com.example.demo.entity.BookingDetails;
import com.example.demo.response.BaseResponse;
import com.example.demo.service.bookingdetail.CreateBookingDetailService;
import com.example.demo.service.bookingdetail.DeleteBookingDetailsService;
import com.example.demo.service.bookingdetail.GetAllBookingDetailsService;
import com.example.demo.service.bookingdetail.GetBookingDetailByIdService;
import com.example.demo.service.bookingdetail.UpdateBookingDetailService;

@RestController
public class BookingDetailsController {

	@Autowired
	private CreateBookingDetailService createBookingDetailService;

	@Autowired
	private GetAllBookingDetailsService getAllBookingDetailsService;

	@Autowired
	private GetBookingDetailByIdService getBookingDetailByIdService;
	
	@Autowired
	private DeleteBookingDetailsService deleteBookingDetailsService;
	
	@Autowired
	private UpdateBookingDetailService updateBookingDetailService;

	@PostMapping("/bookingDetails")
	public BookingDetailsReturn createBookingDetails(@RequestBody BookingDetails bookingDetails) {
		return createBookingDetailService.createBookingDetail(bookingDetails);
	}

	@GetMapping("/bookingDetails")
	public List<BookingDetails> getAllBookingDetails() {
		return getAllBookingDetailsService.getAllBookingDetails();
		}
		
	@GetMapping("/bookingDetails/{id}")
	public Optional<BookingDetails>  getBookingDetailsById(@PathVariable("id") Long id)
	{
		return  getBookingDetailByIdService.getBookingDetailsById(id);
	}
	
	@DeleteMapping("/bookingDetails/{id}/{roomNo}")
	public BaseResponse deleteBookingDetails(@PathVariable("id") Long id,@PathVariable("roomNo") int roomNo) {
		return deleteBookingDetailsService.deleteBookingDetails(id, roomNo);
	}	
		
	
	@PutMapping("bookingDetails")
	public BookingDetailsReturn updateBookingDetails(@RequestBody BookingDetails bookingDetails) {
		return updateBookingDetailService.updateBookingDetail(bookingDetails);
	}
	
	}
