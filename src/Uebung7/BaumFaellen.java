package Uebung7;

public class BaumFaellen {

	public static void main(String[] args) {
		char[][] inputImage = { { ' ', ' ', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', 'X', '*', 'X', 'x', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'x', ' ', ' ', ' ' },
				{ 'O', 'O', 'X', 'X', 'X', 'X', '*', 'X', 'x', 'x', ' ' },
				{ 'O', 'O', 'X', 'X', '*', 'X', 'X', 'X', 'x', 'x', '*' } };

		char[][] XmasTree = reconstructInput(inputImage);

		for (int h = 0; h <= XmasTree.length - 1; h++)
			System.out.println(XmasTree[h]);
	}

	public static char[][] reconstructInput(char[][] inputImage) {
		char[][] Tree = new char[inputImage[0].length][inputImage.length * 2 - 1];

		for (int i = 0; i < inputImage.length; i++) {
			for (int j = 0; j < inputImage[0].length; j++) {
				Tree[Tree.length - (j + 1)][i] = inputImage[i][j];
				if (i != inputImage.length - 1) {
					Tree[Tree.length - (j + 1)][Tree[0].length - (i + 1)] = inputImage[i][j];
				}
			}
		}

		return Tree;

	}
}
