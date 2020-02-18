package Uebung2;
import java.util.Scanner;

public class Aufgabe4b {

	public static void main(String[] args) {
		int d = 0, h = 0;
		String b = null;

		Scanner Eingabewert = new Scanner(System.in);

		System.out.println("Umzurechnende Binärzahl: ");
		b = Eingabewert.nextLine();
		while (b.length() > 0) {
			if (b.endsWith("1")) {
				d += Math.pow(2, h);
			}
			b = b.substring(0, (b.length() - 1));
			h = h + 1;
		}
		System.out.println("Dezimalzahl: " + d);
	}
}
