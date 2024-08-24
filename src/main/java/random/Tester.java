package random;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("Welcome mavenir");
		
		ObjectMapper mapper = new ObjectMapper();
		
		System.out.println(mapper.getDateFormat());
	}
	
	
	public static int testFunction(int [] arr, int length) {
		
		int firstScore = 0;
		int secondScore =0;
		
		for(int i=0; i<length; i++) {
			if(i%2 == 0) {
			firstScore = firstScore + arr[i];
			}else {
				secondScore = secondScore + arr[i];
			}
		}
		
		return firstScore - secondScore; 
	}

}
