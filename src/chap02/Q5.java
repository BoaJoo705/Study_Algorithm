package chap02;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("배열 b 의 요솟수: ");
		int nb = stdIn.nextInt(); // nb는 요솟수

		int[] b = new int[nb];
		for (int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "] :");
			b[i] = stdIn.nextInt(); // b배열 받기
		}

		int[] a = new int[nb];
		rcopy(a, b);

		for (int i = 0; i < nb; i++) {
			System.out.println("a[" + i + "] :" + a[i]);

		}

	}

	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {

			a[i] = b[b.length - i - 1];
		}
	}
}
