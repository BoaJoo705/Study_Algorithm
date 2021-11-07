package chap02;

public class EmptyArray {
	public static void main(String[] args) {
		int[] x = new int[0];
		int[][] y = { { 1, 2, 3 }, { 4, 5, 6 }, };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(y[i][j]);
			}
		}
	}
}
