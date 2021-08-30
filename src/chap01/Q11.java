package chap01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("양의 정수를 입력해주세요");
		
		System.out.print("양의 정수: ");
		n= scan.nextInt();
		
		String s = Integer.toString(n);
		System.out.println("그 수는 "+ s.length()+ "자리입니다.");
		
		
		
	}
}
