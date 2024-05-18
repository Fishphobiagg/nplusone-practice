package com.example.n1problemexample.controller;
;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.n1problemexample.entity.Post;
import com.example.n1problemexample.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@GetMapping
	public Page<Post> getPostList(@RequestParam int page, @RequestParam int size){
		PageRequest pageRequest = PageRequest.of(page, size);
		return postService.getPostList(pageRequest);
	}
}
