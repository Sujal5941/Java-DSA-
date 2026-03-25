package twoDimensionalArray;
import java.util.*;
public class SearchKeyInMatrixBinarySearch {

	public static boolean SearchMatrix(int arr[][],int key) {
		
		for(int i = 0;i < arr.length;i++) {
			int start = 0;
			int end = arr[0].length-1;
			while(start<=end) {
				int mid = start + (end-start)/2;
				if(arr[i][mid] == key) {
					System.out.println("Element found at ("+i+","+mid+")");
					return true;
				}
				else if(arr[i][mid]<key) {
					start = mid + 1;
				}
				else {
					end = mid - 1;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = {
				{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
		};
		System.out.println("Enter the Key to Search : ");
		int key = s.nextInt();
		SearchMatrix(arr,key);
	}

}
