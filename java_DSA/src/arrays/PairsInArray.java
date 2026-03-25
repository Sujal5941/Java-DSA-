package arrays;
import java.util.*;
public class PairsInArray {

	public static void Pairs(int arr[]) {
		int tp =0;
		for(int i = 0;i < arr.length - 1 ;i++) {
			for(int j = i+1;j< arr.length ; j++) {
				System.out.print("("+arr[i]+" , "+arr[j]+")\t");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total pairs = "+tp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the Array size: ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the Array Elements : ");
		for(int i =0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		Pairs(arr);
	}

}
