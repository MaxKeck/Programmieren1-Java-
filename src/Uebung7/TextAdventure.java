package Uebung7;
import java.util.Scanner;

public class TextAdventure {

	public static void main(String[] args) {
		String command = "status";
		boolean ende = false;
		Scanner Eingabewert = new Scanner(System.in);

		while (ende == false) {
			command = Eingabewert.nextLine();

			String[] Response = getResponsesForTextCommands(command);

			for (int i = 0; i < Response.length; i++) {
				System.out.println(Response[i]);
			}
			if (command.contains("ende")) {
				ende = true;
			}
		}
		Eingabewert.close();

	}

	public static String getResponsesForTextCommand(String command) {
		command += "              ";
		if (command.substring(0, 11).contentEquals("schaue nach")) {
			String Richtung = command.substring(12);
			if (Richtung.contains("Westen") || Richtung.contains("Norden"))
				return "Ich schaue nach " + command.substring(12, 18) + ".";
			if (Richtung.contains("Osten") || Richtung.contains("Süden"))
				return "Ich schaue nach " + command.substring(12, 17) + ".";
			return "Kommando nicht verstanden.";
		}
		if (command.substring(0, 10).contentEquals("drehe nach")) {
			String Richtung = command.substring(11);
			if (Richtung.contains("Westen") || Richtung.contains("Norden"))
				return "Ich habe mich nach " + command.substring(11, 17) + " gedreht.";
			if (Richtung.contains("Osten") || Richtung.contains("Süden"))
				return "Ich habe mich nach " + command.substring(11, 16) + " gedreht.";
			return "Kommando nicht verstanden.";
		}
		if (command.substring(0, 13).contentEquals("gehe vorwärts")) {
			return "Ich bin vorwärts gelaufen.";
		}
		if (command.substring(0, 6).contentEquals("status")) {
			return "Ich bin bei (x,y) und schaue nach nicht definiert.";
		}
		if (command.substring(0, 5).contentEquals("öffne")) {
			String B = command.substring(6, command.length() - 14);
			return "Ich habe in " + B + " Goldstücke gefunden.";
		}
		if (command.substring(0, 7).contentEquals("benutze")) {
			return "Etwas ist passiert.";
		}
		if (command.substring(0, 4).contentEquals("ende")) {
			return "Bis zum nächsten Mal.";
		}
		return "Kommando nicht verstanden.";
	}

	public static String[] getResponsesForTextCommands(String userInput) {

		if (userInput.contains(" und ")) {
			String[] commands = userInput.split(" und ");
			String Responses[] = new String[commands.length];
			for (int i = 0; i < commands.length; i++) {
				Responses[i] = getResponsesForTextCommand(commands[i]);
			}
			return Responses;
		}
		String Response[] = new String[1];
		Response[0] = getResponsesForTextCommand(userInput);
		return Response;
	}

}
