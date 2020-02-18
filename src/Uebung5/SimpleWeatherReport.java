package Uebung5;
import java.util.Scanner;

public class SimpleWeatherReport {
	public static void main(String[] args) {
		int month;
		String country;
		Scanner Eingabewert = new Scanner(System.in);

		System.out.println("Land: ");
		country = Eingabewert.nextLine();
		System.out.println("Monat(Zahl): ");
		month = Eingabewert.nextInt();

		Eingabewert.close();

		String Weather = predictWeather(month, country);

		System.out.println(Weather);

	}

	public static String predictWeather(int month, String country) {

		if (month > 12 || month < 1) {
			return "Eingabefehler";
		}
		if (country == "" || country == null) {
			return "Eingabefehler";
		}
		if (!country.equals("Deutschland")) {
			if (month < 4 || month > 9) {
				return "Regenschauer";
			} else {
				return "Sonnenschein";
			}
		} else {
			return "Nicht vorhersehbar!";
		}

	}

}
