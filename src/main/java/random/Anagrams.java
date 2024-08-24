package random;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("First string: ");

		String str1 = sc.nextLine();

		System.out.print("First string: ");

		String str2 = sc.nextLine();

		System.out.println("Is string '" + str1 + "," + " '" + str2 + ", Anagrams: " + isAnagrams(str1, str2));

	}

	public static boolean isAnagrams(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			return result;
		}
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);
		return Arrays.equals(char1, char2);
	}

}
