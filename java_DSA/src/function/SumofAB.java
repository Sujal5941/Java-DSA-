package function;
import java.util.*;
public class SumofAB {
	
	public static int sumAB(int a, int b) { // parameters or formal parameters
		int sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number A : ");
		int a = s.nextInt();
		System.out.println("Enter Number B : ");
		int b = s.nextInt();
		
		
		int sum = sumAB(a,b);	// arguments or actual parameter
		System.out.println("Sum : "+sum);
	}

}
