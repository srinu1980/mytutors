package edu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> 
{

}
