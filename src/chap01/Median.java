package chap01;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
	}
	
	static int med3(int a, int b, int c) {
		// a가 b보다 클 때 max a, min b
		if(a >= b) {
			// b가 c보다 클 때 mid b, min c 이 조건을 벗어나면 min b 확정
			if(b >= c) {
				return b;
			// b < c 조건이 전제가 되고 min b 확정 a가 c보다 작을 때 mid a, max c
			} else if(a <= c) {
				return a;
			// b < c 조건이 전제가 되고 min b 확정 a가 c보다 클 때 max a, min c
			} else {
				return c;
			}
		// b > a 조건이 전제가 되고 max b, min a
		// a가 c보다 크면 max b, mid a, min c
		// 이 조건을 벗어나면 min a 확정
		} else if(a > c) {
			return a;
		// a < c 조건이 전제가 되고 min a 
		// b가 c보다 크면 max b, mid c, min a
		} else if(b > c) {
			return c;
		// c > b > a 조건이 전제가 됨 max c, mid b, min a
		} else {
			return b;
		}
	}
}
