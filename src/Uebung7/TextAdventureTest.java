package Uebung7;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TextAdventureTest {

	@Test
	void SchauNachNordenTest() {
		assertEquals("Ich schaue nach Norden.", TextAdventure.getResponsesForTextCommand("schaue nach Norden"));
	}

	@Test
	void DreheNachSüdenTest() {
		assertEquals("Ich habe mich nach Süden gedreht.", TextAdventure.getResponsesForTextCommand("drehe nach Süden"));
	}

	@Test
	void GeheVorwärtsTest() {
		assertEquals("Ich bin vorwärts gelaufen.", TextAdventure.getResponsesForTextCommand("gehe vorwärts"));
	}

	@Test
	void StatusTest() {
		assertEquals("Ich bin bei (x,y) und schaue nach nicht definiert.",
				TextAdventure.getResponsesForTextCommand("status"));
	}

	@Test
	void ÖffneBTest() {
		assertEquals("Ich habe in Das Goldstücke gefunden.", TextAdventure.getResponsesForTextCommand("öffne Das"));
	}

	@Test
	void BenutzeCTest() {
		assertEquals("Etwas ist passiert.", TextAdventure.getResponsesForTextCommand("benutze Das"));
	}

	@Test
	void FalschesKommandoTest() {
		assertEquals("Kommando nicht verstanden.", TextAdventure.getResponsesForTextCommand("sinnloses Kommando"));
	}

	@Test
	void EndeTest() {
		assertEquals("Bis zum nächsten Mal.", TextAdventure.getResponsesForTextCommand("ende"));
	}

	@Test
	void FalscheEingabeUndEndeTest() {
		String[] Expected = { "Kommando nicht verstanden.", "Bis zum nächsten Mal." };
		assertArrayEquals(Expected, TextAdventure.getResponsesForTextCommands("bfdshgfds und ende"));
	}

	@Test
	void SchaueNachUndStatusTest() {
		String[] Expected = { "Ich schaue nach Westen.", "Ich bin bei (x,y) und schaue nach nicht definiert." };
		assertArrayEquals(Expected, TextAdventure.getResponsesForTextCommands("schaue nach Westen und status"));
	}

}
