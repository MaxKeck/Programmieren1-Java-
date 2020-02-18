package Uebung4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileReader {

	public static void main(String[] args) {
		String filename = "Test.txt";
		writeToFile(filename);
		readFile(filename);
	}

	public static void readFile(String filename) {
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);

			String str;
			int AnzahlDaten;
			int Zeilenanzahl = 0;
			while ((str = br.readLine()) != null) {
				AnzahlDaten = 0;
				for (int l = 0; l < str.length() - 4; l++) {
					if (str.charAt(l) == 'd' || str.charAt(l) == 'D') {
						if (str.charAt(l + 1) == 'a' || str.charAt(l + 1) == 'A') {
							if (str.charAt(l + 2) == 't' || str.charAt(l + 2) == 'T') {
								if (str.charAt(l + 3) == 'e' || str.charAt(l + 3) == 'E') {
									if (str.charAt(l + 4) == 'n' || str.charAt(l + 4) == 'N') {
										AnzahlDaten++;
									}
								}
							}
						}
					}
				}
				Zeilenanzahl++;
				System.out.println(str + " Zeichen: " + str.length() + " erstes: " + str.charAt(0) + " letztes: "
						+ str.charAt(str.length() - 1) + " Daten: " + AnzahlDaten);

			}
			System.out.println("Zeilen: " + Zeilenanzahl);

			br.close();
		} catch (IOException e) {
			System.out.println("File not found!");
		}

	}

	public static void writeToFile(String filename) {
		try {
			FileWriter fw = new FileWriter(filename);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("testinDaTeN");
			pw.println("testing2");
			pw.println("testing3");

			pw.close();
		} catch (IOException e) {
			System.out.print("Error!");
		}
	}
}
