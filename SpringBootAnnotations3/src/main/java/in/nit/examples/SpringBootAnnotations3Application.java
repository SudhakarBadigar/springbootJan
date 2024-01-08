package in.nit.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAnnotations3Application {

	public static void main(String[] args) {
	 ApplicationContext ac = SpringApplication.run(SpringBootAnnotations3Application.class, args);
	 Employee e = ac.getBean("eob",Employee.class);
	 System.out.println(e);
	}

}
