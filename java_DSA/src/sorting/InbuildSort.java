package sorting;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.*;

public class InbuildSort {
	
	public static int[] PrimitiveInbuiltSort(int arr[]) { 		// for ascending array
		Arrays.sort(arr);
		return arr;
	}
	
	public static Integer[] ComparatorInbuiltSort(Integer arr[]) {
		Arrays.sort(arr,Comparator.reverseOrder());
		return arr;
	}
	
	public static Integer[] CollectionInbuiltSort(Integer arr[]) {
		Arrays.sort(arr,Collections.reverseOrder());
		return arr;
	}

	public static void Printarray(int arr[]) {
		System.out.println("Sorted Array : ");
		for(int i = 0 ;i <arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void Printarrayobj(Integer arr[]) {
		System.out.println("Sorted Array : ");
		for(int i = 0 ;i <arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
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
		PrimitiveInbuiltSort(arr);
		System.out.println("Primitive Array Sort Ascending : ");
		Printarray(arr);
		
		Integer[] arrobj = new Integer[arr.length];
		// traditional for loop for converting int array to Integer array
		for (int i = 0; i < arr.length; i++) {
		    arrobj[i] = Integer.valueOf(arr[i]); 		// Use Integer.valueOf for efficient boxing converting int array into Integer array.
		}
		
		ComparatorInbuiltSort(arrobj);
		System.out.println("Comparator Array Sort (Descending) : ");
		Printarrayobj(arrobj);
		
		CollectionInbuiltSort(arrobj);
		System.out.println("Collection use Comparator Array Sort (Descending) : ");
		Printarrayobj(arrobj);
	}

}
