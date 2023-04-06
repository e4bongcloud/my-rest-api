package com.example.myrestapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestApiApplication {
	@GetMapping("/rest-api") // Get(HTTP 프로토콜의 메소드 중 하나이다) 요청을 실행 메소드와 연결
	public String getRestApi(){
		return "<h1>hi-rest-api <h1/>";
	}
}
