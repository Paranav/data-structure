package random;

class Solution {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(longestPalindrome("babadaba"));
		
	}
    public static String longestPalindrome(String s) {
        String resultString = "";
        if(s == null || s.length() < 2) {
            return s;
        }

        for(int i=0; i < s.length()-1; i++) {
           resultString = expanThroughCenter(s, i, i, resultString);
           resultString = expanThroughCenter(s, i, i+1, resultString);
        }
        return resultString;
    }

    public static String expanThroughCenter(String s, int start, int end, String resultString) {
        
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        if(start < end) {
            String tempResultString = s.substring(start+1, end);
            if(tempResultString.length() > resultString.length()) {
                return tempResultString;
            }
        }
        return resultString; 
    }
}