package Lernnachweis2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RecursiveCalculatorTest {

	@Test
	void PositiveNumberTest() {
		assertEquals(55, RecursiveCalculator.calculateLeftToRight("  55  "));
	}

	@Test
	void FiveOperatorsTest() {
		assertEquals(15, RecursiveCalculator.calculateLeftToRight("3*5+1:4-1%5"));
	}

	@Test
	void ThreeOparatorsWithNegativesTest() {
		assertEquals(8, RecursiveCalculator.calculateLeftToRight("-4*6+-8:6+-5"));
	}

}
