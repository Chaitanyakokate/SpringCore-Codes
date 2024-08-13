package in.pwskills.chaitanya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.chaitanya.bean.Flipkart;
import in.pwskills.chaitanya.config.AppConfig;


public class TestApp {
	public static void main(String[] args) {
		
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		String[] names = context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println("\n");
		
		Flipkart bean = context.getBean("flipkart",Flipkart.class);
		System.out.println(bean);
		//close the container
		((AbstractApplicationContext) context).close();

	}
}
