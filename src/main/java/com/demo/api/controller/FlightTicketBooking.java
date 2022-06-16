package com.demo.api.controller;

import com.demo.api.dto.FlightBookingAcknowledgement;
import com.demo.api.dto.FlightBookingRequest;
import com.demo.api.service.BookTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FlightTicketBooking {
    @Autowired
    private BookTicketService bookTicketService;

    @PostMapping("/book")
    public ResponseEntity<FlightBookingAcknowledgement> bookTicket(@RequestBody FlightBookingRequest request){
        return new ResponseEntity<>(bookTicketService.bookTicket(request), HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<FlightBookingAcknowledgement>> listBookings(){
        return new ResponseEntity<>(bookTicketService.listAllBookings(), HttpStatus.OK);
    }
}
