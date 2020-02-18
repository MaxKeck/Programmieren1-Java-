package Uebung2;
import java.util.Scanner;

public class Aufgabe8 {

	public static void main(String[] args) {
		int a, b, h, S = 0, s = 0;

		Scanner Eingabewert = new Scanner(System.in);

		System.out.println("erstes Jahr : ");
		a = Eingabewert.nextInt();

		System.out.println("zweites Jahr : ");
		b = Eingabewert.nextInt();

		if (a >= b) {
			if (b % 4 == 0)
				b = b + 1;
			h = b + 4 - (b % 4);
			while (h < a) {
				s = s + 1;
				S = S + h;
				h += 4;
			}
			System.out.println("Anzahl der Schaltjahre: " + s);
			System.out.println("Summe der Schaltjahre: " + S);
		} else {
			if (a % 4 == 0)
				a = a + 1;
			h = a + 4 - (a % 4);
			while (h < b) {
				s = s + 1;
				S = S + h;
				h += 4;
			}
			System.out.println("Anzahl der Schaltjahre: " + s);
			System.out.println("Summe der Schaltjahre: " + S);
		}

	}

}
