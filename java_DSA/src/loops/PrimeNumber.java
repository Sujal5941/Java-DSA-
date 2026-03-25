package loops;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter a Number : ");
		 int n = s.nextInt();
		 boolean isPrime = true;
		 if(n == 2) {
			 System.out.println(n+" is a Prime Number");
		 }
		 else {
			 for(int i = 2;i<= Math.sqrt(n);i++) {
				 if(i % n == 0) {
					 isPrime = false;
				 }
			 }
			 
			 if(isPrime == true) {
				 System.out.println(n+" is a Prime Number");
			 }else {
				 System.out.println(n+" is not a Prime Number ");
			 }
		 }
		 
		 
	}

}
