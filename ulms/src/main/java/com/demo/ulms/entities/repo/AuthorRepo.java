package com.demo.ulms.entities.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ulms.entities.Author;

public interface AuthorRepo extends JpaRepository<Author, Long> {

}
