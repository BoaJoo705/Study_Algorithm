package chap02;

import java.util.Scanner;

public class Q7 {
	
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;	// 변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf("%3d  |       %3d\n",r,x);
		System.out.println("  +  -----------");
		do {
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r;
			if(x!=0) {
				System.out.printf("%3d  |       %3d...  %3d\n",r,x,x % r);
				System.out.println("  +  -----------");

			}else {
				System.out.printf("%3d  |       %3d...  %3d\n",r,x,x % r);
				

			}

		} while (x != 0);
		
		for(int i = 0; i < digits/2; i++) {	// 역순으로 정렬
			char temp = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1]=temp;
		}
		return digits;
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;	// 변환하는 정수
		int cd;	// 기수
		int dno;	//변환 후의 자릿수
		char[] cno = new char[32];// 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

		System.out.println("10진수를 기수 변환합니다.");
			do {
				System.out.print("변환하는 음이 아닌 정수:");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);
			dno = cardConv(no, cd, cno);	// no를 cd 진수로 변환

			System.out.print(cd + "진수로는 ");
//			for (int i = dno - 1; i >= 0; i--) {	// 윗자리부터 차례로 나타냄 10 2 1010
			for( int i = 0; i <=dno -1; i++) {
				System.out.print(cno[i]);
			}
			
			System.out.println("입니다.");
		
	}
}
