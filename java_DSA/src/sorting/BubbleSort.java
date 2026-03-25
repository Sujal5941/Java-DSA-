package sorting;
import java.util.*;
public class BubbleSort {

	public static int[] BubbleSort(int arr[]) {
		for(int i =0;i<arr.length-1;i++) {
			boolean swap = false;
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
					
					swap = true;
				}
			}
			if(!swap) {	// if array is alread sorted or sorted before 1-n iteration break the loop. To reduce Time Complexity.
				break;
			}
		}
		return arr;
	}
	public static void printArray(int arr[]) { 
		System.out.println("Sorted Array : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array element");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		BubbleSort(arr);
		printArray(arr);

		
	}

}
