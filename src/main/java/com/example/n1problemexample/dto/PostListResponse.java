package com.example.n1problemexample.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.n1problemexample.entity.Post;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostListResponse {

	private List<PostResponse> posts;

	public static PostListResponse from(List<Post> posts){
		return new PostListResponse(posts);
	}

	public static PostListResponse from(Page<Post> posts){
		return new PostListResponse(posts.stream().toList());
	}

	private PostListResponse(List<Post> posts){
		this.posts = new ArrayList<>();
		posts.forEach(post -> this.posts.add(PostResponse.of(post)));
	}

}
