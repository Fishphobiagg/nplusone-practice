package com.example.n1problemexample.dto;

import com.example.n1problemexample.entity.Post;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostResponse {

	private String title;
	private String content;
	private int commentSize;

	public static PostResponse of(Post post){
		return new PostResponse(post.getTitle(), post.getContent(), post.getComments().size());
	}

	private PostResponse(String title, String content, int size){
		this.title = title;
		this.content = content;
		this.commentSize = size;
	}
}
