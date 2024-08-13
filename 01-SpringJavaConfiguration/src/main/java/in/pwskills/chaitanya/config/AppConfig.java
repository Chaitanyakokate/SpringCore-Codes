package in.pwskills.chaitanya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.chaitanya.bean.Employee;

@Configuration
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	@Bean(name = "emp")
	public Employee empObj() {
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Chaitanya");
		employee.setEage(21);
		employee.setEaddress("Pune");
		
		return employee;
	}
}
