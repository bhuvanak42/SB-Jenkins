package com.demo.api.exception;

public class FlightNotBooked extends Exception{
    FlightNotBooked(String message){
        super(message);
    }
}
