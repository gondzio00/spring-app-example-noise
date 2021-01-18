package com.example.noisyapp;

import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
		DateTime.class,
})
public class NoisyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoisyApplication.class, args);
	}

}
