package com.example.n1problemexample.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.n1problemexample.dto.PostListResponse;
import com.example.n1problemexample.entity.Post;
import com.example.n1problemexample.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;

	@Transactional(readOnly = true)
	public PostListResponse getPostList(Pageable pageable){
		Page<Post> posts = postRepository.findAll(pageable);
		PostListResponse postListResponse = PostListResponse.from(posts);
		return postListResponse;
	}
}
