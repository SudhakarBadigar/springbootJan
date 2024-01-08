package in.nit.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAnnotations2Application {

	public static void main(String[] args) {
	ApplicationContext ac =	SpringApplication.run(SpringBootAnnotations2Application.class, args);
	Customer c = ac.getBean("cob",Customer.class);
	c.printData();
	}

}
