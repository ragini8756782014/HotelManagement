package com.example.demo.service.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.example.demo.repository.RoomsRepository;
import com.example.demo.response.BaseResponse;

@Component
public class DeleteRoomService {

	@Autowired
	private RoomsRepository roomsRepository;

	public BaseResponse deleteRoom(Long id) {
		roomsRepository.deleteById(id);
		BaseResponse baseresponse = new BaseResponse();
		baseresponse.setStatus(HttpStatus.ACCEPTED.value());
		baseresponse.setMessage("your room has been successfully deleted");
		return baseresponse;

	}

}
