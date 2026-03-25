package string;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		
//		char arr[] = {'a','b','c','d','e'};
//		String str = "abcde";					// creates a object memory in String pool 
//		String str2 = new String("uvwxyz"); 	//  creates a new object in the heap memory
		
		Scanner s = new Scanner(System.in);
		String str1 = "Hello,";
		String name;
		
//		name = s.next();						// next() take only one word as input
//		System.out.println(name);
		
//		name = s.nextLine();					// nextLine() take input as whole Line
//		System.out.println(name);
//		
//		int len = name.length();				// calculate the length of the String
//		System.out.println(len);
		
//		// Concatenation 
//		System.out.println(str1 + name);
		
		// Access Character using charAt()
		for(int i = 0 ; i< str1.length();i++) {
			System.out.println("Charatcer at index "+i+" is :" +str1.charAt(i));
		}

	}

}
