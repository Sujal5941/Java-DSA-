package arrays;
import java.util.*;
public class CreatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = new int[10];		//Creating an array.
		
		// length of array
		System.out.println("Total no of Subjects : "+marks.length);
		
		// Input
		Scanner s = new Scanner(System.in);
		marks[0] = s.nextInt();
		marks[1] =s.nextInt();
		
		//Output
		System.out.println("phyisc : "+marks[0]);
		System.out.println("math : "+marks[1]);
		
		//update 
//		marks[1] =100;
//		System.out.println("Updated marks of math : "+marks[1]);
		
		int percentage =  ((marks[0]+marks[1])/2);
		System.out.println("Percentage : "+percentage+"%");
		
		
	}

}
