package com.demo.api.controllerAdvice;

import com.demo.api.dto.ErrorDetails;
import com.demo.api.exception.FlightNotBooked;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import java.util.Date;

@RestControllerAdvice
public class FlightBookingException {
    @ResponseStatus
    @ExceptionHandler(FlightNotBooked.class)
    public ResponseEntity<ErrorDetails> bookingFled(FlightNotBooked ex, WebRequest request){
        return new ResponseEntity(new ErrorDetails(new Date(),ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
