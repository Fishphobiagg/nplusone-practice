package com.example.n1problemexample.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "post")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String content;

	@OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
	private List<Comment> comments = new ArrayList<>();

	@Builder
	public Post(String title, String content){
		this.title = title;
		this.content = content;
	}

	public void addComment(String content){
		this.comments.add(buildComment(content));
	}

	private Comment buildComment(String content){
		return Comment.builder()
			.post(this)
			.content(content)
			.build();
	}

}
