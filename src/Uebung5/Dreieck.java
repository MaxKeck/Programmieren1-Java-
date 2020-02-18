package Uebung5;
import java.util.Scanner;

public class Dreieck {

	public static void main(String[] args) {
		Scanner Eingabewert = new Scanner(System.in);
		int d1, d2, d3;
		String Art;

		System.out.println("erste Seitenlänge: ");
		d1 = Eingabewert.nextInt();
		System.out.println("zweite Seitenlänge: ");
		d2 = Eingabewert.nextInt();
		System.out.println("dritte Seitenlänge: ");
		d3 = Eingabewert.nextInt();

		Eingabewert.close();

		Art = Dreiecksbestimmung(d1, d2, d3);

		System.out.println(Art);

	}

	public static String Dreiecksbestimmung(int d1, int d2, int d3) {
		String Art = "";

		if (pruefeobDreieck(d1, d2, d3)) {
			if (pruefeobDreieckgleichseitig(d1, d2, d3)) {
				Art = "gleichseitiges Dreieck";
			} else {
				if (pruefeobDreieckgleichschenklig(d1, d2, d3)) {
					Art = "gleichschenkliges Dreieck";
				} else {
					if (pruefeobDreieckrechtwinklig(d1, d2, d3)) {
						Art = "rechtwinkliges Dreieck";
					} else {
						Art = "normales Dreieck";
					}
				}
			}
		} else {
			Art = "kein Dreieck";
		}
		return Art;
	}

	public static boolean pruefeobDreieck(int d1, int d2, int d3) {
		if ((d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > d1)) {
			return true;
		}
		return false;
	}

	public static boolean pruefeobDreieckgleichschenklig(int d1, int d2, int d3) {
		if (d1 == d2 ^ d2 == d3) {
			return true;
		}
		return false;
	}

	public static boolean pruefeobDreieckgleichseitig(int d1, int d2, int d3) {
		if (d1 == d2 && d2 == d3) {
			return true;
		}
		return false;
	}

	public static boolean pruefeobDreieckrechtwinklig(int d1, int d2, int d3) {
		if (d1 * d1 + d2 * d2 == d3 * d3 || d1 * d1 + d3 * d3 == d2 * d2 || d3 * d3 + d2 * d2 == d1 * d1) {
			return true;
		}
		return false;
	}

}
