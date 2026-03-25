package function;
import java.util.*;
public class PrimeOrNot {

	public static boolean isPrime(int n) {
		
		if (n==2) {
			return true;
		}
		else {
			for(int i = 2;i<= Math.sqrt(n);i++) {
				if(n% i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N Number");
		int n = s.nextInt();
		
		boolean isPrimeNo = isPrime(n);
		
		if(isPrimeNo == true) {
			System.out.println(n+" is Prime Number");
		}
		else {
			System.out.println(n+" is Not a Prime Number");
		}
	}

}
