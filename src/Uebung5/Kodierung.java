package Uebung5;

public class Kodierung {
	public static void main(String[] args) {
		String[] Woerter = { "BB" };

		String[] Code = encode(Woerter);

		// String[] Decode = decode(Woerter);

		for (int i = 0; i < Code.length; i++) {
			System.out.println(Code[i]);
		}

		// for (int i = 0; i < Decode.length; i++) {
		// System.out.println(Decode[i]);
		// }
	}

	public static String[] encode(String[] inputs) {
		String output[] = new String[inputs.length];

		for (int j = 0; j < inputs.length; j++) {
			output[j] = "";
			for (int i = 0; i < inputs[j].length(); i++) {
				int a = (inputs[j].charAt(i) - 64) * (i + 1);

				String c = Integer.toString(a);
				while (c.length() < 3) {
					c = "0" + c;
				}
				output[j] += c;
			}
		}

		return output;
	}

	public static String[] decode(String[] inputs) {
		String output[] = new String[inputs.length];

		for (int i = 0; i < inputs.length; i++) {
			output[i] = "";
			int f = 0;
			for (int j = 0; j < inputs[i].length(); j += 3) {
				f++;
				String x = inputs[i].substring(j, j + 3);
				while (x.charAt(0) == '0') {
					x = x.substring(1);
				}
				int k = Integer.valueOf(x);
				int a = k / (f) + 64;
				output[i] += Character.toString((char) a);
			}

		}

		return output;
	}
}