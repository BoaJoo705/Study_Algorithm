package chap01;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값:");
		int n = stdIn.nextInt();

		int sum = 0; // 합

		for (int i = 1; i <= n; i++) {
			sum += i; // sum 에 i를 더합니다.
			 if(i<n) {
					 System.out.print(i+"+");
			 }else  {
				 System.out.print(n);
			 }
		}
		System.out.println("="+sum);
	}
}