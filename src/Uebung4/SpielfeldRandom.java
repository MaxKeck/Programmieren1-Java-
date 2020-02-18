package Uebung4;
import java.util.Random;
import java.util.Scanner;

public class SpielfeldRandom {

	static public void main(String[] args) {
		int groesse;

		Scanner Eingabewert = new Scanner(System.in);

		System.out.println("Spielfeldgröße: ");
		groesse = Eingabewert.nextInt();
		Eingabewert.close();
		boolean[] zufallWaende = zufallWaendeinZeile(groesse);

		int[][] Spielfeld = spielfeldGenerator(groesse, zufallWaende);

		for (int i = 0; i < groesse; i++) {
			for (int j = 0; j < groesse; j++) {
				System.out.print(Spielfeld[i][j]);
			}
			System.out.print("\n");
		}

	}

	static public int[][] spielfeldGenerator(int groesse, boolean zufallWaende[]) {
		int[][] Spielfeld = new int[groesse][groesse];
		Random random = new Random();
		int randomInt = random.nextInt(groesse);

		if (zufallWaende[0] == true) {
			for (int j = 0; j < groesse; j++) {
				if (j == randomInt) {
					Spielfeld[0][j] = 0;
				} else {
					Spielfeld[0][j] = 1;
				}
			}
		}

		for (int i = 1; i < groesse; i++) {
			if (zufallWaende[i] == true) {
				if (zufallWaende[i - 1] == false) {
					randomInt = random.nextInt(groesse);
				}
				for (int j = 0; j < groesse; j++) {
					if (j == randomInt) {
						Spielfeld[i][j] = 0;
					} else {
						Spielfeld[i][j] = 1;
					}
				}
			} else {
				for (int j = 0; j < groesse; j++) {
					Spielfeld[i][j] = 0;
				}
			}
		}

		return Spielfeld;
	}

	static public boolean[] zufallWaendeinZeile(int AnzahlZeilen) {
		boolean[] zufallWaende = new boolean[AnzahlZeilen];
		Random random = new Random();

		for (int i = 0; i < AnzahlZeilen; i++) {
			int randomInt = random.nextInt(4);
			if (randomInt % 4 == 0) {
				zufallWaende[i] = true;
			} else {
				zufallWaende[i] = false;
			}
		}

		return zufallWaende;
	}
}
