package Uebung8;

public class SortedMerge {

	static int countswap = 0, countcompare = 0;

	public static char[] createSortedList(char[] list0, char[] list1) {
		char[] listtosort = concatenatechararray(list0, list1);

		Quicksort(listtosort, 0, listtosort.length - 1);

		return listtosort;
	}

	public static void Quicksort(char[] list, int links, int rechts) {
		if (links < rechts) {
			int q = partition(list, links, rechts);
			Quicksort(list, links, q - 1);
			Quicksort(list, q + 1, rechts);
		}
	}

	public static int partition(char[] list, int links, int rechts) {
		int pivot, i, j;
		char tmp;
		pivot = list[rechts];
		i = links;
		j = rechts - 1;

		while (i <= j) {
			countcompare++;
			if (list[i] > pivot) {
				// swap
				countswap++;
				tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
				j--;
			} else {
				i++;
			}
		}

		countswap++;
		tmp = list[i];
		list[i] = list[rechts];
		list[rechts] = tmp;

		return i;
	}

	public static char[] concatenatechararray(char[] list0, char[] list1) {
		char[] result = new char[list0.length + list1.length];

		System.arraycopy(list0, 0, result, 0, list0.length);
		System.arraycopy(list1, 0, result, list0.length, list1.length);

		return result;
	}

}
