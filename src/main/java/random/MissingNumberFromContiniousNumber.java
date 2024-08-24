package random;

public class MissingNumberFromContiniousNumber {

	public static void main(String[] args) {

		int[] sampleArray = new int[] { 2, 3, 6, 4, 7, 5 };
		System.out.println("Missing no in the given array: " + findMissingNumberFromContiniousSeries(sampleArray));
		
		int[] sampleArray2 = new int[] { 1, 2, 3, 6, 4, 5 };
		System.out.println("Missing no in the given array: " + findMissingNumberFromContiniousSeries(sampleArray2));
		
		int[] sampleArray3 = new int[] { 1, 2, 3, 7, 4, 5 };
		System.out.println("Missing no in the given array: " + findMissingNumberFromContiniousSeries(sampleArray3));
	}

	public static int findMissingNumberFromContiniousSeries(int[] arrayOfNumber) {
		int actualSum = 0;
		int totalExpectedSum = 0;

		for (int i = 0; i < arrayOfNumber.length; i++) {
			totalExpectedSum = totalExpectedSum + i + 1;
			actualSum += arrayOfNumber[i];
		}
		totalExpectedSum += (arrayOfNumber.length + 1);
		return totalExpectedSum - actualSum;
	}

}
