package string;
import java.util.*;
public class StringisPalindrome {

	public static boolean isPalindrome(String str) {
		
		for(int i = 0; i < str.length()/2;i++ ) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		String str;
		System.out.println("Enter the one word String : ");
		str = s.next();
		boolean Palindrome = isPalindrome(str);
		
		if(Palindrome == false) {
			System.out.println("Entered String is not Palindrome!!!");
		}else {
			System.out.println("Entered String is Palindrome.");
		}
	}

}
