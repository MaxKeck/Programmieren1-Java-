package Uebung5;
import java.util.Scanner;

import javax.swing.JTable;

public class Zinssatz {

	public static void main(String[] args) {

		double zinsen[] = { 0.01d, 0.025d, 0.05d, 0.075d, 0.10d, 0.15d, 0.20d };
		String Zinsen[] = new String[zinsen.length];
		double Kapital = 10;
		int jahre = 10;

		Scanner Eingabewert = new Scanner(System.in);

		// System.out.println("Kapital: ");
		// Kapital = Eingabewert.nextDouble();
		// System.out.println("Anzahl der Jahre: ");
		// jahre = Eingabewert.nextInt();

		Eingabewert.close();

		String KapitalZ[][] = new String[zinsen.length][jahre + 1];

		for (int i = 0; i < zinsen.length; i++) {
			Zinsen[i] = String.valueOf(zinsen[i]) + "%";
			for (int j = 0; j <= jahre; j++) {
				KapitalZ[i][j] = String.valueOf(KapitalMitZinsen(Kapital, j, zinsen[i]));
			}
		}
		System.out.println(KapitalMitZinsen(Kapital, jahre, zinsen[6]));

		JTable table = new JTable(KapitalZ, Zinsen);
		// Container cp = getContentPane();
		// cp.add(new JLabel("Alte c\'t-Ausgaben:"), BorderLayout.NORTH);
		// cp.add(new JScrollPane(table), BorderLayout.CENTER);

		table.setLocation(100, 100);
		table.setSize(600, 250);
		table.setVisible(true);
	}

	public static double KapitalMitZinsen(double kapitaleinlage, int jahre, double zinssatz) {
		if (jahre == 0) {
			return kapitaleinlage;
		} else {
			return (zinssatz / 100 + 1) * KapitalMitZinsen(kapitaleinlage, jahre - 1, zinssatz);
		}
	}

}