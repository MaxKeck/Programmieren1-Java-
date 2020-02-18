package Uebung4;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadandWrite {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:/Users/Janok/Studium/Semester 7/Programmierung/test.txt");
			PrintWriter pw = new PrintWriter(fw);

			pw.println("testing");
			pw.println("testing2");
			pw.println("testing3");

			pw.close();
		} catch (IOException e) {
			System.out.print("Error!");
		}

	}

}
