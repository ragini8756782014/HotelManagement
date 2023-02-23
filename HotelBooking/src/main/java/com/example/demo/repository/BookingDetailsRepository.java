package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookingDetails;

public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Long> {

}
