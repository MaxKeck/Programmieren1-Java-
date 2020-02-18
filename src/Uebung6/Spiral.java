package Uebung6;
import java.util.Arrays;

enum Direction {
	LEFT, RIGHT, UP, DOWN
};

public class Spiral {

	public static void main(String[] args) {
		int[][] field = new int[9][9];
		int stepcount = 0;
		int x = 4;
		int y = 4;
		Direction direction = Direction.RIGHT;
		int[][] spiral = generateSpiral(field, stepcount, x, y, direction);

		for (int h = 0; h <= spiral.length - 1; h++)
			System.out.println(Arrays.toString(spiral[h]));
	}

	public static int[][] generateSpiral(int[][] field, int currentStepCount, int x, int y,
			Direction currentDirection) {

		if (x < 0 || x > field.length || y < 0 || y > field[0].length) {
			return null;
		}

		switch (currentDirection) {
		case LEFT:
			if (!(x - currentStepCount >= 0))
				return field;
			break;
		case RIGHT:
			if (!(x + currentStepCount < field.length))
				return field;
			break;
		case UP:
			if (!(y - currentStepCount >= 0))
				return field;
			break;
		case DOWN:
			if (!(y + currentStepCount < field[x].length))
				return field;
			break;
		}
		field[x][y] = currentStepCount;
		for (int i = 0; i < currentStepCount; i++) {
			switch (currentDirection) {
			case LEFT:
				x = x - 1;
				break;
			case RIGHT:
				x = x + 1;
				break;
			case UP:
				y = y - 1;
				break;
			case DOWN:
				y = y + 1;
				break;
			}
			field[x][y] = currentStepCount;
		}
		switch (currentDirection) {
		case LEFT:
			currentDirection = Direction.UP;
			break;
		case RIGHT:
			currentDirection = Direction.DOWN;
			break;
		case UP:
			currentDirection = Direction.RIGHT;
			break;
		case DOWN:
			currentDirection = Direction.LEFT;
			break;
		}
		return generateSpiral(field, currentStepCount + 1, x, y, currentDirection);

	}
}
