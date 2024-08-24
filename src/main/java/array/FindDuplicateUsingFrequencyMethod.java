package array;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateUsingFrequencyMethod {

	public static int findDuplicateNumberUsingFrequencyMehod(int[] arr) {

		Map<Integer, Integer> noFreq = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (!noFreq.containsKey(arr[i])) {
				noFreq.put(arr[i], 1);
			} else {
				return arr[i];
			}
		}

		return -1;

	}

	public static void main(String[] args) {

	}

}
