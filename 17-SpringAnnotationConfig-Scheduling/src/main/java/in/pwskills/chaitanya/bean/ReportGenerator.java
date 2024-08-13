package in.pwskills.chaitanya.bean;

import java.util.*;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	
	@Scheduled(initialDelay = 2000,fixedRate = 3000)
	public void generateSalesReport() {
		try {
			Thread.sleep(5000);
			System.out.println("Sales report on :: "+new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
