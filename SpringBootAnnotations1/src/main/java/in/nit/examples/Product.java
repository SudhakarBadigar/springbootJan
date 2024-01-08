package in.nit.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pob")
public class Product {
	@Value("5")
	private int pid;
	@Value("PEN")
	private String pcode;
	
	public void display() {
		System.out.println(pid+"--"+pcode);
	}

}
