package com.journalapp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.journalapp.model.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry , ObjectId>{
    // Here you can write your custom query methods if needed
}
