package com.example.demo.service.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Rooms;
import com.example.demo.repository.RoomsRepository;
import com.example.demo.response.BaseResponse;

@Component
public class UpdateRoomService {

	@Autowired
	private RoomsRepository roomsRepository;

	public BaseResponse updateRoom(Rooms rooms) {

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
		r.setRoomId(rooms.getRoomId());
		return r;
	}

	private void validate() {

	}

	private void invalidChecks() {

	}

}
