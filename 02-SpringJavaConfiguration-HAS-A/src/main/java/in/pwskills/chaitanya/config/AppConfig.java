package in.pwskills.chaitanya.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.chaitanya.bean.WishMessageGenerator;


@Configuration
public class AppConfig {

	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
	
	
	@Bean(name = "wmg")
	public WishMessageGenerator empObj() {
		WishMessageGenerator generator = new WishMessageGenerator();
		LocalDateTime ldt = LocalDateTime.now();
		generator.setLdt(ldt);
		return generator;
		
	}
}
