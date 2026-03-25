package function;
import java.util.*;
public class BinaryToDecimal {
	
	public static int BinaryToDec(int n) {
		double Decimal = 0;
		double lastdigit = 0;
		for(int i = 0;n > 0;i++) {
			lastdigit = n%10;
			n /=10;
			Decimal += (lastdigit * Math.pow(2, i));
		}
		
		return (int) (Decimal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Binary Number : ");
		int n = s.nextInt();
		
		int decimal_conversion = BinaryToDec(n);
		
		System.out.println("Decimal of "+n+" is : "+decimal_conversion);
		
	}

}
