package Uebung3;

public class Aufgabe4 {

	public static void main(String[] args) {
		String roem = "";
		int dezi = 0;

		dezi = Roem2Dezi(roem);

		System.out.println(dezi);

	}

	public static int Roem2Dezi(String roem) {
		int i = 0;
		int dezi = 0;

		if (roem.contains("CCCC") || roem.contains("XXXX") || roem.contains("IIII") || roem.contains("DD")
				|| roem.contains("LL") || roem.contains("VV")) {
			System.out.println("Ungültige Eingabe");
			return 0;
		}

		if (roem.contains("IL") || roem.contains("IC") || roem.contains("ID") || roem.contains("IM")
				|| roem.contains("XD") || roem.contains("XM")) {
			System.out.println("Ungültige Eingabe");
			return 0;
		}

		if (roem.contains("IL") || roem.contains("IC") || roem.contains("ID") || roem.contains("IM")
				|| roem.contains("XD") || roem.contains("XM")) {
			System.out.println("Ungültige Eingabe");
			return 0;
		}

		while (roem.length() > i) {
			if (roem.charAt(i) == 'M') {
				dezi += 1000;
				i++;
			}
			if (roem.charAt(i) == 'D') {
				if (roem.charAt(i + 1) == 'M') {
					dezi += 500;
					i++;
				} else
					dezi += 500;

			}
			if (roem.charAt(i) == 'C') {
				if (roem.charAt(i + 1) == 'D') {
					dezi += 400;
					i++;
				}
				if (roem.charAt(i + 1) == 'M') {
					dezi += 900;
					i++;
				}
				if (roem.charAt(i + 1) == 'C') {
					if (roem.charAt(i + 2) == 'D') {
						dezi += 400;
						i++;
					}
					if (roem.charAt(i + 2) == 'M') {
						dezi += 900;
						i++;
					}
					if (roem.charAt(i + 2) == 'C') {
						if (roem.charAt(i + 3) == 'D') {
							dezi += 400;
							i++;
						}
						if (roem.charAt(i + 3) == 'M') {
							dezi += 900;
							i++;
						}
					}
				}
				i++;
			}

			i++;
		}
		return dezi;
	}

}
