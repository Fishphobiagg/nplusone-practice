package com.example.n1problemexample.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.n1problemexample.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	Page<Post> findAll(Pageable pageable);
}
