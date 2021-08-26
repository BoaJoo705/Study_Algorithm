package chap01;

import java.util.Scanner;

public class Max4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();
		System.out.println("d의 값 : ");
		int d = stdIn.nextInt();

		System.out.println("최댓값은 " + max4(a, b, c, d) + "입니다.");
	}
	
	static int max4(int a, int b, int c, int d) {
		int max=a;
		if(b>max)max=b;
		if(c>max)max=c;
		if(d>max)max=d;
		return max;
	}
}

//	static int max4(int a, int b, int c, int d) {
//		if (a > b) {
//			if (a > c) {
//				if (a > d) {
//					return a;
//				}
//			}
//		} else if (b > c) {
//			if (b > d) {
//				return b;
//			}
//		} else if (c > d) {
//			return c;
//		} else {
//			return d;
//		}
//	}

