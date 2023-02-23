package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "rooms")
public class Rooms {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roomId;
	
	private int roomnumber;

	private String occupancy;

	private String availability;

	private int priceperday;

	private String ischeckedin;

	private String isCheckedOut;
	
	private String categoryType;

}
