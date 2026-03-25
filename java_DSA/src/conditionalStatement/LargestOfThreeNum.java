package conditionalStatement;
import java.util.*;
public class LargestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number a : ");
		int a = s.nextInt();
		System.out.println("Enter Number b : ");
		int b = s.nextInt();
		System.out.println("Enter Number c : ");
		int c = s.nextInt();
		
		if (a>b) {
			if(a>c) {
				System.out.println("A = "+a+" is largest Number");
			}else {
				System.out.println("C = "+c+" is largest Number");
			}
		}else {
			if(b>c) {
				System.out.println("B = "+b+" is largest Number");
			}else {
				System.out.println("C = "+c+" is largest Number");
			}
		}
	}

}
