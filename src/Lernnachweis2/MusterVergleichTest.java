package Lernnachweis2;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MusterVergleichTest {

	@Test
	void MatchTrueTest() {
		assertTrue(MusterVergleich.isMatch("Mi1U?2U?G", "Mi1UE2UEG"));
	}

	@Test
	void MatchFalseTest() {
		assertFalse(MusterVergleich.isMatch("Mi1U?2U?G", "Mi2UE2UEG"));
	}

	@Test
	void SuperMatchTrueTest() {
		assertTrue(MusterVergleich.isSuperMatch("*6*7*", "61234773"));
	}

	@Test
	void SuperMatchFalseTest() {
		assertFalse(MusterVergleich.isSuperMatch("*6*7*", "3456"));
	}

}
