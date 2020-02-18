package Uebung5;
import java.util.Random;

public class LotteryTicket {

	public static void main(String[] args) {
		// int a, b, c;
		int[] lottonumbers = { 1, 2, 3 };
		// boolean ab = false, bb = false, cb = false;
		String[] Lottoschein = new String[10];
		// Scanner Eingabewert = new Scanner(System.in);

		/*
		 * do { System.out.println("erste Zahl: "); a = Eingabewert.nextInt(); if (a > 0
		 * && a < 31) { ab = true; } else { System.out.println("Eingabefehler"); } }
		 * while (ab == false); do { System.out.println("erste Zahl: "); b =
		 * Eingabewert.nextInt(); if (b > 0 && b < 31 && b != a) { bb = true; } else {
		 * System.out.println("Eingabefehler"); } } while (bb == false); do {
		 * System.out.println("dritte Zahl: "); c = Eingabewert.nextInt(); if (c > 0 &&
		 * c < 31 && c != a && c != b) { cb = true; } else {
		 * System.out.println("Eingabefehler"); } } while (cb == false);
		 * 
		 * lottonumbers[0] = a; lottonumbers[1] = b; lottonumbers[2] = c;
		 * Eingabewert.close();
		 */

		lottonumbers = randomLottoNumbers();
		System.out.println(lottonumbers[0] + "|" + lottonumbers[1] + "|" + lottonumbers[2]);

		Lottoschein = createLotteryTicket(lottonumbers);
		for (int i = 0; i < 10; i++) {
			System.out.println(Lottoschein[i]);
		}

	}

	public static String[] createLotteryTicket(int[] lottonumbers) {
		String[] Lottoschein = { "|_||_||_|", "|_||_||_|", "|_||_||_|", "|_||_||_|", "|_||_||_|", "|_||_||_|",
				"|_||_||_|", "|_||_||_|", "|_||_||_|", "|_||_||_|" };

		if (!checkValidLottoNumber(lottonumbers)) {
			return null;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				if (numberPartOfLottoNumbers(3 * i + j + 1, lottonumbers)) {
					switch (j) {
					case 0:
						Lottoschein[i] = "|X||_||_|";
						if (numberPartOfLottoNumbers(3 * i + j + 2, lottonumbers)) {
							Lottoschein[i] = "|X||X||_|";
							if (numberPartOfLottoNumbers(3 * i + j + 3, lottonumbers)) {
								Lottoschein[i] = "|X||X||X|";
								j += 2;
							} else {
								j++;
							}
						} else {
							if (numberPartOfLottoNumbers(3 * i + j + 3, lottonumbers)) {
								Lottoschein[i] = "|X||_||X|";
								j += 2;
							}
						}
						break;
					case 1:
						Lottoschein[i] = "|_||X||_|";
						if (numberPartOfLottoNumbers(3 * i + j + 2, lottonumbers)) {
							Lottoschein[i] = "|_||X||X|";
							j++;
						}
						break;
					case 2:
						Lottoschein[i] = "|_||_||X|";
						break;
					}
				}
			}
		}

		return Lottoschein;

	}

	public static boolean checkValidLottoNumber(int[] lottonumbers) {
		if (lottonumbers[0] == lottonumbers[1] || lottonumbers[1] == lottonumbers[2]
				|| lottonumbers[0] == lottonumbers[2]) {
			return false;
		}
		for (int i = 0; i < 3; i++) {
			if (lottonumbers[i] > 30 || lottonumbers[i] <= 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean numberPartOfLottoNumbers(int number, int[] lottonumbers) {
		if (number == lottonumbers[0] || number == lottonumbers[1] || number == lottonumbers[2]) {
			return true;
		}
		return false;

	}

	public static int[] randomLottoNumbers() {
		int[] lottonumbers = new int[3];
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			int randomInt = random.nextInt(30);
			if (i == 1) {
				while (randomInt == lottonumbers[i - 1] - 1) {
					randomInt = random.nextInt(30);
				}
			}
			if (i == 2) {
				while (randomInt == lottonumbers[i - 1] - 1 || randomInt == lottonumbers[i - 2] - 1) {
					randomInt = random.nextInt(30);
				}
			}
			lottonumbers[i] = randomInt + 1;
		}

		return lottonumbers;

	}
}
