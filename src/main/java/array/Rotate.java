package array;

public class Rotate {

	public static int[][] swapRowAndColumn(int[][] arr, int row, int column) {

		int[][] visited = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				visited[i][j] = 0;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int tempValue = arr[i][j];
				if (visited[i][j] != 1) {
					visited[i][j] = 1;
					visited[j][i] = 1;
					arr[i][j] = arr[j][i];
					arr[j][i] = tempValue;
				}
			}
		}
		return arr;
	}
	
	public static int[][] reverseRow(int[][] arr, int row, int column) {
		int reversePointer = column-1;
		for(int i=0; i<row; i++) {
			reversePointer = column-1;
			for(int j=0; j<reversePointer; j++) {
				int tempValue = arr[i][j];
				arr[i][j] = arr[i][reversePointer];
				arr[i][reversePointer] = tempValue;
				reversePointer--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,3},
		                           {4,5,6},
		                           {7,8,9}};
		
		arr = swapRowAndColumn(arr, 3, 3);
		arr = reverseRow(arr,3,3);
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
