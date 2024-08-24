package random;



/**
 * @author kpara
 * 
 *  Write a java program to check if any number given as input is the sum of 2 prime numbers
 *
 */
public class PrintTheNumberSumOfPrimeNumber {
	private static boolean check_prime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Method to get print the prime sum
	private static void find(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (check_prime(i)) {
				if (check_prime(num - i))
					System.out.println(num + " = " + (num - i) + " + " + i);
			}
		}
	}

	public static void main(String[] args) {
		find(18);
	}
}
