package Lernnachweis2;

public class MusterVergleich {

	public static void main(String[] args) {
		String pattern = "*6*7*";
		String input = "3456";

		System.out.println(isSuperMatch(pattern, input));
	}

	public static boolean isMatch(String pattern, String input) {
		if (pattern.length() != input.length()) {
			return false;
		}
		if (pattern.charAt(pattern.length() - 1) == input.charAt(input.length() - 1)
				|| pattern.charAt(pattern.length() - 1) == '?') {
			if (input.length() == 1) {
				return true;
			}
			return isMatch(pattern.substring(0, pattern.length() - 1), input.substring(0, input.length() - 1));
		}
		return false;
	}

	public static boolean isSuperMatch(String pattern, String input) {
		if (pattern.charAt(0) == '*') {
			if (pattern.length() > 1) {
				if (input.contains((Character.toString(pattern.charAt(1))))) {
					int i = 0;
					while (input.charAt(i) != pattern.charAt(1)) {
						i++;
					}
					if (i < input.length() - 1) {
						return isSuperMatch(pattern.substring(2), input.substring(i + 1));
					} else {
						return true;
					}
				} else {
					return false;
				}
			} else {
				return true;
			}
		}

		if (pattern.charAt(0) == input.charAt(0)) {
			if (input.length() == 1) {
				return true;
			}
			return isSuperMatch(pattern.substring(1), input.substring(1));
		}

		return false;

	}
}
