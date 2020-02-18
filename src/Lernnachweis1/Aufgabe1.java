package Lernnachweis1;

enum TrainingsplanTag {
	TRAINING, FREI, PROBESPIEL, PROBESPIELAUSWERTUNG, TURNIERVORBEREITUNG, TURNIER
};

public class Aufgabe1 {

	public static void main(String[] args) {
		int a = 14;
		int Wochenanzahl = a / 7 + 1;
		int i = 0, j = 0, k = 0;
		TrainingsplanTag[][] Trainingsplan = new TrainingsplanTag[Wochenanzahl][7];
		Trainingsplan = Trainingsplan(a);
		if (Trainingsplan == null) {
			System.out.println("Trainingsplan konnte nicht erstellt werden!");
			return;
		}
		while (j < Wochenanzahl) {
			i = 0;
			while (i < 7 && k < a) {
				switch (Trainingsplan[j][i]) {
				case FREI:
					System.out.println("Frei ");
					break;
				case PROBESPIEL:
					System.out.println("Probespiel");
					break;
				case PROBESPIELAUSWERTUNG:
					System.out.println("Probespielauswertung ");
					break;
				case TRAINING:
					System.out.println("Training ");
					break;
				case TURNIER:
					System.out.println("Turnier ");
					break;
				case TURNIERVORBEREITUNG:
					System.out.println("Turniervorbereitung ");
					break;
				default:
					System.out.println("Fehler ");
					break;
				}
				i++;
				k++;
			}
			System.out.println("\n");
			j++;
		}

	}

	public static TrainingsplanTag[][] Trainingsplan(int TageAnzahl) {
		int Wochenanzahl = TageAnzahl / 7 + 1;
		TrainingsplanTag[][] Trainingsplan = new TrainingsplanTag[Wochenanzahl][7];
		int i = 0, j = 0, k = 0;

		if (TageAnzahl < 14) {
			return null;
		}

		while (j < (TageAnzahl / 7) + 1) {
			i = 0;

			while (i < 7 && k < TageAnzahl) {
				switch (k % 3) {
				case 0:
					Trainingsplan[j][i] = TrainingsplanTag.TRAINING;
					break;
				case 1:
					Trainingsplan[j][i] = TrainingsplanTag.TRAINING;
					break;
				case 2:
					Trainingsplan[j][i] = TrainingsplanTag.FREI;
					break;
				}
				if (k % 11 == 0 && k != 0) {
					Trainingsplan[j][i] = TrainingsplanTag.PROBESPIEL;
				}
				if (k % 11 == 1 && Trainingsplan[j][i] == TrainingsplanTag.TRAINING && k != 1) {
					Trainingsplan[j][i] = TrainingsplanTag.PROBESPIELAUSWERTUNG;
				}
				switch (TageAnzahl - k) {
				case 1:
					Trainingsplan[j][i] = TrainingsplanTag.TURNIER;
					break;
				case 2:
					Trainingsplan[j][i] = TrainingsplanTag.TURNIERVORBEREITUNG;
					break;
				case 3:
					Trainingsplan[j][i] = TrainingsplanTag.TURNIERVORBEREITUNG;
					break;
				}

				i++;
				k++;
			}
			j++;

		}

		return Trainingsplan;

	}

}
