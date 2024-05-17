package com.example.n1problemexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.n1problemexample.entity.Post;

public interface PostRepository extends JpaRepository<Long, Post> {
}
