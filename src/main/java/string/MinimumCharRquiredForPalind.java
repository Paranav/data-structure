package string;

public class MinimumCharRquiredForPalind {
	
	public static int minimumcharRequiredAtPrefixToMakeString(String s) {
		int numberRequired = 0;
		
		//move this front pointer only if chart at front pointer is equal to char at i;
		int frontPointer=0;
		
		for(int i=s.length()-1; frontPointer<i; i--) {
			if(s.charAt(i) == s.charAt(frontPointer)) {
				frontPointer++;
			}else {
				numberRequired++;
			}
		}
		return numberRequired;
	}

	public static void main(String[] args) {
		
		String srt = "cbabcde";
		String srt2 = "cdadcde";
		String srt3 = "cdadcce";
		
		System.out.println(minimumcharRequiredAtPrefixToMakeString(srt));
		System.out.println(minimumcharRequiredAtPrefixToMakeString(srt2));
		System.out.println(minimumcharRequiredAtPrefixToMakeString(srt3));
	}

}
