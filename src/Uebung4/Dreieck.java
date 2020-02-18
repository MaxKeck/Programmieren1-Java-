package Uebung4;
import java.util.Scanner;

public class Dreieck {

	public static void main(String[] args) {
		Scanner Eingabewert = new Scanner(System.in);
		int a, b, c;
		String Art;

		System.out.println("erste Seitenlänge: ");
		a = Eingabewert.nextInt();
		System.out.println("zweite Seitenlänge: ");
		b = Eingabewert.nextInt();
		System.out.println("dritte Seitenlänge: ");
		c = Eingabewert.nextInt();

		Art = Dreiecksbestimmung(a, b, c);

		System.out.println(Art);

		Eingabewert.close();

	}

	public static String Dreiecksbestimmung(int a, int b, int c) {
		String Art = "";

		if (a == b && b == c) {
			Art = "gleichseitiges Dreieck";
		} else {
			if (a == b ^ b == c) {
				Art = "gleichschenkliges Dreieck";
			} else {
				if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
					Art = "rechtwinkliges Dreieck";
				} else {
					Art = "normales Dreieck";
				}
			}
		}
		return Art;
	}

}
