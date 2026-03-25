package sorting;

import java.util.Scanner;

public class NegCountingSort {

	public static int[] NegCountingSort(int arr[]) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		int range = max - min +1;
		int count[] = new int[range];
		
		for(int i =0;i<arr.length;i++) {
			count[arr[i] - min]++;
		}
		
		int j =0;
		for(int i = 0;i<count.length;i++) {
			
			while(count[i]>0) {
				arr[j] = i + min;
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
		NegCountingSort(arr);
		Printarray(arr);
	}

}
