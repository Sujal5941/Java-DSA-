package function;
import java.util.*;
public class ProductAB {

	public static int productofAB(int a, int b) {
		int prod = a*b;
		return prod;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number A :");
		int a = s.nextInt();
		
		System.out.println("Enter Number B");
		int b = s.nextInt();
		
		int product = productofAB(a,b);
		System.out.println("Product : "+product);
	}

}
