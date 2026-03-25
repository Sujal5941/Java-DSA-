package function;
import java.util.*;
public class BinomialCoefficient {
	
	public static int factorial(int num) {
		int fact = 1;
		
		for(int i = 1;i<=num;i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	public static int BinomialCoef(int n, int r) {
		int binomial_coefficient = 0;
		
		binomial_coefficient = factorial(n)/(factorial(r)*factorial(n-r)) ;
		return binomial_coefficient; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("\t\t **** Binomial Coefficeint ****");
		System.out.println("Enter the n for the Binomial Coefficient : ");
		int n = s.nextInt();
		System.out.println("Enter the r for the Binomial Coefficient : ");
		int r = s.nextInt();
		
		int Binomial_Coef = BinomialCoef(n,r);
		System.out.println("Binomial Coefficient : "+Binomial_Coef);
		
	}

}
