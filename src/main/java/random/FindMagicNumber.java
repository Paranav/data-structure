package random;

/*6. Write a Java Program to check if any number is a magic number or not.
 * A number is said to be a magic number if after doing sum of digits in each step
 * and inturn doing sum of digits of that sum,
 * the ultimate result(when there is only one digit left)is 1.*/
public class FindMagicNumber {

	public static void main(String[] args) {
		
		System.out.println(findMagicNumber(6174));

	}

	public static boolean findMagicNumber(int number) {
		boolean result = false;
		int sum = 0;

		while (number > 0 || sum > 9) {
			if (number == 0) {
				number = sum;
				sum = 0;
			}
			sum += number % 10;
			number /= 10;
		}

		if (sum == 1) {
			return true;
		}
		return result;
	}

}
