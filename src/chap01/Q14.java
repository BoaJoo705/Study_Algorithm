package chap01;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		do {
			System.out.print("사각형을 출력합니다 ");
			n = stdIn.nextInt();
		} while (n <= 0);
		System.out.println("단수: "+n);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
