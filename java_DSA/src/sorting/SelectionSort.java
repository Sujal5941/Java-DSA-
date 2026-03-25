package sorting;
import java.util.*;
public class SelectionSort {

	public static int[] SelectionSort(int arr[]) {
		for(int i = 0;i< arr.length-1;i++) {
			int minIndex = i;
			for(int j = 1+i;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	
	public static void PrintArray(int arr[]) {
		System.out.println("Sorted Array : ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array element : ");
		for(int i =0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		SelectionSort(arr);
		PrintArray(arr);
	}

}
