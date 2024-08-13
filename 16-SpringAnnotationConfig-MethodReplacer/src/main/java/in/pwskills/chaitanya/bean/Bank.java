package in.pwskills.chaitanya.bean;

import org.springframework.stereotype.Component;

@Component
public class Bank {
	
	public double calculateCompoundInterest(double pamt, double rate,double time) {
		System.out.println("Bank.calculateCompoundInterest()");
		
		return (pamt * Math.pow(1+rate/100, time))-pamt;
	}

}
