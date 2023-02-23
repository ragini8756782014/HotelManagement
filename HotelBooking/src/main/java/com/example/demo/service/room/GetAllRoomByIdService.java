package com.example.demo.service.room;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Rooms;
import com.example.demo.repository.RoomsRepository;

@Component
public class GetAllRoomByIdService {

	@Autowired
	private RoomsRepository roomsRepository;

	public Optional<Rooms> getRoomById(Long id) {
		return roomsRepository.findById(id);

	}
}
