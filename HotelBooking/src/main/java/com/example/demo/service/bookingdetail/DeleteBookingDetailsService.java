package com.example.demo.service.bookingdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Rooms;
import com.example.demo.repository.BookingDetailsRepository;
import com.example.demo.response.BaseResponse;
import com.example.demo.service.room.GetAllRoomService;

@Component
public class DeleteBookingDetailsService {

	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;

	@Autowired
	private GetAllRoomService getAllRoomService;

	public BaseResponse deleteBookingDetails(Long id, int roomNo) {
		bookingDetailsRepository.deleteById(id);
		deleteOccupancy(roomNo);
		BaseResponse baseresponse = new BaseResponse();
		baseresponse.setStatus(HttpStatus.ACCEPTED.value());
		baseresponse.setMessage("your BookingDetail has been successfully deleted");
		return baseresponse;

	}

	private void deleteOccupancy(int roomNo) {
		List<Rooms> rooms = getAllRoomService.getRoom();
		rooms.stream().map(b -> {
			if (b.getAvailability() == "N") {
				if (b.getRoomnumber() == roomNo) {
					b.setAvailability("Y");
				}
			}
			return b;
		});

	}

}
