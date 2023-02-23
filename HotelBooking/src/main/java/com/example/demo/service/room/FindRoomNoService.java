package com.example.demo.service.room;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.classes.RoomReturn;
import com.example.demo.entity.Rooms;

@Component
public class FindRoomNoService {

	private Rooms rooms;

	private GetAllRoomService getAllRoomService;

	public RoomReturn findRoomNo(String category) {
		List<Rooms> rooms = getAllRoomService.getRoom();
		List<Rooms> r = rooms.stream().filter(e -> e.getAvailability() == "Y").collect(Collectors.toList());
		RoomReturn roomReturn = new RoomReturn();
		Rooms allottedRooms = createEntity(r, category);
		roomReturn.setRoomId(allottedRooms.getRoomId());
		roomReturn.setRoomNo(allottedRooms.getRoomnumber());
		return roomReturn;

	}

	private Rooms createEntity(List<Rooms> r, String c) {

		Rooms room = r.stream().map(b -> {
			if (b.getCategoryType() == c) {
				b.setAvailability("N");
			}
			return b;
		}).findFirst().get();

		return room;
	}

//	private List<Rooms> createEntity1(List<Rooms> r, String c) {
//
//		List<Rooms> room = r.stream().map(b -> {
//			if (b.getCategoryType() == c) {
//				b.setAvailability("N");
//			}
//			return b;
//		}).collect(Collectors.toList());
//
//		return room;
//	}

//    if(noOfRoom>1)
//    {
//    	List<Rooms> allottedRooms =createEntity1(r, category);
//    	allottedRooms.forEach(item->{
//    		roomReturn.setRoomId(item.getRoomId());
//	    	roomReturn.setRoomNo(item.getRoomnumber());
//		});
//    	
//    	return roomReturn;
//    	
//    }
//    else
//    {

}
