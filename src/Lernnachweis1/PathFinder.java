package Lernnachweis1;
import java.util.Random;

enum Field {
	FREE, WALL, LION, CAKE, PATH
}

public class PathFinder {

	public static void main(String[] args) {
		Field[][] playground = { //
				{ Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE,
						Field.FREE }, //
				{ Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE,
						Field.FREE }, //
				{ Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE,
						Field.FREE }, //
				{ Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE,
						Field.FREE }, //
				{ Field.FREE, Field.FREE, Field.LION, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE,
						Field.FREE }, //
				{ Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE,
						Field.FREE }, //
				{ Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE,
						Field.FREE }, //
				{ Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.WALL, Field.FREE, Field.WALL,
						Field.WALL }, //
				{ Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE,
						Field.FREE }, //
				{ Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.FREE, Field.CAKE,
						Field.FREE } //
		};//
		Field[][] Path = new Field[playground.length][playground[0].length];

		Path = findPathOnMapWithLions(playground);

		for (int i = 0; i < Path.length; i++) {
			for (int j = 0; j < Path[1].length; j++) {
				System.out.print(Path[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static Field[][] findPathOnMapWithLions(Field[][] playground) {

		int i = 0, j = 0;
		int Cake[] = locateCake(playground);
		int Lion[] = locateLion(playground);
		int Luecke[] = locateLuecke(playground);

		for (int l = Lion[0] - 2; l < Lion[0] + 3; l++) {
			for (int k = Lion[1] - 2; k < Lion[1] + 3; k++) {
				if (playground[l][k] != Field.LION) {
					playground[l][k] = Field.WALL;
				}
			}
		}

		playground[0][0] = Field.PATH;
		while (playground[i][j] != Field.CAKE) {
			playground[i][j] = Field.PATH;

			Random random = new Random();
			int randomInt = random.nextInt(4);
			switch (randomInt) {
			case 0:
				if (i < playground.length - 1) {
					if (playground[i + 1][j] != Field.WALL) {
						i++;
					}
				}
				break;
			case 1:
				if (i > 0) {
					if (playground[i - 1][j] != Field.WALL) {
						i--;
					}
				}
				break;
			case 2:
				if (j < playground[i].length - 1) {
					if (playground[i][j + 1] != Field.WALL) {
						j++;
					}
				}
				break;
			case 3:
				if (j > 0) {
					if (playground[i][j - 1] != Field.WALL) {
						j--;
					}
				}
				break;
			}

		}

		for (int l = Lion[0] - 2; l < Lion[0] + 3; l++) {
			for (int k = Lion[1] - 2; k < Lion[1] + 3; k++) {
				if (playground[l][k] != Field.LION && l != Luecke[0]) {
					playground[l][k] = Field.FREE;
				}
			}
		}

		return playground;
	}

	public static int state(Field[][] playground) {

		return 0;
	}

	public static int[] locateCake(Field[][] playground) {
		int[] Cake = { 0, 0 };
		for (int i = 0; i < playground.length; i++) {
			for (int j = 0; j < playground[0].length; j++) {
				if (playground[i][j] == Field.CAKE) {
					Cake[0] = i;
					Cake[1] = j;
				}
			}
		}

		return Cake;
	}

	public static int[] locateLion(Field[][] playground) {
		int[] Lion = { 0, 0 };

		for (int i = 0; i < playground.length; i++) {
			for (int j = 0; j < playground[0].length; j++) {
				if (playground[i][j] == Field.LION) {
					Lion[0] = i;
					Lion[1] = j;
				}
			}
		}
		return Lion;
	}

	public static int[] locateLuecke(Field[][] playground) {
		int[] Luecke = { 0, 0 };
		for (int i = 0; i < playground.length; i++) {
			for (int j = 0; j < playground[0].length; j++) {
				if (j > 0) {
					if (j < playground[0].length - 1) {
						if (playground[i][j] == Field.FREE
								&& (playground[i][j - 1] == Field.WALL || playground[i][j + 1] == Field.WALL)) {
							Luecke[0] = i;
							Luecke[1] = j;
						}
					} else {
						if (playground[i][j] == Field.FREE && playground[i][j - 1] == Field.WALL) {
							Luecke[0] = i;
							Luecke[1] = j;
						}
					}
				} else {
					if (playground[i][j] == Field.FREE && playground[i][j + 1] == Field.WALL) {
						Luecke[0] = i;
						Luecke[1] = j;
					}
				}
			}
		}

		return Luecke;
	}

}
