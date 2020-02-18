package Uebung2;
import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {

		long T = 0, H = 0, S = 0, M = 0, MS, z;
		int t = 86400000;
		int h = 3600000;
		int m = 60000;
		int s = 1000;

		Scanner Eingabewert = new Scanner(System.in);

		System.out.println("Zeit in Nanosekunden: ");
		z = Eingabewert.nextLong();
		MS = z / 1000000;
		if (MS > t) {
			T = MS / t;
			MS = MS - t * T;
		}
		if (MS > h) {
			H = MS / h;
			MS = MS - h * H;
		}
		if (MS > m) {
			M = MS / m;
			MS = MS - m * M;
		}
		if (MS > s) {
			S = MS / s;
			MS = MS - s * S;
		}
		System.out.println(T + "Tage " + H + "Stunden " + M + "Minuten " + S + "Sekunden " + MS + "Millisekunden");

	}
}
