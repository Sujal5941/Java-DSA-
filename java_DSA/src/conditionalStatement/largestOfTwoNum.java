package conditionalStatement;
import java.util.*;

public class largestOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number a : ");
		int a = s.nextInt();
		System.out.println("Enter the number b : ");
		int b = s.nextInt();
		
		if (a>b) {
			System.out.println("Number a is greater");
		}else {
			System.out.println("Number b is greater");
		}
	}

}
