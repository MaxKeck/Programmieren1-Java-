package Uebung8;

public class BubblesortRecursive {

	public static int[] bubbleSort(int[] arr, int numberOfItemsToBeSorted) {
		boolean swapped = false;
		int lastswapped = numberOfItemsToBeSorted - 1;

		for (int i = 0; i < numberOfItemsToBeSorted - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				swapped = true;
				lastswapped = i;
				arr = SwapNumbersinArray(arr, i, i + 1);
			}
		}
		if (swapped) {
			return bubbleSort(arr, lastswapped + 1);
		}
		return arr;
	}

	public static int[] SwapNumbersinArray(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		return arr;
	}
}
