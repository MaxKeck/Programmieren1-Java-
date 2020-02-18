package Lernnachweis2;

public class Minigolf {

	public static void main(String[] args) {
		double playgroundHeight = 2;
		double playgroundWidth = 2;
		double startHeight = 2;
		double startWidth = 2;
		int startDegree = 40;
		double startVelocity = 5;
		double absorption = 4;

		double distance = puttedDistance(playgroundHeight, playgroundWidth, startHeight, startWidth, startDegree,
				startVelocity, absorption);

		System.out.println(distance);

	}

	public static double puttedDistance(double playgroundHeight, double playgroundWidth, double startHeight,
			double startWidth, int startDegree, double startVelocity, double absorption) {

		return 2;
	}

}
