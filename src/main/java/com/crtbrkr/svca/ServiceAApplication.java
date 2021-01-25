package com.crtbrkr.svca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableZipkinServer
@SpringBootApplication
public class ServiceAApplication {
	static int counter=0;

	@RequestMapping("/possible")
	public String showPossibilities() throws Exception {
		counter++;
		if(counter%3 == 0)
			throw new Exception();
		return "Anuja_"+Math.random();
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

}
