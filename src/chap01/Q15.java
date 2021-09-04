package chap01;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n = 0;

		triangleLB(n, stdIn);
		System.out.println();
		traiangleLU(n, stdIn);
		System.out.println();
		traiangleRU(n, stdIn);
		System.out.println();
		traiangleRB(n, stdIn);
	}

	static void triangleLB(int n, Scanner stdIn) { // 왼쪽 아래가 직각인 이등변 삼각형을 출력
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		do {
			System.out.print("몇 단 삼각형입니까?:");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void traiangleLU(int n, Scanner stdIn) { // 왼쪽 위가 직각인 이등변 삼각형을 출력
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		do {
			System.out.print("몇 단 삼각형입니까?:");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void traiangleRU(int n, Scanner stdIn) { // 오른쪽 위가 직각인 이등변 삼각형을 출력
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");

		do {
			System.out.print("몇 단 삼각형입니까?:");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j - i < 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	static void traiangleRB(int n, Scanner stdIn) { // 오른쪽 아래가 직각인 이등변 삼각형을 출력

		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		do {
			System.out.print("몇 단 삼각형입니까?:");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j + i <= n) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
