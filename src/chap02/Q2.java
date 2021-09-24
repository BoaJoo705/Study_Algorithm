package chap02;

import java.util.Scanner;

public class Q2 {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		print(a);
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]와(과) a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, i, a.length - i - 1);
			print(a);
		}
	}

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = stdIn.nextInt();

		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}

		reverse(a); // 배열 a의 요소를 역순으로 정렬

		System.out.println("요소를 역순으로 정렬했습니다.");

	}
}
