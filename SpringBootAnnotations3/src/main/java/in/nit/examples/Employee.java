package in.nit.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
public class Employee {

	@Value("10")
	private int eid;
	
	@Value("SAM")
	private String ename;
	
	@Autowired
	private Address addr;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", addr=" + addr + "]";
	}
	
	
}
