package array;

public class SetMetricsZero {

	public static int[][] setMetrizZero(int[][] arr) {
		int[] row = new int[arr.length];
		int[] column = new int[arr[0].length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}

		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < column.length; j++) {
				if (row[i] == 1 || column[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 0, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		int[][] ans = setMetrizZero(arr);

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
