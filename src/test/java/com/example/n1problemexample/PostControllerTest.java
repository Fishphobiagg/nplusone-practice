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
	@DisplayName("컨트롤러 메서드 호출하여 N+1 문제가 발생하는지 로그 확인")
	void FindPostApiNPlusOneTest(){
		int page = 0;
		int size = 10;
		postController.getPostList(page, size);
	}
}
