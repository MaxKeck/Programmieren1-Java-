package Uebung4;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String Palindrom;
		int z = 0;

		Scanner Eingabewert = new Scanner(System.in);

		System.out.println("Palindromlänge: ");
		z = Eingabewert.nextInt();

		Palindrom = createPalindrom(z);

		System.out.println(Palindrom);

		Eingabewert.close();
	}

	public static String createPalindrom(int palindromLength) {
		String Palindrom = "";
		int l = 0, h = 1;

		if (palindromLength % 2 == 0) {
			l = palindromLength / 2;
		} else {
			l = palindromLength / 2 + 1;
			h = 2;
		}

		for (int i = 0; i < l; i++) {
			Palindrom = Palindrom + (char) (65 + Math.random() * (26));
		}

		for (int i = l - h; i >= 0; i--) {
			Palindrom = Palindrom + Palindrom.charAt(i);
		}

		return Palindrom;
	}

}
