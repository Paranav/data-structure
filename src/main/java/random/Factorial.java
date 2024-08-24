package random;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		System.out.println("Factorial of number '"+number+"' : "+factorial(number));


	}
	
	public static int factorial(int number) {
		int factorial = 1;
		if(number == 0) {
			return factorial;
		}
		
		for(int i=1; i<=number; i++) {
			factorial = factorial*i;
		}
		return factorial;
	}

}
