package function;
import java.util.*;
public class FactorialOfN {

	public static int factorialOfN(int n) {
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter Number N : ");
		int n = s.nextInt();
		
		int factorial = factorialOfN(n);
		System.out.println("Factorial of "+n+" is "+factorial);
	}

}
