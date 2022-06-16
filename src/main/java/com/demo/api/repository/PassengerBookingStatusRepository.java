package com.demo.api.repository;

import com.demo.api.entity.PassengerBookingStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerBookingStatusRepository extends MongoRepository<PassengerBookingStatus,String> {

}
