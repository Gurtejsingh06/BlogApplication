package com.codewithgurtej.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithgurtej.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	
}