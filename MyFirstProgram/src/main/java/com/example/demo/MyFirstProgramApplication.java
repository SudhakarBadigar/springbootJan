package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstProgramApplication {

	public static void main(String[] args) {
	    ApplicationContext ac= 	SpringApplication.run(MyFirstProgramApplication.class, args);
	    MfpDemo mf = ac.getBean("mfpDemo",MfpDemo.class);
	    mf.getmessage();
	}

}
