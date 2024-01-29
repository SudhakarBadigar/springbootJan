package in.nit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.app")
public class MyDataRunner implements CommandLineRunner {

	private Integer id;
	private String name;
	private Double version;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "MyDataRunner [id=" + id + ", name=" + name + ", version=" + version + "]";
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}
	
	
}
