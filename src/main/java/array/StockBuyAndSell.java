package array;

public class StockBuyAndSell {
	
	public static int findMax(int[] arr, int start) {
		int maxValue = Integer.MIN_VALUE;
		for(int i =start; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	public static int findProfit(int[] arr) {
		int profit = 0;
		int maxProfit = 0;
		for (int i = 0; i < arr.length; i++) {
			profit = findMax(arr, i) - arr[i];
			if(profit > maxProfit) {
				maxProfit = profit;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = new int[] {7,5,1,3,10,4};
		System.out.println(findProfit(prices));
	}

}
