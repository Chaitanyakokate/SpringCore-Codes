package in.pwskills.chaitanya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.chaitanya.bean.Employee;
import in.pwskills.chaitanya.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {

		System.out.println("*****************Starting the container*****************");
		// starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Working with bean created by IOC
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);

		// close the container
		((AbstractApplicationContext) context).close();

		System.out.println("*****************Closing the container*****************");

	}
}
