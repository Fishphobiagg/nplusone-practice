package com.example.n1problemexample.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.example.n1problemexample.entity.Post;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

import static com.example.n1problemexample.entity.QPost.post;
import static com.example.n1problemexample.entity.QComment.comment;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostCustomRepositoryImpl implements PostCustomRepository{

	private final JPAQueryFactory queryFactory;

	@Override
	public Page<Post> findAllWithComments(Pageable pageable) {
		List<Post> posts = queryFactory
			.selectFrom(post)
			.leftJoin(post.comments, comment).fetchJoin()
			.offset(pageable.getOffset())
			.limit(pageable.getPageSize())
			.fetch();

		long total = queryFactory.selectFrom(post).stream().count();

		return new PageImpl<>(posts, pageable, total);
	}
}
