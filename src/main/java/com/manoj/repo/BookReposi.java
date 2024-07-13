package com.manoj.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.entity.Book;

public interface BookReposi extends JpaRepository<Book, Serializable> {

}
