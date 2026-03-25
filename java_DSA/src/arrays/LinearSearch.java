package arrays;
import java.util.*;
public class LinearSearch {

	public static int linearSearch(int key,int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N for number of element in the array");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the Array Element : ");		
		for(int i = 0;i<arr.length;i++) {

			arr[i] = s.nextInt();
		}
		
		System.out.println("Enter a Key to Search : ");
		int key = s.nextInt();
		
		int index = linearSearch(key,arr);
		
		if(index == -1) {
			System.out.println(key+" not found in the array");
		}else {
			System.out.println(key+" found in the array at index position "+index);
		}
	}

}
