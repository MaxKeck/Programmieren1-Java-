package Lernnachweis2;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MonsterPositioningTest {

	@Test
	void testplaceMonster() {
		MonsterFeld[][] expectedField = { { MonsterFeld.BLOCKIERT, MonsterFeld.BLOCKIERT, MonsterFeld.BLOCKIERT },
				{ MonsterFeld.BLOCKIERT, MonsterFeld.MONSTER, MonsterFeld.BLOCKIERT },
				{ MonsterFeld.BLOCKIERT, MonsterFeld.BLOCKIERT, MonsterFeld.BLOCKIERT } };
		MonsterFeld[][] actualField = MonsterPositioning.initializeField(3, 3);
		actualField = MonsterPositioning.placeMonster(actualField, 1, 1);
		assertArrayEquals(expectedField, actualField);
	}

	@Test
	void testcountEmptyPositions() {
		MonsterFeld[][] field = MonsterPositioning.initializeField(5, 5);
		field = MonsterPositioning.placeMonster(field, 0, 0);

		assertEquals(15, MonsterPositioning.CountEmptyPositions(field, 0));
	}

	@Test
	void getNumberOfPossiblePositionsTest() {
		assertEquals(0, MonsterPositioning.getNumberOfPossiblePositions(0, 0, 1));
		assertEquals(1, MonsterPositioning.getNumberOfPossiblePositions(1, 1, 1));
		assertEquals(0, MonsterPositioning.getNumberOfPossiblePositions(3, 3, 3));
		assertEquals(256, MonsterPositioning.getNumberOfPossiblePositions(6, 4, 3));
		assertEquals(4, MonsterPositioning.getNumberOfPossiblePositions(2, 2, 1));
		assertEquals(100, MonsterPositioning.getNumberOfPossiblePositions(7, 3, 3));
		assertEquals(0, MonsterPositioning.getNumberOfPossiblePositions(1, 4, 4));
	}

}
