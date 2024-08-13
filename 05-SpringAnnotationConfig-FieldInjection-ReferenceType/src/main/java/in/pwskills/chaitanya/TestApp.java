package in.pwskills.chaitanya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.chaitanya.bean.WishMessageGenerator;
import in.pwskills.chaitanya.config.AppConfig;


public class TestApp {
	public static void main(String[] args) {
		
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator generator = context.getBean("wmg",WishMessageGenerator.class);
		String wishMessage = generator.wishMessage("Chaitanya");
		System.out.println(wishMessage);
		
		//close the container
		((AbstractApplicationContext) context).close();

	}
}
