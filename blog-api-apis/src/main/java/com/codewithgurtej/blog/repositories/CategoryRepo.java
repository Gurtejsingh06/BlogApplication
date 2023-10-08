package com.codewithgurtej.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithgurtej.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
