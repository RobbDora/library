package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Book;


@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long>{
	
	
}