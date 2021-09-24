package chap02;

import java.util.Random;
// import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Random rand = new Random();

	
		int num = rand.nextInt(10);
		System.out.println(num);

		int[] a = new int[num];
		 
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt();
			
			System.out.println(a[i]);
		}

			sumOf(a);
			System.out.println("sumOf = "+sumOf(a));
	}

	static int sumOf(int[] a) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
