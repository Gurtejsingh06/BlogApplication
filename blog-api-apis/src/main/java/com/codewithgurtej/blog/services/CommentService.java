package com.codewithgurtej.blog.services;

import com.codewithgurtej.blog.payloads.CommentDto;

public interface CommentService {

	public CommentDto createComment(CommentDto commentDto, Integer postId);
	public void deleteComment(Integer commentId);
}
