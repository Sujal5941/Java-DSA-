package loops;
import java.util.*;
public class PrintReverseOfNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number to Reverse : ");
		long n = s.nextInt();
		long last_digit = 0;
		while(n>0) {
			last_digit = n % 10;
			n /= 10;
			System.out.print(last_digit);
		}
		/*
		Can also be implemented by for loop 
		for(;n > 0;n=n/10) {
			last_digit = n%10;
			System.out.print(last_digit);
		}
		*/
	}

}
