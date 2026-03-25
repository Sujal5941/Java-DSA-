package twoDimensionalArray;
import java.util.*;
public class SearchKeyIn2DArrayStaircaseApproach {

	public static boolean SearchMatrix(int matrix[][],int key) {
		
		int row = 0;
		int col = matrix[0].length -1 ;
		
		while(row < matrix.length && col >= 0) {
			
			if(key == matrix[row][col]) {
				System.out.println("Element Found at ("+row+","+col+")");
				return true;
			}
			else if(matrix[row][col] > key) {
				col--;
			}
			else {
				row++;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int arr[][] = {
				{10,20,30,20},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
		};
		
		System.out.println("Enter the Key to Search : ");
		int key = s.nextInt();
		SearchMatrix(arr,key);
	}

}
