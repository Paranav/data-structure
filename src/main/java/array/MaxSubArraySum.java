package array;

public class MaxSubArraySum {
	
	
	public static int maxSubArraySum(int[] arr) {
		int sum = Integer.MIN_VALUE;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (sum < 0) {
				sum = 0;
			}
			sum = sum + arr[i];
			if (maxSum < sum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {7,5,-12,5,6};
		System.out.println(maxSubArraySum(arr1));

	}

}
