package Uebung7;
public class XmasDecoration {

	public static void main(String[] args) {
		int height = 7;
		boolean emptyTree = true;

		String[] XmasTree = generateXmasTree(height, emptyTree);

		for (int h = 0; h <= XmasTree.length - 1; h++)
			System.out.println(XmasTree[h]);

	}

	public static String[] generateXmasTree(int height, boolean emptyTree) {
		if (height <= 0) {
			String[] Error = { "Fehler" };
			return Error;
		}
		String[] Tree = new String[height];
		for (int i = 0; i < height; i++) {
			Tree[i] = getXmasTreeLine(height, emptyTree, i);
		}
		return Tree;
	}

	public static String getXmasTreeLine(int height, boolean emptyTree, int line) {
		String TreeLine = "";
		int width = height * 2 - 1;
		if (width - 2 < 10) {
			if (line == height - 1) {
				TreeLine = "I";
			} else {
				TreeLine = "x";
			}
		} else {
			if (line == height - 1) {
				TreeLine = "III";
			} else {
				TreeLine = "x";
			}
		}
		if (line != 0 && line != height - 1) {
			if (!emptyTree) {
				while (line > 0) {
					TreeLine = "x" + TreeLine + "x";
					line--;
				}
			} else {
				if (line != height - 2) {
					TreeLine = TreeLine + " ";
					for (int i = 0; i < line - 1; i++) {
						TreeLine = TreeLine + "  ";
					}
					TreeLine = TreeLine + "x";
				} else {
					for (int i = 0; i < (height - 2); i++) {
						TreeLine = "x" + TreeLine + "x";
					}
				}
			}
		}
		while (TreeLine.length() < width - 2) {
			TreeLine = " " + TreeLine + " ";
		}

		return TreeLine;
	}

}
