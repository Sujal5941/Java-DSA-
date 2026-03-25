package arrays;
import java.util.*;
public class BinarySearch {

	public static int binarySearch(int arr[],int low,int high,int key) {
		int mid=0;
		while(low<=high) {
			mid = low +(high-low)/2;
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] > key) {
				high = mid - 1; 
			}else {
				low = mid +1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = {2, 4, 6, 8, 10, 12, 14};
		int low = 0;
		int high = arr.length;
		System.out.println("Enter the key to Search : ");
		int key = s.nextInt();
		int key_index = binarySearch(arr, low, high, key);
		
		if(key_index == -1) {
			System.out.println(key+" Not found.");
		}
		else {
			System.out.println(key+" is found at index : "+key_index);
		}
		
	}

}
