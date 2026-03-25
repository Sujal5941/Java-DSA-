package conditionalStatement;
import java.util.*;
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = s.nextInt();
		
		String even_odd = (a%2 == 0)? "Even Number" : "Odd Number";
		System.out.println(even_odd);
	}

}
