package com.example.demo.service.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Rooms;
import com.example.demo.repository.RoomsRepository;
import com.example.demo.response.BaseResponse;

@Component
public class CreateRoomService {

	@Autowired
	private RoomsRepository roomsRepository;

	public BaseResponse createRoom(Rooms rooms) {

		validate();
		invalidChecks();
		Rooms r = convertEntity(rooms);
		roomsRepository.save(r);
		BaseResponse baseresponse = new BaseResponse();
		baseresponse.setStatus(HttpStatus.ACCEPTED.value());
		baseresponse.setMessage("your room has been successfully registered");
		return baseresponse;
	}

	private Rooms convertEntity(Rooms rooms) {
		Rooms r = new Rooms();
		r.setAvailability("Y");
		r.setIscheckedin("N");
		r.setIsCheckedOut("N");
		r.setOccupancy("N");
		r.setPriceperday(rooms.getPriceperday());
		r.setCategoryType(rooms.getCategoryType());
		r.setRoomnumber(rooms.getRoomnumber());
		return r;
	}

	private void validate() {
//		if (room.getCategoryType() == null || room.getCategoryType().isEmpty() || room.getCategoryType().isBlank()) {
//			throw new ValidationException("FV001", "CategoryCode cannot be null or empty");
//		}
//		else if(createRoomRequest.getPriceperday()<=0 ) {
//			throw new ValidationException("FV002", " Priceperday cannot be 0 or empty");
//		}
//		else if(createRoomRequest.getRoomNo()<=0 ) {
//			throw new ValidationException("FV003", " RoomNo cannot be 0 or empty");
//		}
//		else
//		{
//			
//		}
	}

	private void invalidChecks() {
//		if (createRoomRequest.getCategoryCode().matches("[0-9]+")
//				|| createRoomRequest.getCategoryCode().matches("^[a-zA-Z]*$")) {
//			throw new ValidationException("FV001", "CategoryCode cannot be only character or number");
//		}
//		else if (createRoomRequest.getPriceperday().getClass().getSimpleName()!=Integer) {
//			throw new ValidationException("FV002", " Priceperday can only be integer ");
//		}]
//		else {

	}

}
