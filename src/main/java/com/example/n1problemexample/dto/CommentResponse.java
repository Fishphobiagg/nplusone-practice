package com.example.n1problemexample.dto;

import com.example.n1problemexample.entity.Comment;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentResponse {
	private String content;

	public static CommentResponse of(Comment comment){
		return new CommentResponse(comment.getContent());
	}

	private CommentResponse(String content){
		this.content = content;
	}
}
