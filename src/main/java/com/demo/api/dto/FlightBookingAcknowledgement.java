package com.demo.api.dto;

import com.demo.api.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private Double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
