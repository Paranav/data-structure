package array;

public class LaxicoGraphicallyNextElement {

	public static int nextGratterNumberIndexInArray(int[] arr, int index) {
		int gratter = Integer.MAX_VALUE;
		int result = index;
		for (int i = index; i < arr.length; i++) {
			if (arr[i] > arr[index] && arr[i] < gratter) {
				gratter = arr[i];
				result = i;
			}
		}
		return result;
	}

	public static int[] swapElement(int[] arr, int index1, int index2) {
		int tempValue = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tempValue;
		return arr;
	}

	public static int[] laxicoGraphicallyNextOrder(int[] arr) {
		int start = -1;
		int reverseIndex = arr.length - 1;
		for (int i = arr.length - 2; i >= 0; i--) {   // run from second last index
			if (arr[i] < arr[i + 1]) { // find brak point
				int nextGreaterNumberIndex = nextGratterNumberIndexInArray(arr, i);  // find next gratternumber from break point number
				arr = swapElement(arr, nextGreaterNumberIndex, i); // swap those number
				start = i + 1; // mark point after break point
				break;
			}
		}

		// run to reverse the array from next to break point
		for (int i = start; i < reverseIndex && start != -1; i++) { 
			swapElement(arr, i, reverseIndex);
			reverseIndex--;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 1 };
		int[] ar = laxicoGraphicallyNextOrder(arr);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}
