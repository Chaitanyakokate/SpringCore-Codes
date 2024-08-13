package in.pwskills.chaitanya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import in.pwskills.chaitanya.config.AppConfig;
import in.pwskills.chaitanya.dao.EmployeeMySQLDaoImpl;


public class TestApp {
	public static void main(String[] args) {
		
		// starting the container
				ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

				String[] definitionNames = context.getBeanDefinitionNames();
				for (String beanName : definitionNames) {
					System.out.println(beanName);
				}

				EmployeeMySQLDaoImpl daoImpl = context.getBean("mysqlDao", EmployeeMySQLDaoImpl.class);
				daoImpl.getConnection();
				
				// close the container
				((AbstractApplicationContext) context).close();


	}
}
