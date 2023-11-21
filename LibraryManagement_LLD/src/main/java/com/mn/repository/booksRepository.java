package com.mn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mn.model.Books;

public interface booksRepository extends JpaRepository<Books, Integer> {

}
