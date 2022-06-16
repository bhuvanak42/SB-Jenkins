package com.demo.api.service;

import com.demo.api.dto.FlightBookingAcknowledgement;
import com.demo.api.dto.FlightBookingRequest;
import com.demo.api.entity.PassengerBookingStatus;
import com.demo.api.entity.PassengerInfo;
import com.demo.api.repository.PassengerBookingStatusRepository;
import com.demo.api.repository.PassengerRepository;
import com.demo.api.repository.PaymentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BookTicketService {
    @Autowired
    private  PassengerRepository passengerRepository;
    @Autowired
    private  PaymentInfoRepository paymentInfoRepository;
    @Autowired
    private PassengerBookingStatusRepository passengerBookingStatusRepository;

    private final double gst = 200.00;

    @Transactional
    public FlightBookingAcknowledgement bookTicket(FlightBookingRequest request){
        PassengerInfo passengerInfo = passengerRepository.save(request.getPassengerInfo());
        paymentInfoRepository.save(request.getPaymentInfo());
        PassengerBookingStatus passengerBookingStatus = new PassengerBookingStatus(null,"Success",passengerInfo.getFare() + gst,UUID.randomUUID().toString(),passengerInfo);
        passengerBookingStatusRepository.save(passengerBookingStatus);
        return new FlightBookingAcknowledgement(passengerBookingStatus.getStatus(), passengerBookingStatus.getTotalFare(),passengerBookingStatus.getPnrNo(),passengerBookingStatus.getPassengerInfo());
    }

    public List<FlightBookingAcknowledgement> listAllBookings(){
        List<FlightBookingAcknowledgement> flightBookingAcknowledgementList = new ArrayList<>();
        for(PassengerBookingStatus passengerBookingStatus :passengerBookingStatusRepository.findAll()){
            flightBookingAcknowledgementList.add(new FlightBookingAcknowledgement(passengerBookingStatus.getStatus(), passengerBookingStatus.getTotalFare(),passengerBookingStatus.getPnrNo(),passengerBookingStatus.getPassengerInfo()));
        }
        return flightBookingAcknowledgementList;
    }
}
