package Uebung3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Texteinlesen {

	public static void main(String[] args) throws Exception {
		File file = new File("C://Users//Janok//Desktop//Test.txt");
		PrintWriter pr = null;
		Scanner Eingabewert = new Scanner(System.in);
		String st, name, vorname, ort, neu;

		int Zeilenanzahl = 0;

		if (!(file.isFile() && file.canWrite() && file.canRead())) {
			file.createNewFile();
			if (file.isFile())
				System.out.println("Test File created");
		}

		BufferedReader br = new BufferedReader(new FileReader(file));
		pr = new PrintWriter(new BufferedWriter(new FileWriter("C://Users//Janok//Desktop//Test.txt")));

		st = br.readLine();

		while ((st = br.readLine()) != null) {
			System.out.println(st);
			pr.println(st);
			Zeilenanzahl++;
		}
		System.out.println("Zeilenanzahl: " + Zeilenanzahl);

		System.out.println("Wollen Sie einen neuen Eintrag anlegen?(Y/N)");
		neu = Eingabewert.nextLine();

		// if (neu == "Y") {

		System.out.println("Vorname: ");
		vorname = Eingabewert.nextLine();
		System.out.println("Name: ");
		name = Eingabewert.nextLine();
		System.out.println("Wohnort: ");
		ort = Eingabewert.nextLine();

		pr.println("Vorname: " + vorname + " Name: " + name + " Wohnort: " + ort);

		// }

		Eingabewert.close();
		br.close();
		pr.close();

	}

}
