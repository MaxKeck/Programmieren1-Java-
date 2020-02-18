package Uebung5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SimpleWeatherReportTest {

	@Test
	void testMaerzDeutschland() {
		String expected = "Nicht vorhersehbar!";

		String actual = SimpleWeatherReport.predictWeather(5, "Deutschland");

		assertEquals(expected, actual);

	}

	@Test
	void testfalscherMonat() {
		String expected = "Eingabefehler";

		String actual = SimpleWeatherReport.predictWeather(13, "Deutschland");

		assertEquals(expected, actual);

	}

	@Test
	void testnegativerMonat() {
		String expected = "Eingabefehler";

		String actual = SimpleWeatherReport.predictWeather(-6, "Deutschland");

		assertEquals(expected, actual);

	}

}
