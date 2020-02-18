package Uebung8;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SelectionSortRecursiveTest {

	@Test
	void testselectionSort() {
		int[] TestArray = { 9, 7, 5, 3, 1 };
		int[] ExpectedArray = { 1, 3, 5, 7, 9 };
		assertArrayEquals(ExpectedArray, SelectionSortRecursive.selectionSort(TestArray, 0));
	}

	@Test
	void testSwapNumbersinArray() {
		int[] TestArray = { 1, 5, 3, 7, 9 };
		int[] ExpectedArray = { 1, 5, 7, 3, 9 };
		assertArrayEquals(ExpectedArray, BubblesortRecursive.SwapNumbersinArray(TestArray, 2, 3));
	}

}
