package function;
import java.util.*;
public class PrintPrimesInRange {

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
	
	public static void primesInRange(int n) {
		for(int i = 2;i<=n;i++) {
			if (isPrime(i))
			{
				System.out.println(i+" ");
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N Number");
		int n = s.nextInt();
		
		System.out.println("Prime Number form 2 to "+n+" is:");
		primesInRange(n);
	}

}
