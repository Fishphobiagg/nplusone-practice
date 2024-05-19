package com.example.n1problemexample.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.n1problemexample.entity.Comment;
import com.example.n1problemexample.entity.Post;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostDetailResponse {

	private String title;
	private String content;
	private List<CommentDto> comments;

	public static PostDetailResponse from(Post post){
		return new PostDetailResponse(post.getTitle(), post.getContent(), post.getComments());
	}

	private PostDetailResponse(String title, String content, List<Comment> comments){
		this.comments = new ArrayList<>();
		this.content=content;
		this.title= title;
		comments.forEach(comment -> this.comments.add(CommentDto.from(comment)));
	}
}
