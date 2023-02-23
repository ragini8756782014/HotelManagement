//package com.example.demo;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.aspectj.lang.annotation.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import com.example.demo.entity.BookingDetails;
//import com.example.demo.entity.Customer;
//import com.example.demo.entity.Rooms;
//import com.example.demo.repository.BookingDetailsRepository;
//import com.example.demo.service.Service;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class HotelBookingApplicationTests {
//    
//	@Autowired
//	private BookingDetailsRepository bookingDetailsRepository;
//	
//	@MockBean
//	private Service service;
//	
//	@Before(value = "getAllBookingDetailsTest()")
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }
//	
//	public static List<Customer> list = new ArrayList<Customer>();
//	public static List<Rooms> l = new ArrayList<Rooms>();
//	static {
//	list.add(new Customer((long) 12,"ragini","gdjdkkl",1234567890,34));
//	list.add(new Customer((long) 67,"tarun","hfjfkfk",2134567890,56));
//	l.add(new Rooms(11,"one bed","single","yes",1200,"yes","no"));
//	l.add(new Rooms(18,"one bed","two","yes",9000,"yes","no"));
//	}
//	
//	
//	@Test
//	public void getAllBookingDetailsTest() {
//		BookingDetails bd= new BookingDetails();
//		bd.setR(l);
//		bd.setC(list);
//		List<BookingDetails> l=new ArrayList<BookingDetails>();
//				l.add(new BookingDetails(2,"2","02/02/2023","03/02/2023","online",40000,"gpay",list,this.l ));
//				l.add(new BookingDetails(3,"2","09/05/2023","03/06/2023","online",40000,"gpay",list,this.l ));
//		
//		
//		when(bookingDetailsRepository.findAll()).thenReturn(l);
//		assertEquals(2,service.getAllBookingDetails().size());
//	}
//	
////	@Test
////	public void addBookingDetailsTest() {
////		BookingDetails bookingDetails=new BookingDetails(4,"2","02/02/2023","03/02/2023","online",40000,"gpay",list,l);
////		when(bookingDetailsRepository.save(bookingDetails)).thenReturn(bookingDetails);
////		assertEquals(bookingDetails,service.addBookingDetails(bookingDetails));
////	}
//	
//	
////	@Test 
////	public void deleteBookingDetailsTest() {
////		BookingDetails bookingDetails =new BookingDetails(2,"2","02/02/2023","03/02/2023","online",40000,"gpay",list,l);
////		service.deleteBookingDetails(2);
////	verify(bookingDetailsRepository,times(1)).deleteById((long)2);	
////	}
//	
////	@Test
////	public void getBookIngDetailsByIdTest() {
////		BookingDetails bookingDetails=new BookingDetails((long)1,"2","02/02/2023","03/02/2023","online",40000,"gpay",list,l);
////		when(bookingDetailsRepository.findAll((long)1)).thenReturn(bookingDetails);
////		
////		assertThat(service.getBookingDetailsById((long)1)).isEqualTo(bookingDetails);
////	}
//	
//	
//	
//	
//}
