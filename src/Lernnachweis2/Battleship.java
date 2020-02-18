package Lernnachweis2;
import java.util.Random;
import java.util.Scanner;

enum Ship {
	UNDISCOVERED, DISCOVERED
}

public class Battleship {

	public static void main(String[] args) {
		int x = 100;
		int y = 100;
		int ships = 167;
		Ship[][] playground = new Ship[y][x];

		try {
			playground = getRandomPlayground(x, y, ships);

			System.out.println("Das Spielfeld hat die Größe " + x + "x" + y + ".");
			System.out.println("Es sind " + ships + " Schiffe auf dem Feld");

			printPlayground(playground);

			PlayGame(playground);

		} catch (Exception e) {
			System.out.print("Die Schiffe konnten nicht plaziert werden!");
		}

	}

	public static void PlayGame(Ship[][] playground) {
		int a, b;
		Scanner Eingabewert = new Scanner(System.in);
		try {
			while (!isGameWon(playground)) {
				System.out.println("Zeile: ");
				a = Eingabewert.nextInt();

				System.out.println("Spalte: ");
				b = Eingabewert.nextInt();

				System.out.println(getMessage(playground, b, a));
				playground = TryHit(playground, b, a);
			}
			System.out.println("Du hast gewonnen!");
		} catch (Exception e) {
			System.out.println("ungültiger Eingabewert!");
			PlayGame(playground);
		}

		Eingabewert.close();
	}

	public static void printPlayground(Ship[][] playground) {
		System.out.print("    ");
		for (int j = 0; j < playground[0].length; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < playground.length; i++) {
			System.out.print(i + "   ");
			for (int j = 0; j < playground[i].length; j++) {
				if (playground[i][j] == null) {
					System.out.print("0 ");
				} else {
					if (playground[i][j] == Ship.UNDISCOVERED) {
						System.out.print("U ");
					} else {
						System.out.print("D ");
					}
				}

			}

			System.out.println();
		}
	}

	public static Ship[][] getRandomPlayground(int x, int y, int numberOfShips) throws Exception {
		Ship[][] playground = new Ship[y][x];
		int currentNumberOfShips = 0;
		int maximaleVersuche = 100000;
		int Versuche = 0;
		Random random = new Random();
		int rY;
		int rX;
		boolean horizontal;

		while (currentNumberOfShips < numberOfShips) {
			Versuche++;
			rY = random.nextInt(x);
			rX = random.nextInt(y);
			horizontal = random.nextBoolean();

			if (IsPlaceFree(playground, horizontal, rY, rX)) {
				placeShip(playground, horizontal, rY, rX);
				currentNumberOfShips++;
			}
			if (Versuche > maximaleVersuche) {
				// throw new Exception("Schiffe konnten nicht plaziert werden!");
			}
		}
		return playground;

	}

	public static boolean IsPlaceFree(Ship[][] playground, boolean horizontal, int x, int y) {
		if (horizontal) {
			if (x + 2 >= playground[y].length) {
				return false;
			}
			for (int i = 0; i < 3; i++) {
				if (playground[y][x + i] != null) {
					return false;
				}
			}
		} else {
			if (y + 2 >= playground.length) {
				return false;
			}
			for (int i = 0; i < 3; i++) {
				if (playground[y + i][x] != null) {
					return false;
				}
			}
		}
		return true;
	}

	public static Ship[][] placeShip(Ship[][] playground, boolean horizontal, int x, int y) {
		try {
			if (horizontal) {
				for (int i = 0; i < 3; i++) {
					playground[y][x + i] = Ship.UNDISCOVERED;
				}
			} else {
				for (int i = 0; i < 3; i++) {
					playground[y + i][x] = Ship.UNDISCOVERED;
				}
			}

			return playground;
		} catch (Exception e) {
			return playground;
		}
	}

	public static Ship[][] TryHit(Ship[][] playground, int x, int y) {

		try {
			if (playground[y][x] == Ship.UNDISCOVERED) {
				playground[y][x] = Ship.DISCOVERED;
			}
		} catch (Exception e) {

		}

		return playground;
	}

	public static String getMessage(Ship[][] playground, int x, int y) {
		if (x >= playground[0].length || x < 0 || y >= playground.length || y < 0)
			return "Ziele auf des Spielfeld.";
		if (playground[y][x] == Ship.UNDISCOVERED) {
			return "Ein Schiffssegment gefunden.";
		}
		if (playground[y][x] == Ship.DISCOVERED) {
			return "Schiffssegment wurde bereits gefunden.";
		}
		return "Nichts gefunden.";
	}

	public static boolean isGameWon(Ship[][] playground) {
		for (int i = 0; i < playground.length; i++) {
			for (int j = 0; j < playground[i].length; j++) {
				if (playground[i][j] == Ship.UNDISCOVERED) {
					return false;
				}
			}
		}
		return true;
	}
}
