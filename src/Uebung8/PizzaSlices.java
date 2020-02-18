package Uebung8;

public class PizzaSlices {

	public static void main(String[] args) {

	}

	public static int numberOfPizzaSlices(int cuts) {
		if (cuts == 0) {
			return 1;
		}
		return cuts + numberOfPizzaSlices(cuts - 1);
	}

}
