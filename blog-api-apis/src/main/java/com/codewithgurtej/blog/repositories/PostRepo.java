package com.codewithgurtej.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithgurtej.blog.entities.Category;
import com.codewithgurtej.blog.entities.Post;
import com.codewithgurtej.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
}
