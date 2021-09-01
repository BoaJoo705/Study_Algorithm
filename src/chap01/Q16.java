package chap01;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		do {
			System.out.print("몇 단 피라미드 입니까?:");
			n = stdIn.nextInt();
		} while (n <= 0);

		spira(n);

	}

	static void spira(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {

				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");

			}

			System.out.println();
		}
	}
}
