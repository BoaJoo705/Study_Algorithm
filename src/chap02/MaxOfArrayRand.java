package chap02;

import java.util.Random;
import java.util.Scanner;
// 랜덤 객체 생성
// Randon rand =new Random();
// 원하는 범위의 난수 생성(131~150)
// int a = 130 +(rand.nextInt(20)+1);
// 1~45
// int b = rand.nextInt(45) + 1;

public class MaxOfArrayRand {
	// 배열 요소의 최댓값을 나타냅니다(값을 난수로 생성)
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수: ");
		int num = stdIn.nextInt();	// 배열의 요솟수를 입력 받음

		int[] height = new int[num];	// 요솟수가 num인 배열을 생성

		System.out.println("키값은 아래와 같습니다. ");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);  // 0 ~ 89까지만
			System.out.println("height[" + i + "]" + height[i]);
		}
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
