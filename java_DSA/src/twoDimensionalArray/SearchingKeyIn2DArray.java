package twoDimensionalArray;
import java.util.*;
public class SearchingKeyIn2DArray {

	public static boolean SearchKey(int arr[][],int key) {
		
		for(int i = 0 ; i<arr.length;i++) {
			for(int j = 0 ;j<arr[0].length;j++) {
				if(arr[i][j] == key) {
					System.out.println("Key is found at ("+i+","+j+")");
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows in 2D Array : ");
		int n = s.nextInt();
		System.out.println("Enter the Number of Columns in 2D Array : ");
		int m = s.nextInt();
		System.out.println("Enter the key to search in array : ");
		int key = s.nextInt();
		int arr[][] = new int[n][m];
		System.out.println("Enter the array Element : ");
		for(int i = 0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		boolean search = SearchKey(arr,key); 
		if(search == true) {
			System.out.println("Key Found!!!");
		}else {
			System.out.println("Key Not Found!!!");
		}
	}

}
