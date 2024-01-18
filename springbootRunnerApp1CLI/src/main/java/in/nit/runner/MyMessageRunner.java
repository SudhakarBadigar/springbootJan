package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  //tells the container to create object.
public class MyMessageRunner implements CommandLineRunner {

	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("welcome to Runner Ex!.");
	}
}
