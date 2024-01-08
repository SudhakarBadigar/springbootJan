package in.nit.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAnnotations1Application {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SpringBootAnnotations1Application.class, args);
		Product p = ac.getBean("pob",Product.class);
		p.display();
	}

}
