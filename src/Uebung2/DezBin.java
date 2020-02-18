package Uebung2;
import java.util.Scanner;

public class DezBin {

	public static void main(String[] args) {
		int d;
		String b = null;
		String bin = null;

		Scanner Eingabewert = new Scanner(System.in);

		System.out.println("Umzurechnende Dezimalzahl: ");
		d = Eingabewert.nextInt();

		Eingabewert.close();

		while (d != 0) {
			if (d % 2 == 0) {
				d = d / 2;
				if (b == null) {
					b = "0";
				} else {
					b = b + "0";
				}
			} else {
				d = d / 2;
				if (b == null) {
					b = "1";
				} else {
					b = b + "1";
				}
			}
		}
		for (int j = b.length() - 1; j >= 0; j--) {
			if (bin == null)
				bin = b.substring(j, j + 1);
			else
				bin += b.charAt(j);
		}
		System.out.println("Binaerzahl: " + bin);
	}
}
