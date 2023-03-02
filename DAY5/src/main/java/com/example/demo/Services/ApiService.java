package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Book;

import com.example.demo.Repositories.BookRepo;

@Service
public class ApiService {
	@Autowired
	BookRepo repository;
	public Optional<Book>getBook(int id){
		return repository.findById(id);
	}
	public String updateDetails(Book boo) {
		repository.save(boo);
		return "updated";
	}
	public String deleteDetails(int id)
	{
		repository.deleteById(id);
		return "Id deleted";
	}

}
