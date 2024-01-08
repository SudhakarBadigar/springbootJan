package in.nit.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class Address {

	@Value("19/a")
	private String houseNo;
	
	@Value("Bangalore")
	private String location;

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", location=" + location + "]";
	}
	
	
}
