package Uebung7;

public class Weihnachtsgruﬂ {

	public static void main(String args[]) {
		String s = "christmas";

		printXmasWordTree(s);

	}

	public static void printXmasWordTree(String greetings) {
		String LastRowWord = "";
		for (int i = 0; i <= greetings.length(); i++) {
			String RowWord = createRowWord(greetings, i);
			String print = RowWord + "|" + reverse(RowWord);
			System.out.println(print);
			LastRowWord += " ";
		}
		System.out.println(LastRowWord + "I" + LastRowWord);
	}

	public static String createRowWord(String myString, int rowNumber) {
		String RowWord = "";
		for (int i = 0; i < myString.length(); i++) {
			if ((myString.length() - (i + 1)) < rowNumber) {
				RowWord = RowWord + myString.charAt(i);
			} else {
				RowWord = " " + RowWord;
			}
		}
		RowWord = RowWord.substring(0, myString.length() - rowNumber) + "/"
				+ RowWord.substring(myString.length() - rowNumber);

		return RowWord;
	}

	public static String reverse(String s) {
		String sReverse = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '/') {
				sReverse = "\\" + sReverse;
			} else {
				sReverse = s.charAt(i) + sReverse;
			}
		}

		return sReverse;
	}
}
