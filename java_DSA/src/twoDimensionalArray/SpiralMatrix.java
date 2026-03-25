package twoDimensionalArray;
import java.util.*;
public class SpiralMatrix {

	public static void SpiralMatrix(int arr[][]) {
		int startRow = 0;
		int startCol = 0;
		int endRow = arr.length -1;
		int endCol = arr[0].length - 1;
		
		// main loop 
		while(startRow <= endRow && startCol <= endCol) {
			
			// top
			for(int j = startCol;j<=endCol;j++) {
				System.out.print(arr[startRow][j]+" ");
			}
			
			// left
			for(int i = startRow+1;i<=endRow;i++) {
				System.out.print(arr[i][endCol]+" ");
			}
			
			//Bottom
			for(int j = endCol - 1;j>=startCol;j--) {
				if(startRow == endRow) {
					break;
				}
				System.out.print(arr[endRow][j]+" ");
			}
			
			//left
			for(int i = endRow - 1;i>=startRow+1;i--) {
				if(startCol == endCol) {
					break;
				}
				System.out.print(arr[i][startCol]+" ");
			}
			startCol++;
			endCol--;
			startRow++;
			endRow--;
		}
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of Rows : ");
		int n = s.nextInt();
		System.out.println("Enter the no of Cols : ");
		int m = s.nextInt();
		int arr[][] = new int[n][m];
		System.out.println("Enter the array element : ");
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				arr[i][j] = s.nextInt(); 
			}
		}
		
		SpiralMatrix(arr);
	}

}
