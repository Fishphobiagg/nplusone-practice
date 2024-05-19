package com.example.n1problemexample.dto;

import com.example.n1problemexample.entity.Comment;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentDto {
	private String content;

	public static CommentDto from(Comment comment){
		return new CommentDto(comment.getContent());
	}

	private CommentDto(String content){
		this.content=content;
	}
}
