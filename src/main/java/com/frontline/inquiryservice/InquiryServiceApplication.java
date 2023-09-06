package com.frontline.inquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@SpringBootApplication
public class InquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InquiryServiceApplication.class, args);

	}
}
@RestController
class MyController {

	@GetMapping("/frontline")
	public String hello() {
		return "Hello Frontline";
	}
}
