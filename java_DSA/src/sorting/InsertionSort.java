package sorting;
import java.util.*;

public class InsertionSort {
	
	// Using swap method for the insertion sort  
//    for(int i = 1; i < arr.length; i++) {
//
//        int j = i;
//
//        while(j > 0 && arr[j] < arr[j-1]) {
//
//            int temp = arr[j];
//            arr[j] = arr[j-1];
//            arr[j-1] = temp;
//
//            j--;
//        }
//	
	public static int[] InsertionSort(int arr[]) {
		for(int i = 1;i<arr.length;i++) {
			int key = arr[i];
			int prev = i-1;
			while(prev >=0 && arr[prev] > key) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev+1] = key;
		}
		return arr;
	}
	
	public static void Printarray(int arr[]) {
		System.out.println("Sorted Array : ");
		for(int i = 0 ;i <arr.length;i++) {
			System.out.println(arr[i]+" ");
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
		//Input Array
		int arr[] =arrayInput();
		InsertionSort(arr);
		Printarray(arr);
	}

}
