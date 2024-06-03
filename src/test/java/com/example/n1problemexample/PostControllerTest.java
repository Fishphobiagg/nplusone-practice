package com.example.n1problemexample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.n1problemexample.controller.PostController;

@SpringBootTest
public class PostControllerTest {

	@Autowired
	private PostController postController;

	@Test
	@DisplayName("JPQL로 fetch join 적용하여 N+1 문제 발생하는지 확인")
	void fetchJoinWithJPQLNPlusOneTest(){
		int page = 0;
		int size = 10;
		postController.getPostList(page, size);
	}

	@Test
	@DisplayName("Querydsl로 fetch join 적용하여 N+1 문제 발생하는지 확인")
	void QuerydslPostApiNPlusOneTest(){
		int page = 0;
		int size = 10;
		postController.getPostListByQuerydsl(page, size);
	}
}
