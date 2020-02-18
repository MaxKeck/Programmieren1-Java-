package Lernnachweis1;
import java.util.Arrays;

enum Move {
	WALK_FORWARDS, WALK_BACKWARDS, TURN_LEFT, TURN_RIGHT, TURN_180
}

enum Richtung {
	UP, DOWN, RIGHT, LEFT
}

public class Aufgabe3 {

	public static void main(String[] args) {
		int playerStartX = 0, playerStartY = 0;
		Move[] playerMoves = { //
				Move.TURN_RIGHT, //
				Move.WALK_FORWARDS, //
				Move.WALK_FORWARDS, //
				Move.TURN_LEFT, //
				Move.WALK_BACKWARDS, //
				Move.TURN_180, //
				Move.WALK_FORWARDS, //
				Move.WALK_FORWARDS, Move.WALK_FORWARDS, Move.WALK_FORWARDS, Move.TURN_LEFT, Move.WALK_FORWARDS,
				Move.WALK_FORWARDS, Move.WALK_FORWARDS, Move.WALK_FORWARDS, Move.WALK_FORWARDS, Move.WALK_FORWARDS,
				Move.WALK_FORWARDS

		};
		int[][] fieldXY = { //
				{ 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0 } //
		};
		int spielfeld[][] = { //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		executePlayerNavigation(spielfeld, playerStartX, playerStartY, playerMoves);

		for (int h = 0; h < spielfeld.length; h++)
			System.out.println(Arrays.toString(spielfeld[h]));

	}

	public static int[][] executePlayerNavigation(int[][] fieldXY, int playerStartX, int playerStartY,
			Move[] playermoves) {
		int movecount = 0, j = playerStartX, k = playerStartY;
		Richtung o = Richtung.UP;

		fieldXY[j][k] = 2;

		while (movecount < playermoves.length) {
			switch (playermoves[movecount]) {
			case WALK_FORWARDS:
				switch (o) {
				case UP:
					if (j - 1 < fieldXY.length && k < fieldXY.length && k >= 0 && j - 1 >= 0) {
						if (fieldXY[j - 1][k] != 1) {
							fieldXY[j - 1][k] = 2;
							j--;
						}
					}

					break;
				case DOWN:
					if (j + 1 < fieldXY.length && k < fieldXY.length && k >= 0 && j + 1 >= 0) {
						if (fieldXY[j + 1][k] != 1) {
							fieldXY[j + 1][k] = 2;
							j++;
						}
					}
					break;
				case LEFT:
					if (j < fieldXY.length && k - 1 < fieldXY.length && k - 1 >= 0 && j >= 0) {
						if (fieldXY[j][k - 1] != 1) {
							fieldXY[j][k - 1] = 2;
							k--;
						}
					}
					break;
				case RIGHT:
					if (j < fieldXY.length && k + 1 < fieldXY.length && k + 1 >= 0 && j >= 0) {
						if (fieldXY[j][k + 1] != 1) {
							fieldXY[j][k + 1] = 2;
							k++;
						}
					}
					break;
				}
				break;
			case WALK_BACKWARDS:
				switch (o) {
				case UP:
					if (j + 1 < fieldXY.length && k < fieldXY.length && k >= 0 && j + 1 >= 0) {
						if (fieldXY[j + 1][k] != 1) {
							fieldXY[j + 1][k] = 2;
							j++;
						}
					}
					break;
				case DOWN:
					if (j - 1 < fieldXY.length && k < fieldXY.length && k >= 0 && j - 1 >= 0) {
						if (fieldXY[j - 1][k] != 1) {
							fieldXY[j - 1][k] = 2;
							j--;
						}
					}
					break;
				case LEFT:
					if (j < fieldXY.length && k + 1 < fieldXY.length && k + 1 >= 0 && j >= 0) {
						if (fieldXY[j][k + 1] != 1) {
							fieldXY[j][k + 1] = 2;
							k++;
						}
					}
					break;
				case RIGHT:
					if (j < fieldXY.length && k - 1 < fieldXY.length && k - 1 >= 0 && j >= 0) {
						if (fieldXY[j][k - 1] != 1) {
							fieldXY[j][k - 1] = 2;
							k--;
						}
					}
					break;
				}
				break;
			case TURN_180:
				switch (o) {
				case DOWN:
					o = Richtung.UP;
					break;
				case LEFT:
					o = Richtung.RIGHT;
					break;
				case RIGHT:
					o = Richtung.LEFT;
					break;
				case UP:
					o = Richtung.DOWN;
					break;
				}
				break;
			case TURN_LEFT:
				switch (o) {
				case DOWN:
					o = Richtung.RIGHT;
					break;
				case LEFT:
					o = Richtung.DOWN;
					break;
				case RIGHT:
					o = Richtung.UP;
					break;
				case UP:
					o = Richtung.LEFT;
					break;
				}
				break;
			case TURN_RIGHT:
				switch (o) {
				case DOWN:
					o = Richtung.LEFT;
					break;
				case LEFT:
					o = Richtung.UP;
					break;
				case RIGHT:
					o = Richtung.DOWN;
					break;
				case UP:
					o = Richtung.RIGHT;
					break;
				}
				break;
			}
			movecount++;
		}

		return fieldXY;
	}
}
