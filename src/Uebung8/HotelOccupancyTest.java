package Uebung8;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HotelOccupancyTest {

	@Test
	void testFileToString() {
		String path = "belegung.txt";
		String Expected = "0 2 4 1 1 0 3 2 2 1 1 4 0 0 0 1 1 1 2 2";
		assertEquals(Expected, HotelOccupancy.fileToString(path));
	}

	@Test
	void testroomList() {
		// String Expected = "Zimmer Geaste\n0 0\n1 2\n"
	}

}
