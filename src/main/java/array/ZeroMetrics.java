package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMetrics {
	
	
	public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> arr, int m, int n) {
		int[] row = new int[m];
		int[] col = new int[n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr.get(i).get(j) == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				if (row[x] == 1 || col[y] == 1) {
					arr.get(x).set(y, 0);
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        
        int n = matrix.size();
        int m = matrix.get(0).size();
        
        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, m, n);
        
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        

	}

}
