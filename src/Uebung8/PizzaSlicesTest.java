package Uebung8;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PizzaSlicesTest {

	@Test
	void testnumberOfPizzaSlices() {
		assertEquals(1, PizzaSlices.numberOfPizzaSlices(0), "0 Schnitte erzeugen 1 St�ck.");
		assertEquals(2, PizzaSlices.numberOfPizzaSlices(1), "1 Schnitt erzeugt 2 St�cke.");
		assertEquals(4, PizzaSlices.numberOfPizzaSlices(2), "2 Schnitte erzeugen bis zu 4 St�cke.");
		assertEquals(7, PizzaSlices.numberOfPizzaSlices(3), "3 Schnitte erzeugen bis zu 7 St�cke.");
		assertEquals(11, PizzaSlices.numberOfPizzaSlices(4), "4 Schnitte erzeugen bis zu 11 St�cke.");
	}

}
