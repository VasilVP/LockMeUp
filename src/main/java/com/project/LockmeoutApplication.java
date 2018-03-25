package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LockmeoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockmeoutApplication.class, args);
		//Email.sendEmailTo("trollaway111@gmail.com", "subject", "text");
		//HttpRequestBlockchain hr = new HttpRequestBlockchain();
		//System.out.println(hr.getAnswer("http://api.etherscan.io/api?module=account&action=txlist&address=0xbeef281b81d383336aca8b2b067a526227638087&sort=asc"));

	}
}
