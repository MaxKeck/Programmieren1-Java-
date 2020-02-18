package Uebung8;
import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SortedMergeTest {

	@Test
	void testCreateSortedList() {
		char[] TestArray1 = { '2', '8', '6', '4' };
		char[] TestArray2 = { '9', '7', '5', '3', '1' };
		char[] ExpectedArray = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		assertArrayEquals(ExpectedArray, SortedMerge.createSortedList(TestArray1, TestArray2));
		System.out.println("Compared: " + SortedMerge.countcompare);
		System.out.println("Swaped: " + SortedMerge.countswap);
	}

}
