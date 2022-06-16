package com.demo.api.repository;

import com.demo.api.entity.PassengerInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends MongoRepository<PassengerInfo,String> {

}
