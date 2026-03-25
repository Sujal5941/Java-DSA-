package sorting;

import java.util.*;

public class CountingSort {

	public static int[] CountingSort(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		// creating a count array for the frequency count 
		int count[] = new int[max+1];
		
		for(int i = 0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
		int j = 0;  // j is define for the storing the i in the original array
		for(int i = 0;i<count.length;i++) {
			// while loop execute only when the count[i] has some frequency
			while(count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
		return arr;
	}
	
	public static void Printarray(int arr[]) {
		System.out.println("Sorted Array : ");
		for(int i = 0 ;i <arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] arrayInput() {
		Scanner  s =new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = s.nextInt();
		System.out.println("Enter the Array Element : ");
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = arrayInput();
		CountingSort(arr);
		Printarray(arr);
	}

}
