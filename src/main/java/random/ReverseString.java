package random;

public class ReverseString {

	public static void main(String[] args) {
		
		String inputString = "ParanavKumarChaudhary";
		System.out.println("Reverse String of '"+ inputString + "' : "+ reverseString(inputString));

	}

	public static String reverseString(String inputString) {

		int i = 0;
		int j = inputString.length() - 1;

		char[] reverseString = new char[inputString.length()];

		while (i < j) {
			reverseString[i] = inputString.charAt(j);
			reverseString[j] = inputString.charAt(i);
			j--;
			i++;
		}

		int middleIndex = ((inputString.length() + 1) / 2)-1;

		if (middleIndex != 0) {
			reverseString[middleIndex] = inputString.charAt(middleIndex);
		}

		return String.valueOf(reverseString);
	}

}
