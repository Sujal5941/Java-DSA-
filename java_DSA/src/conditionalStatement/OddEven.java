package conditionalStatement;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = s.nextInt();
		
		if(a%2 == 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd NUmber");
		}
	}

}
