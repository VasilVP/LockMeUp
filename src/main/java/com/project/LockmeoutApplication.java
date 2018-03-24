package com.project;

import com.project.Email.Email;
import com.project.HttpRequest.HttpRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class LockmeoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockmeoutApplication.class, args);
		//Email.sendEmailTo("trollaway111@gmail.com", "subject", "text");
		//HttpRequest hr = new HttpRequest();
		//System.out.println(hr.getAnswer("http://api.etherscan.io/api?module=account&action=txlist&address=0xbeef281b81d383336aca8b2b067a526227638087&sort=asc"));

	}
}
