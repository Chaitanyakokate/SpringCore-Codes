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
		
		Flipkart flipkart = context.getBean("flipkart",Flipkart.class);
		
		System.out.println(flipkart.shopping(new String[] {"FossileWatch","lpbelt","arrowShoes"},
				                             new float[] {6500.5f,4300.5f,5000.5f}));
		//close the container
		((AbstractApplicationContext) context).close();

	}
}
