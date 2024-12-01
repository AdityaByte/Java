package com.journalapp.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.journalapp.model.User;

@Repository
public interface UserRepository extends MongoRepository<User , ObjectId>{
    // Custom methods
    Optional<User> findByUserName(String username);
}