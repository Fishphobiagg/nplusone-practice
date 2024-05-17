package com.example.n1problemexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.n1problemexample.entity.Comment;

public interface CommentRepository extends JpaRepository<Long, Comment> {
}
