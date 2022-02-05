package com.example.heloword;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWordApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HelloWordApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		

		System.out.println(somme(1,4));
	}
	public int somme(int a, int b) {
	int c=a  +b;
	return c;
		}
	
		
	

}
