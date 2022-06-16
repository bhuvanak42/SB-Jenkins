package com.demo.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.swing.*;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerInfo {
    @Id
    private String passengerId;
    private String name;
    private String email;
    private String source;
    private String destination;
    @DateTimeFormat(pattern="dd-MM-yyyy")
    private String travelDate;
    private String pickupTime;
    private String arraivalTime;
    private Double fare;
}
