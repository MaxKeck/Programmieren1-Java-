package Uebung4;
import java.util.Scanner;

public class BenutzernameundPasswort {

	public static void main(String[] args) {

		Scanner Eingabewert = new Scanner(System.in);
		String Username = "janok", Password = "1234";
		String PasswordE, UsernameE;

		System.out.println("Benutzername: ");
		UsernameE = Eingabewert.nextLine();
		System.out.println("Passwort: ");
		PasswordE = Eingabewert.nextLine();

		checkUsernameandPassword(Password, Username, PasswordE, UsernameE);

		Eingabewert.close();

	}

	public static void checkUsernameandPassword(String Password, String Username, String PasswordE, String UsernameE) {

		if (Username.equals(UsernameE) && Password.equals(PasswordE)) {
			System.out.println("Authentifizierung erfolgreich");
		} else {
			if (Username.equals(UsernameE) ^ Password.equals(PasswordE)) {
				System.out.println("Das war schon fast korrekt!");
			} else {
				System.out.println("Authentifizierung fehlgeschlagen");
			}
		}

	}

}
