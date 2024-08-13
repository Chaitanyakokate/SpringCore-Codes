package in.pwskills.chaitanya.config;

import java.util.List;
import java.util.Map;
import java.util.Set;
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
		
		List<String> friends = List.of("Rohit", "Virat", "Ravindra", "Ruturaj");
		Set<String> numbers = Set.of("99997777", "88885555", "77776666");
		Map<String, String> account = Map.of("CANARA", "12114", "SBI", "21552");
		
		Employee employee = new Employee(1, 45000, friends, numbers, account);
		return employee;
		
	}
}
