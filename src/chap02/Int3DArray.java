package chap02;

public class Int3DArray {
	public static void main(String[] args) {

		int[][][] y = new int[2][2][3];
		y[0][0][1] = 37; // x[0][1]에 37을 대입
		y[0][1][0] = 54; // x[0][3]에 54을 대입
		y[1][1][0] = 65; // x[1][2]에 37을 대입
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.println("y[" + i + "][" + j + "][" + k + "] =" + y[i][j][k]);
				}
			}
		}
	}
}
