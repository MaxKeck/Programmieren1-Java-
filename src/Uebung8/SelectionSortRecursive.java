package Uebung8;

public class SelectionSortRecursive {

	static int Swapcount = 0;

	public static int[] selectionSort(int[] arr, int numberOfSortedItems) {
		if (arr.length == 0) {
			return arr;
		}
		int min = numberOfSortedItems;
		for (int i = numberOfSortedItems; i < arr.length; i++) {
			if (arr[i] < arr[min]) {
				min = i;
			}
		}

		Swapcount++;
		arr = SwapNumbersinArray(arr, min, numberOfSortedItems);

		if (numberOfSortedItems == arr.length - 1) {
			return arr;
		}
		return selectionSort(arr, numberOfSortedItems + 1);
	}

	public static int[] SwapNumbersinArray(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		return arr;
	}
}
