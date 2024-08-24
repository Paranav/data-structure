package array;

public class NthRowRthcolumn {
	
	
	
	public static long NthRowRthcolumn(int row, int column) {
		return findNcRValue(row-1, column-1);
	}
	
	
	public static long findNcRValue(int n, int r) {
		long no = 1;
		long de = 1;
		for (int i = 0; i < r; i++) {
			no = no * (n-i);
			de = de * (i+1);
		}
		return no / de;
	}

	public static void main(String[] args) {
		System.out.println(NthRowRthcolumn(5, 4));
		int rowNumbers = 10;
		for(int i =0; i <rowNumbers; i ++) {
			for(int j=0; j <=i; j++) {
				System.out.print(findNcRValue(i, j)+"  ");
			}
			System.out.println("\n");
		}
	}

}
