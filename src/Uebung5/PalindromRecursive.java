package Uebung5;
import java.util.concurrent.ThreadLocalRandom;

public class PalindromRecursive {

	public static void main(String[] args) {
		String Palindrom;
		int z = 0;

		// Scanner Eingabewert = new Scanner(System.in);

		// System.out.println("Palindromlänge: ");
		z = 10;

		Palindrom = createPalindrom(z);

		System.out.println(Palindrom);

		// Eingabewert.close();
	}

	public static String createPalindrom(int palindromLength) {
		String Palindrom = "";
		int l = 0, h = 1;

		if (palindromLength > 0) {
			if (palindromLength % 2 == 0) {
				l = palindromLength / 2;
			} else {
				l = palindromLength / 2 + 1;
				h = 2;
			}

			for (int i = 0; i < l; i++) {
				int random = ThreadLocalRandom.current().nextInt(1, 4);
				switch (random) {
				case 1:
					Palindrom = Palindrom + (char) (65 + ThreadLocalRandom.current().nextInt(0, 26));
					break;
				case 2:
					Palindrom = Palindrom + (char) (48 + ThreadLocalRandom.current().nextInt(0, 10));
					break;
				case 3:
					Palindrom = Palindrom + (char) (97 + ThreadLocalRandom.current().nextInt(0, 26));
					break;
				}
			}

			for (int i = l - h; i >= 0; i--) {
				Palindrom = Palindrom + Palindrom.charAt(i);
			}
		} else {
			Palindrom = "Error";
		}

		return Palindrom;
	}

}
