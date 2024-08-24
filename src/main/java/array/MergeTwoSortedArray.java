package array;

import java.util.Arrays;
import java.util.Comparator;

public class MergeTwoSortedArray {
	
	
	
	public static void mergeTwoSortedArray(int[] arrr1, int[] arr2) {
		
		int left = arrr1.length -1 ;
		int right = 0 ;
		
		while( left >= 0 && right < arr2.length -1  && arrr1[left] > arr2[right]) {
			int tempValue = arrr1[left];
			arrr1[left] = arr2[right];
			arr2[right] = tempValue;
			right++;
			left--;
		}
		
		Arrays.sort(arrr1);
		Arrays.sort(arr2);
		for(int i=0; i<arrr1.length; i++) {
			System.out.print(arrr1[i]+",");
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+",");
		}
	}

	public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        
        mergeTwoSortedArray(arr1, arr2);
	}

}
