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

	public static PostResponse of(String title, String content){
		return new PostResponse(title, content);
	}

	public static PostResponse of(Post post){
		return new PostResponse(post.getTitle(), post.getContent());
	}

	private PostResponse(String title, String content){
		this.title = title;
		this.content = content;
	}
}
