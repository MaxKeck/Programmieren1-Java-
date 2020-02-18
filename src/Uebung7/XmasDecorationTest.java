package Uebung7;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class XmasDecorationTest {

	@Test
	void GenerateXmasTreeLineTest1() {
		assertEquals("  X X  ", XmasDecoration.getXmasTreeLine(5, true, 1));
	}

	@Test
	void GenerateXmasTreeLineTest2() {
		assertEquals("XXXXX", XmasDecoration.getXmasTreeLine(4, false, 2));
	}

	@Test
	void GenerateXmasTreeLineTest3() {
		assertEquals("   I   ", XmasDecoration.getXmasTreeLine(5, true, 4));
	}

	@Test
	void GenerateXmasTreeLineTest4() {
		assertEquals("  XXXXXXX  ", XmasDecoration.getXmasTreeLine(7, false, 3));
	}

	@Test
	void GenerateXmasTreeLineTest5() {
		assertEquals("X", XmasDecoration.getXmasTreeLine(2, true, 0));
	}
}
