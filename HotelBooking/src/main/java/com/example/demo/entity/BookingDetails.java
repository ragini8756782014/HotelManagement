package com.example.demo.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "booking_details")
public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingid;

	private String duration;

	private String startDate;

	private String enddate;

	private String modeofbooking;

	private long billamount;

	private String modeofpayment;

	@OneToMany(targetEntity=Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name= "bookingdetail_id",referencedColumnName="bookingid")
	private List<Customer> c;

//	@OneToMany(targetEntity=Rooms.class,cascade=CascadeType.ALL)
//	@JoinColumn(name= "bookingdetail_id",referencedColumnName="bookingid")
//	private List<Rooms> r;

	private Long CustomerId;

	private String CategoryType;
	
	

}
