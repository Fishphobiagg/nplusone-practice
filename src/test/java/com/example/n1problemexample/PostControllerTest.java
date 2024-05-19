package com.example.n1problemexample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import com.example.n1problemexample.controller.PostController;

@SpringBootTest
public class PostControllerTest {

	@Autowired
	private PostController postController;

	@Test
	@DisplayName("API 호출시 N+1 문제 발생 여부에 대해서 테스트")
	void FindPostApiNPlusOneTest(){
		int page = 0;
		int size = 10;
		postController.getPostList(page, size);
	}
}
