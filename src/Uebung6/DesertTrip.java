package Uebung6;

public class DesertTrip {

	public static void main(String[] args) {
		int waterrations = 2;
		double WDistance = 166.666;

		double Distance = calcTotalDistanceFromWaterRations(waterrations);
		int Nwaterrations = calcWaterRationsFromTotalDistance(WDistance, 0);

		System.out.println(Distance + "km");
		System.out.println(Nwaterrations);
	}

	public static double calcTotalDistanceFromWaterRations(int waterrations) {
		if (waterrations > 0) {
			return 100 + (calcTotalDistanceFromWaterRations(waterrations - 1) * 2 / 3);
		}
		return 0;
	}

	public static int calcWaterRationsFromTotalDistance(double distance, double aufrufanzahl) {
		if (distance <= 0) {
			return 0;
		}

		return 1 + calcWaterRationsFromTotalDistance((distance - (100 * (Math.pow(0.666666, aufrufanzahl)))),
				aufrufanzahl + 1);
	}

}
