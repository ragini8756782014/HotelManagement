package com.example.demo.classes;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoomReturn implements Serializable {
  
	private static final long serialVersionUID = 1L;

	private Long roomId;
	
	private  int roomNo ;
	
	
}
