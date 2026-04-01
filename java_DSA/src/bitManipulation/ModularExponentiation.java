package bitManipulation;
import java.util.*;
public class ModularExponentiation {

	public static int ModularExponent(int a,int n,int m) {
		int ans = 1;
		a = a % m;
		while(n>0) {
			if((n&1) != 0) {
				ans = (ans * a)%m;
			}
			a = (a*a)%m;
			n=n>>1;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = s.nextInt();
		System.out.println("Enter the Exponent : ");
		int n = s.nextInt();
		System.out.println("Enter the Modulus value : ");
		int m = s.nextInt();
		
		System.out.println("Modulus of "+a+" to the power "+n+" is : "+ModularExponent(a,n,m));
	}

}
