package string;

public class LongestPalindromString {

	public static void main(String[] args) {
		
		String str = "abaaabaaab";
		System.out.println(longestPalindromString(str));

	}

	public static String longestPalindromString(String inputString) {

		MaxPalindromString maxPalindromString = new MaxPalindromString(inputString);

		for (int i = 0; i < inputString.length(); i++) {
			maxPalindromString = palindromString(i, i, maxPalindromString);
			maxPalindromString = palindromString(i, i+1, maxPalindromString);
		}
		
		return maxPalindromString.getPalindromString();
	}

	public static MaxPalindromString palindromString(int start, int end, MaxPalindromString maxPalindromString) {
		while (start >= 0 && end < maxPalindromString.getInputString().length() && maxPalindromString.getInputString()
				.charAt(start) == maxPalindromString.getInputString().charAt(end)) {
			start--;
			end++;
		}
		end--;
		start++;
		if (maxPalindromString.getLength() < (end - start + 1)) {
			return new MaxPalindromString(maxPalindromString.getInputString(), start, end);
		}
		return maxPalindromString;
	}

	static class MaxPalindromString {
		private String inputstring;
		private Integer start;
		private Integer end;
		private int length = 0;

		public MaxPalindromString(String inputString) {
			this.inputstring = inputString;
		}

		public MaxPalindromString(String inputString, int start, int end) {
			this.inputstring = inputString;
			this.start = start;
			this.end = end;
			this.length = getPalindromString().length();
		}

		public String getInputString() {
			return inputstring;
		}

		public String getPalindromString() {
			if(start == null || end == null) {
				return null;
			}
			StringBuilder builder = new StringBuilder();
			for (int i = start; i <= end; i++) {
				builder.append(inputstring.charAt(i));
			}
			return builder.toString();
		}

		public int getLength() {
			return length;
		}
	}

}
