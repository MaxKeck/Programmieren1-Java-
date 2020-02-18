package Uebung8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class HotelOccupancy {

	public static void main(String[] args) throws Exception {

		String Belegung = fileToString("belegung.txt");

		String RaumUebersicht = roomList(Belegung);
		System.out.println(RaumUebersicht);

		// int RoomNumber = getRoomNumberFromScanner();

		System.out.println(roomRecommendation(Belegung));

	}

	public static String fileToString(String path) {
		try {
			FileReader reader = new FileReader(path);
			BufferedReader inBuffer = new BufferedReader(reader);

			String Belegung = inBuffer.readLine();
			inBuffer.close();
			return Belegung;
		} catch (Exception e) {
			return "Datei konnte nicht gelesen werden";
		}
	}

	public static int getRoomNumberFromScanner() {
		Scanner sc = new Scanner(System.in);
		int RoomNumber = 100;
		while (!(RoomNumber >= 0 && RoomNumber < 20)) {
			System.out.print("Bitte Zimmernummer eingeben:");
			String eingabe = sc.next();

			try {
				RoomNumber = Integer.parseInt(eingabe);
				if (RoomNumber >= 0 && RoomNumber < 20) {
					sc.close();
					return RoomNumber;
				} else {
					System.out.println("Das Zimmer " + eingabe + " gibt es nicht.");
					return getRoomNumberFromScanner();
				}
			} catch (Exception e) {
				System.out.println("Das Zimmer " + eingabe + " gibt es nicht.");
			}
		}
		return 0;
	}

	public static String roomList(String fileContent) {
		String BelegungAr[] = fileContent.split(" ");
		String roomlist = "Zimmer Gaeste";
		String ZahlenAbstand = "      ";
		for (int i = 0; i < 20; i++) {
			roomlist = roomlist + "\n";
			if (i == 10) {
				ZahlenAbstand = ZahlenAbstand.substring(0, ZahlenAbstand.length() - 1);
			}
			if (i < BelegungAr.length) {
				roomlist = roomlist + Integer.toString(i) + ZahlenAbstand + BelegungAr[i];
			} else {
				roomlist = roomlist + Integer.toString(i) + ZahlenAbstand + "0";
			}
		}
		return roomlist;
	}

	public static String roomRequest(int room, String fileContent) {
		String BelegungAr[] = fileContent.split(" ");

		return "Zimmer " + room + " ist momentan mit " + BelegungAr[room] + " Gaesten belegt.";
	}

	public static String roomRecommendation(String fileContent) {
		String BelegungAr[] = fileContent.split(" ");
		String freieZimmer = "";
		for (int i = 19; i >= 0; i--) {
			if (i > BelegungAr.length - 1) {
				freieZimmer += "Zimmer " + i + " ist frei!\n";
			} else {
				if (Integer.parseInt(BelegungAr[i]) == 0) {
					freieZimmer += "Zimmer " + i + " ist frei!\n";
				}
			}
		}
		if (freieZimmer.contentEquals("")) {
			freieZimmer = "Es gibt keine freien Zimmer";
		}

		return freieZimmer;
	}

}
