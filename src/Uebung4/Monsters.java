package Uebung4;

enum Zustaende {
	VERFUEG, MONSTER
}

public class Monsters {

	public static void main(String[] args) {
		boolean valide = true;
		Zustaende[][] spielfeld = { //
				{ Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG }, //
				{ Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG }, //
				{ Zustaende.VERFUEG, Zustaende.VERFUEG, Zustaende.VERFUEG }, //
				{ Zustaende.MONSTER, Zustaende.MONSTER, Zustaende.VERFUEG } };

		for (int i = 0; i < spielfeld.length; i++) {
			if (spielfeld.length != spielfeld[i].length) {
				valide = false;
			}
		}

		if (!valide) {
			System.out.println("Spielfeld muss quadratisch sein!");
		} else {
			if (pruefeSpielfeld(spielfeld)) {
				System.out.println("Spielfeld valide");
			} else {
				System.out.println("Spielfeld NICHT valide");
			}
		}
	}

	public static boolean pruefeSpielfeld(Zustaende[][] spielfeld) {

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				if (spielfeld[i][j] == Zustaende.MONSTER) {
					if (j != spielfeld[i].length - 1) {
						for (int k = i + 1, l = j + 1; k < spielfeld.length && l < spielfeld[i].length; k++, l++) {
							if (spielfeld[k][l] == Zustaende.MONSTER) {
								return false;
							}
						}
						for (int k = i - 1, l = j + 1; k >= 0 && l < spielfeld[i].length; k--, l++) {
							if (spielfeld[k][l] == Zustaende.MONSTER) {
								return false;
							}
						}
					}

				}

			}
		}

		return true;
	}
}