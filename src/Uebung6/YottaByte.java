package Uebung6;

public class YottaByte {

	public static void main(String[] args) {
		String Bytes = "0";

		String output = String2Yotta(Bytes);

		System.out.println(Bytes);
		System.out.println(output);
	}

	public static String String2Yotta(String input) {
		String output = input;

		try {
			for (int i = 0; i < input.length(); i++) {
				int j = Integer.parseInt(String.valueOf(input.charAt(i)));
			}
			while (output.charAt(0) == '0' && output.length() > 1) {
				output = output.substring(1);
			}

			int laenge = output.length();

			int h = laenge % 3;

			if (h == 0) {
				h = 3;
			}

			if (laenge > 0 && laenge < 28) {
				if (laenge > 6) {
					output = output.substring(0, h) + "." + output.substring(h, h + 3);
				} else {
					if (laenge > 3) {
						output = output.substring(0, h) + "." + output.substring(h, laenge);
					}
				}

				switch (laenge) {
				case 1:
				case 2:
				case 3:
					output = output + "B";
					break;
				case 4:
				case 5:
				case 6:
					output = output + "KB";
					break;
				case 7:
				case 8:
				case 9:
					output = output + "MB";
					break;
				case 10:
				case 11:
				case 12:
					output = output + "GB";
					break;
				case 13:
				case 14:
				case 15:
					output = output + "TB";
					break;
				case 16:
				case 17:
				case 18:
					output = output + "PB";
					break;
				case 19:
				case 20:
				case 21:
					output = output + "EB";
					break;
				case 22:
				case 23:
				case 24:
					output = output + "ZB";
					break;
				case 25:
				case 26:
				case 27:
					output = output + "YB";
					break;
				}
			} else {
				return "Ungültige Eingabe";
			}

			return output;
		} catch (Exception e) {
			return "Ungültige Eingabe";
		}
	}

}
