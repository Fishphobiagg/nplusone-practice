package com.example.n1problemexample.controller;
;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.n1problemexample.dto.PostDetailResponse;
import com.example.n1problemexample.dto.PostListResponse;
import com.example.n1problemexample.entity.Post;
import com.example.n1problemexample.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@GetMapping
	public ResponseEntity<PostListResponse> getPostList(@RequestParam int page, @RequestParam int size){
		PageRequest pageRequest = PageRequest.of(page, size);
		PostListResponse postListResponse = postService.findPostList(pageRequest);
		return ResponseEntity.ok(postListResponse);
	}

	@GetMapping("1")
	public ResponseEntity<PostListResponse> getPostListByQuerydsl(@RequestParam int page, @RequestParam int size){
		PageRequest pageRequest = PageRequest.of(page, size);
		PostListResponse postListResponse = postService.findPostListByQuerydsl(pageRequest);
		return ResponseEntity.ok(postListResponse);
	}
}
