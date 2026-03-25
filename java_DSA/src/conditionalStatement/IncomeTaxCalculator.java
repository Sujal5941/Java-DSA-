package conditionalStatement;
import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Income : ");
		int income = s.nextInt();
		double income_tax = 0;
		if(income < 500000) { 
			System.out.println("Your Tax on Income "+income+" is : "+income_tax);
		}
		else if(income >= 500000 && income<=1000000 ) {
			income_tax = income * 0.20;
			System.out.println("Your Tax on Income "+income+" is : "+income_tax);
		}
		else {
			income_tax = income * 0.30;
			System.out.println("Your Tax on Income "+income+" is : "+income_tax);
		}
		
	}

}
