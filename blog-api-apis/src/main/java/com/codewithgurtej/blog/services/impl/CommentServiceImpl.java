package com.codewithgurtej.blog.services.impl;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithgurtej.blog.entities.Comment;
import com.codewithgurtej.blog.entities.Post;
import com.codewithgurtej.blog.exceptions.ResourceNotFoundException;
import com.codewithgurtej.blog.payloads.CommentDto;
import com.codewithgurtej.blog.repositories.CommentRepo;
import com.codewithgurtej.blog.repositories.PostRepo;
import com.codewithgurtej.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post = this.postRepo.findById(postId)
				.orElseThrow(()-> new ResourceNotFoundException("Post", "Post Id", postId));
		
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment);
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		 Comment com = this.commentRepo.findById(commentId)
				.orElseThrow(()-> new ResourceNotFoundException("Comment", "Comment Id", commentId));
		 this.commentRepo.delete(com);
	}

}
