package in.nit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Props1 implements CommandLineRunner {

	@Value("${app-id}")
	private int id;
	@Value("${title}")
	private String title;
	@Value("${version}")
	private double ver;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "Props1 [id=" + id + ", title=" + title + ", ver=" + ver + "]";
	}

	
}
