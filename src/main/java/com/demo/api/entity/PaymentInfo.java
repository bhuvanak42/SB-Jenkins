package com.demo.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInfo {
    @Id
    private String paymentId;
    private String accountNo;
    private String cardType;
    private Double amount;
    private PassengerInfo passengerId;
}
