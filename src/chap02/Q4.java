package chap02;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("배열 b 의 요솟수: ");
		int nb = stdIn.nextInt();   // nb는 요솟수

		int[] b = new int[nb];	
		for (int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "] :");
			b[i] = stdIn.nextInt();		// b배열 받기
		}

		int[] a = new int[nb];
		copy(a, b);
		
		for (int i = 0; i < nb; i++) {
			System.out.println("a[" + i + "] :" + a[i]);

		}

	}
	static void copy(int[] a, int[] b) {

		//a = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
}
