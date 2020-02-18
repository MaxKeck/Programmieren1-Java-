package Uebung5;
import java.util.concurrent.ThreadLocalRandom;

public class BonusGame {

	public static void main(String[] args) {

		int[][] data = Randomdata();

		System.out.println(findBestBonus(data));

	}

	public static int[][] Randomdata() {
		int min = 1;
		int max = 5;
		int randomlength = 10;
		int randomwidth = 1;
		int[][] data = new int[randomlength][randomwidth];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = ThreadLocalRandom.current().nextInt(min, max);
			}
		}

		return data;
	}

	public static int findBestBonus(int[][] data) {
		int max = 1;
		int save;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j < data[i].length - 3) {
					save = data[i][j] * data[i][j + 1] * data[i][j + 2] * data[i][j + 3];
					if (save > max) {
						max = save;
					}
					if (i < data.length - 3) {
						save = data[i][j] * data[i + 1][j + 1] * data[i + 2][j + 2] * data[i + 3][j + 3];
						if (save > max) {
							max = save;
						}
					}
					if (i >= 3) {
						save = data[i][j] * data[i - 1][j + 1] * data[i - 2][j + 2] * data[i - 3][j + 3];
						if (save > max) {
							max = save;
						}
					}
				}
				if (i < data.length - 3) {
					save = data[i][j] * data[i + 1][j] * data[i + 2][j] * data[i + 3][j];
					if (save > max) {
						max = save;
					}
				}
			}

		}

		return max;
	}
}

/*
 * public static int findBestBonus(int[][] data) {
 * 
 * int max = 1;
 * 
 * for (int i = 0; i < data.length; i++) { for (int j = 0; j < data.length; j++)
 * { if (j < data[i].length - 3) { if (data[i][j] * data[i][j + 1] * data[i][j +
 * 2] * data[i][j + 3] > max) { max = data[i][j] * data[i][j + 1] * data[i][j +
 * 2] * data[i][j + 3]; } if (i < data.length - 3) { if (data[i][j] * data[i +
 * 1][j + 1] * data[i + 2][j + 2] * data[i + 3][j + 3] > max) { max = data[i][j]
 * * data[i + 1][j + 1] * data[i + 2][j + 2] * data[i + 3][j + 3]; } } if (i >=
 * 3) { if (data[i][j] * data[i - 1][j + 1] * data[i - 2][j + 2] * data[i - 3][j
 * + 3] > max) { max = data[i][j] * data[i - 1][j + 1] * data[i - 2][j + 2] *
 * data[i - 3][j + 3]; } } } if (i < data.length - 3) { if (data[i][j] * data[i
 * + 1][j] * data[i + 2][j] * data[i + 3][j] > max) { max = data[i][j] * data[i
 * + 1][j] * data[i + 2][j] * data[i + 3][j]; } }
 * 
 * } }
 * 
 * return max;
 * 
 * }
 */
