package Lernnachweis1;
public class Aufgabe4 {

	public static void main(String[] args) {
		int[] operand1 = { 7, 2 };
		int[] operand2 = { 1, 2, 3 };
		int[] Ergebnis = new int[10];

		Ergebnis = oktaleAddition(operand1, operand2);

		System.out.print(" ");
		for (int i = 0; i < operand1.length; i++) {
			// Schleife, die führende 0en wegnimmt
			System.out.print(operand1[i]);
		}
		System.out.print("\n+");

		for (int i = 0; i < operand2.length; i++) {
			// Schleife, die führende 0en wegnimmt
			System.out.print(operand2[i]);
		}
		System.out.print("\n");

		for (int i = 0; i < Ergebnis.length; i++) {
			// Schleife, die führende 0en wegnimmt)
			System.out.print(Ergebnis[i]);
		}

	}

	public static int[] oktaleAddition(int[] operand1, int[] operand2) {
		int laenge = 0, uebertrag = 0;
		if (operand1.length > operand2.length) {
			laenge = operand1.length - 1;
			int[] tmp = new int[laenge + 1];
			System.arraycopy(operand2, 0, tmp, 1, operand2.length);
			operand2 = tmp;
		} else {
			laenge = operand2.length - 1;
			int[] tmp = new int[laenge + 1];
			System.arraycopy(operand1, 0, tmp, 1, operand1.length);
			operand1 = tmp;
		}
		int[] Ergebnis = new int[laenge + 1];

		if (operand1.length == operand2.length) {
			for (int i = laenge; i >= 0; i--) {
				if (operand1[i] + operand2[i] + uebertrag > 7) {
					Ergebnis[i] = operand1[i] + operand2[i] + uebertrag - 8;
					uebertrag = 1;

				} else {
					Ergebnis[i] = operand1[i] + operand2[i] + uebertrag;
					uebertrag = 0;
				}
			}
		}
		if (uebertrag == 1) {
			int[] tmp = new int[Ergebnis.length + 1];
			System.arraycopy(Ergebnis, 0, tmp, 0, Ergebnis.length);
			Ergebnis = tmp;
			for (int i = Ergebnis.length - 1; i > 0; i--) {
				Ergebnis[i] = Ergebnis[i - 1];
			}
			laenge++;
			Ergebnis[0] = 1;
		}

		int i = Ergebnis.length - 1;
		while (Ergebnis[i] == 0 && i >= laenge + 1) {
			i--;
		}
		int f = i;
		int[] Ergebnisshort = new int[i + 1];
		while (i >= 0) {
			Ergebnisshort[f] = Ergebnis[i];
			i--;
			f--;
		}

		return Ergebnisshort;
	}

	public static String oktalZuRoemisch(int[] operand) {
		return null;

	}

}
