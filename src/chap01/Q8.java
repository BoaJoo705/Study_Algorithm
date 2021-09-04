package chap01;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값:");
		int n = stdIn.nextInt();

		int sum = 0;

//		for (int i = 1; i <= n; i++) {
//			sum += i + n - (i - 1);
//		}
//		sum=sum/2;

//		for (int i = 1; i <= n; i++) {
//			sum = (1 + n) * n / 2;
//		}
//		System.out.println(sum);
		int i = 1;
		if (n % 2 == 0) {
			sum = (i + n) * (n / 2);
		} else {
			sum = (i + n) * (n / 2) + (i + n) / 2;	// i+n이 중간 
		}
		System.out.println(sum);
	}
}
