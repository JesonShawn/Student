package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.MainController;

@SpringBootTest
public class MainControllerTest {

	
	@Test
	void ping() {
		
		String str= new MainController().ping();
		Assert.hasText(str, "Testing Ping");
		
	}

	
}
