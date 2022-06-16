package com.demo.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerBookingStatus {
    @Id
    private String Id;
    private String status;
    private Double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}