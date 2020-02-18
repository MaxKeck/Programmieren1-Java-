package Uebung6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Dateioperationen {

	public static void main(String[] args) {
		try {
			TextzuTabelle("C://Users//Janok//Desktop//Test");
		} catch (Exception e) {

		}

	}

	public static void TextzuTabelle(String Speicherort) throws Exception {
		File file = new File(Speicherort + ".txt");
		PrintWriter pr = null;
		String st, name, vorname, ort, plz;
		String[] data;

		if (!(file.isFile() && file.canWrite() && file.canRead())) {
			file.createNewFile();
			if (file.isFile())
				System.out.println("Test File created");
		}

		BufferedReader br = new BufferedReader(new FileReader(file));
		pr = new PrintWriter(new BufferedWriter(new FileWriter(Speicherort + ".csv")));

		// st = br.readLine();

		// data = st.split(",");

		while ((st = br.readLine()) != null) {
			data = st.split(":");
			switch (data[0]) {
			case "Name":
				pr.print(data[1].substring(1) + ",");
				break;
			case "Vorname":
				pr.print(data[1] + ",");
				break;
			case "PLZ":
				pr.print(data[1] + ",");
				break;
			case "Ort":
				pr.print(data[1] + "\n");
				break;
			}
		}

		br.close();
		pr.close();
	}

}
