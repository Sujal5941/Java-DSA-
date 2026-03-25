package loops;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number to reverse : ");
		long n = s.nextLong();
		long lastdigit = 0;
		long revNum = 0;
		while(n>0) {
			lastdigit = n % 10;
			revNum = (revNum * 10)+lastdigit ;
			n /= 10;
		}
		System.out.println("Reverse Number : "+revNum);

	}

}
