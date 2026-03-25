package pattern1;
import java.util.*;
public class PrintCharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter n for Print character pattern : ");
		int n = s.nextInt();
		
		char ch ='A';
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
