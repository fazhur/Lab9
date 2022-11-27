package ua.edu.ucu.apps.flowerstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication @RestController
public class FlowerstoreApplication {
	@Autowired
	private String data;

	public static void main(String[] args) {
		SpringApplication.run(FlowerstoreApplication.class, args);
	}

	@GetMapping
	public String helloWorld() {return data;}
}
