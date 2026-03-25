package arrays;
import java.util.*;
public class BuySellStocks {

	public static int MaxProfit(int arr[]) {
		int maxProfit = 0,profit = 0;
		int buyPrice = Integer.MAX_VALUE;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(buyPrice > arr[i]) {
				buyPrice = arr[i];
			}else {
				profit = arr[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of days for stock prices: ");
		int n = s.nextInt();
		System.out.println("Enter the Stock Price of Each Day");
		int price[] = new int[n];
		for(int i =0;i<n;i++) {
			System.out.print((i+1)+" : ");
			price[i] = s.nextInt();
		}
		
		System.out.println("Max Profit : "+MaxProfit(price));
	}

}
