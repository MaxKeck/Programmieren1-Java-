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
	void DreheNachS�denTest() {
		assertEquals("Ich habe mich nach S�den gedreht.", TextAdventure.getResponsesForTextCommand("drehe nach S�den"));
	}

	@Test
	void GeheVorw�rtsTest() {
		assertEquals("Ich bin vorw�rts gelaufen.", TextAdventure.getResponsesForTextCommand("gehe vorw�rts"));
	}

	@Test
	void StatusTest() {
		assertEquals("Ich bin bei (x,y) und schaue nach nicht definiert.",
				TextAdventure.getResponsesForTextCommand("status"));
	}

	@Test
	void �ffneBTest() {
		assertEquals("Ich habe in Das Goldst�cke gefunden.", TextAdventure.getResponsesForTextCommand("�ffne Das"));
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
		assertEquals("Bis zum n�chsten Mal.", TextAdventure.getResponsesForTextCommand("ende"));
	}

	@Test
	void FalscheEingabeUndEndeTest() {
		String[] Expected = { "Kommando nicht verstanden.", "Bis zum n�chsten Mal." };
		assertArrayEquals(Expected, TextAdventure.getResponsesForTextCommands("bfdshgfds und ende"));
	}

	@Test
	void SchaueNachUndStatusTest() {
		String[] Expected = { "Ich schaue nach Westen.", "Ich bin bei (x,y) und schaue nach nicht definiert." };
		assertArrayEquals(Expected, TextAdventure.getResponsesForTextCommands("schaue nach Westen und status"));
	}

}
