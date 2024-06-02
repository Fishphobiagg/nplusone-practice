package com.example.n1problemexample.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.n1problemexample.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	Page<Post> findAll(Pageable pageable);

	@Query(value = "SELECT p FROM Post p LEFT JOIN FETCH p.comments",
		countQuery = "SELECT COUNT(p) FROM Post p")
	Page<Post> findAllWithComments(Pageable pageable);
}
