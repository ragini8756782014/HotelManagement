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

import com.example.demo.entity.Rooms;
import com.example.demo.response.BaseResponse;
import com.example.demo.service.room.CreateRoomService;
import com.example.demo.service.room.DeleteRoomService;
import com.example.demo.service.room.GetAllRoomByIdService;
import com.example.demo.service.room.GetAllRoomService;
import com.example.demo.service.room.UpdateRoomService;

@RestController
public class RoomsController {

	@Autowired
	private CreateRoomService createRoomService;

	@Autowired
	private DeleteRoomService deleteRoomService;

	@Autowired
	private GetAllRoomByIdService getAllRoomByIdService;

	@Autowired
	private GetAllRoomService getAllRoomService;

	@Autowired
	private UpdateRoomService updateRoomService;

	@PostMapping("/room")
	public BaseResponse createRoom(@RequestBody Rooms rooms) {
		return createRoomService.createRoom(rooms);
	}

	@GetMapping("/room")
	public List<Rooms> getRoom() {
		return getAllRoomService.getRoom();
	}

	@GetMapping("/room/{id}")
	public Optional<Rooms> getRoomById(@PathVariable("id") Long id) {
		return getAllRoomByIdService.getRoomById(id);
	}

	@DeleteMapping("/room/{id}")
	public BaseResponse deleteRoom(@PathVariable("id") Long id) {
		return deleteRoomService.deleteRoom(id);
	}

	@PutMapping("room")
	public BaseResponse updateRooms(@RequestBody Rooms rooms) {
		return updateRoomService.updateRoom(rooms);
	}

}
