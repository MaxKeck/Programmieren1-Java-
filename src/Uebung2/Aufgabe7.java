package Uebung2;

public class Aufgabe7 {

	public static void main(String[] args) {
		double[] messpunkte = { 2.1d, 4, 3 };
		double[] absteande = { 5, 4.3d, 6 };
		double A = 0;

		for (int i = 0; i < 3; i++) {
			A = A + messpunkte[i] * absteande[i];
		}
		System.out.println("Flächeninhalt: " + A + "Quadratkilometer");

	}

}
