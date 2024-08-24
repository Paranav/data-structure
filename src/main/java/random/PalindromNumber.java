package random;

import java.util.Objects;
import java.util.Scanner;

public class PalindromNumber {
	public static void main(String args[]) {
		while (true) {
			Scanner s = new Scanner(System.in);
			String word = s.nextLine();
			System.out.println("Is " + word + " palindrome? - " + isWordPalindrome(word));
		}
	}

	public static boolean isWordPalindrome(String word) {
		String reverseWord = getReverseWord(word);
		// if word equals its reverse, then it is a palindrome
		if (word.equals(reverseWord)) {
			return true;
		}
		return false;
	}

	public static String getReverseWord(String word) {
		String reversWord = "";
		if (Objects.isNull(word) || word.isBlank()) {
			return reversWord;
		}
		if (word.length() == 1) {
			return word;
		}
		reversWord = word.charAt(0) + "";
		return getReverseWord(word.substring(1, word.length())) + reversWord;
	}
}
