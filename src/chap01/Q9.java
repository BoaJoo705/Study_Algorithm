package chap01;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a를 입력해주세요");
		int a = stdIn.nextInt();
		System.out.print("b를 입력해주세요");
		int b = stdIn.nextInt();
		System.out.println("a에서 b까지의 합은 " + sumof(a, b) + "입니다.");
	}

	static int sumof(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
}
