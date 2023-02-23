package com.example.demo.service.bookingdetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.classes.BookingDetailsReturn;
import com.example.demo.classes.RoomReturn;
import com.example.demo.entity.BookingDetails;
import com.example.demo.repository.BookingDetailsRepository;
import com.example.demo.service.customer.CreateCustomerService;
import com.example.demo.service.room.FindRoomNoService;

@Component
public class CreateBookingDetailService {

	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;

	private CreateCustomerService createCustomerService;

	private FindRoomNoService findRoomNoService;

	public BookingDetailsReturn createBookingDetail(BookingDetails bookingDetails) {
		BookingDetails bd = createEntity(bookingDetails);
		String category = bd.getCategoryType();
		RoomReturn r = findRoomNoService.findRoomNo(category);
		bookingDetailsRepository.save(bd);
		return createEntity1(r, bd);
	}

	private BookingDetails createEntity(BookingDetails bookingDetails) {
		BookingDetails bd = new BookingDetails();
		bd.setCategoryType(bookingDetails.getCategoryType());
		bd.setDuration(bookingDetails.getDuration());
		bd.setEnddate(bookingDetails.getEnddate());
		bd.setModeofbooking(bookingDetails.getModeofpayment());
		bd.setStartDate(bookingDetails.getStartDate());
		bd.setCustomerId(createCustomerService.createCustomer(bookingDetails.getC()));
		bd.setModeofpayment(bookingDetails.getModeofpayment());
		bd.setC(bookingDetails.getC());
		return bd;

	}

	public BookingDetailsReturn createEntity1(RoomReturn r, BookingDetails bd) {

		BookingDetailsReturn bookingDetailsReturn = new BookingDetailsReturn();
		bookingDetailsReturn.setRoomNo(r.getRoomNo());
		bookingDetailsReturn.setBookingId(bd.getBookingid());
		return bookingDetailsReturn;
	}

}
