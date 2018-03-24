package com.project;

import com.project.Email.Email;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LockmeoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockmeoutApplication.class, args);
		//Email.sendEmailTo("trollaway111@gmail.com", "subject", "text");
	}
}
