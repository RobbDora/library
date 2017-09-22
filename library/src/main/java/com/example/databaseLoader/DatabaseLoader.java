package com.example.databaseLoader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.repository.BookRepository;
import com.example.model.Book;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final BookRepository repository;

	@Autowired
	public DatabaseLoader(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings)throws Exception {
		this.repository.save(new Book("Fluturi", "Bla"));
		this.repository.save(new Book("Bla", "Author1"));
		this.repository.save(new Book("Fluturi", "Bla"));
	}
}