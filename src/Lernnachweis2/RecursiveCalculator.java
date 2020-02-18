package Lernnachweis2;

public class RecursiveCalculator {

	public static void main(String[] args) {
		String input = "-4*6+-8:6+-5";

		try {
			System.out.println(calculateLeftToRight(input));
		} catch (Exception e) {
			System.out.println("fehlerhafte Eingabe");
		}

	}

	public static int calculateLeftToRight(String input) {
		int Zahl;
		String ZahlS = "";
		int i = 0;
		while (input.charAt(i) == ' ') {
			i++;
		}
		if (input.charAt(i) == '-') {
			i++;
			while (input.charAt(i) != ' ' && input.charAt(i) != '+' && input.charAt(i) != '-' && input.charAt(i) != '*'
					&& input.charAt(i) != ':' && input.charAt(i) != '%') {
				ZahlS = ZahlS + input.charAt(i);
				i++;
				if (i >= input.length()) {
					return -Integer.parseInt(ZahlS);
				}
			}
			Zahl = -Integer.parseInt(ZahlS);
		} else {
			while (input.charAt(i) != ' ' && input.charAt(i) != '+' && input.charAt(i) != '-' && input.charAt(i) != '*'
					&& input.charAt(i) != ':' && input.charAt(i) != '%') {
				ZahlS = ZahlS + input.charAt(i);
				i++;
				if (i >= input.length()) {
					return Integer.parseInt(ZahlS);
				}
			}
			Zahl = Integer.parseInt(ZahlS);
		}

		while (input.charAt(i) == ' ') {
			i++;
			if (i == input.length()) {
				return Zahl;
			}
		}

		switch (input.charAt(i)) {
		case '+':
			input = input.substring(i + 1);
			return Zahl + calculateLeftToRight(input);
		case '-':
			input = input.substring(i + 1);
			return Zahl - calculateLeftToRight(input);
		case '*':
			input = input.substring(i + 1);
			return Zahl * calculateLeftToRight(input);
		case ':':
			input = input.substring(i + 1);
			return Zahl / calculateLeftToRight(input);
		case '%':
			input = input.substring(i + 1);
			return Zahl % calculateLeftToRight(input);
		default:
			return Zahl;
		}
	}

}
