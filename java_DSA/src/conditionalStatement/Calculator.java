package conditionalStatement;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Choices :\n1) Addition.\t2) Subtraction.\t3) Multiplication.\n4) Division.\t5) Modulus.");
		System.out.println("Enter number a : ");
		int a = s.nextInt();
		System.out.println("Enter number b : ");
		int b = s.nextInt();
		
		System.out.println("Enter Choice : ");
		int ch = s.nextInt();
		
		switch(ch) {
		case 1: //we can also pass operator like case '*'
			System.out.println("Addition : "+(a+b));
			break;
		case 2:
			System.out.println("Substraction : "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication : "+(a*b));
			break;
		case 4:
			System.out.println("Divsion : "+(a/b));
			break;
		case 5:
			System.out.println("Modulus : "+(a%b));
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
