package in.pwskills.chaitanya.bean;

import java.util.*;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	
	@Scheduled(cron = "59 59 23 3 DEC *") //03 DEC 23:59:59 sec
	public void generateSalesReport() {
		System.out.println(new Date());
		
		
	}
}
