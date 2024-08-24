package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {

	public static List<List<Integer>> mergeInterval(int[][] arr) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (result.isEmpty() || result.get(result.size() - 1).get(1) < arr[i][0]) {
				result.add(Arrays.asList(arr[i][0], arr[i][1]));
			} else {
				result.get(result.size() - 1).set(1, arr[i][1]);
			}
		}
		return result;
	}

	public static void main(String[] str) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> ans = mergeInterval(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
	}
}
