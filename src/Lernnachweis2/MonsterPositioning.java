package Lernnachweis2;

enum MonsterFeld {
	MONSTER, BLOCKIERT, FREI
}

public class MonsterPositioning {

	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		int Monsters = 2;

		System.out.println(getNumberOfPossiblePositions(x, y, Monsters));
	}

	public static int getNumberOfPossiblePositions(int x, int y, int numberOfMonsters) {
		if (x < numberOfMonsters || y < numberOfMonsters || numberOfMonsters == 0) {
			return 0;
		}

		MonsterFeld[][] field = initializeField(x, y);
		return TryPositions(field, numberOfMonsters, 0);

	}

	public static MonsterFeld[][] initializeField(int x, int y) {
		MonsterFeld[][] field = new MonsterFeld[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				field[i][j] = MonsterFeld.FREI;
			}
		}

		return field;
	}

	public static MonsterFeld[][] CopyField(MonsterFeld[][] fieldToCopy) {
		MonsterFeld[][] CopiedField = new MonsterFeld[fieldToCopy.length][fieldToCopy[0].length];

		for (int i = 0; i < fieldToCopy.length; i++) {
			CopiedField[i] = fieldToCopy[i].clone();
		}

		return CopiedField;
	}

	public static int TryPositions(MonsterFeld[][] field, int numberOfMonsters, int RowLastMonster)
			throws IllegalArgumentException {
		int possiblePositions = 0;

		if (numberOfMonsters == 1) {
			return CountEmptyPositions(field, RowLastMonster);
		}

		MonsterFeld[][] originalfield = CopyField(field);

		for (int i = RowLastMonster; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (canPlaceMonster(field, i, j)) {
					field = placeMonster(field, i, j);
					possiblePositions += TryPositions(field, numberOfMonsters - 1, i);
					field = CopyField(originalfield);
				}

			}
		}
		return possiblePositions;
	}

	public static boolean canPlaceMonster(MonsterFeld[][] field, int x, int y) {
		if (field[x][y] != MonsterFeld.FREI) {
			return false;
		}
		return true;
	}

	public static MonsterFeld[][] placeMonster(MonsterFeld[][] field, int x, int y) {
		BlockRowandColumn(field, x, y);
		try {
			field[x - 1][y - 1] = MonsterFeld.BLOCKIERT;
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		try {
			field[x - 1][y + 1] = MonsterFeld.BLOCKIERT;
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		try {
			field[x + 1][y - 1] = MonsterFeld.BLOCKIERT;
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		try {
			field[x + 1][y + 1] = MonsterFeld.BLOCKIERT;
		} catch (ArrayIndexOutOfBoundsException e) {
		}

		field[x][y] = MonsterFeld.MONSTER;

		return field;
	}

	public static MonsterFeld[][] BlockRowandColumn(MonsterFeld[][] field, int x, int y) {

		for (int i = 0; i < field[0].length; i++) {
			try {
				field[x][i] = MonsterFeld.BLOCKIERT;
			} catch (ArrayIndexOutOfBoundsException e) {
			}
		}
		for (int i = 0; i < field.length; i++) {
			try {
				field[i][y] = MonsterFeld.BLOCKIERT;
			} catch (ArrayIndexOutOfBoundsException e) {
			}
		}

		return field;
	}

	public static int CountEmptyPositions(MonsterFeld[][] field, int StartRow) {
		int emptyPositions = 0;
		for (int i = StartRow; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				if (field[i][j] == MonsterFeld.FREI) {
					emptyPositions++;
				}
			}
		}
		return emptyPositions;
	}

}
