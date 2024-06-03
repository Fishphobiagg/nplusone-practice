package com.example.n1problemexample.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.n1problemexample.entity.Post;

public interface PostCustomRepository {
	Page<Post> findAllWithComments(Pageable pageable);
}
