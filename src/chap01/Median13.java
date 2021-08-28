package chap01;

//3개의 정숫값 가운데 중앙값을 구하여 출력합니다.

public class Median13 {
	// a,b,c의 중앙값을 구하여 반환합니다.
	static int median13(int a, int b, int c) {
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
	public static void main(String[] args) {
		System.out.println("median13(3,2,1) = " + median13(3, 2, 1));	// a>b>c
		System.out.println("median13(3,2,2) = " + median13(3, 2, 2));	// a>b=c
		System.out.println("median13(3,1,2) = " + median13(3, 1, 2));	// a>c>b
		System.out.println("median13(3,2,3) = " + median13(3, 2, 3));	// a=c>b
		System.out.println("median13(2,1,3) = " + median13(2, 1, 3));	// c>a>b
		System.out.println("median13(3,3,2) = " + median13(3, 3, 2));	// a=b>c
		System.out.println("median13(3,3,3) = " + median13(3, 3, 3));	// a=b=c
		System.out.println("median13(2,2,3) = " + median13(2, 2, 3));	// c>a=b
		System.out.println("median13(2,3,1) = " + median13(2, 3, 1));	// b>a>c
		System.out.println("median13(2,3,2) = " + median13(2, 3, 2));	// b>a=c
		System.out.println("median13(1,3,2) = " + median13(1, 3, 2));	// b>c>a
		System.out.println("median13(2,3,3) = " + median13(2, 3, 3));	// b=c>a
		System.out.println("median13(1,2,3) = " + median13(1, 2, 3));	// c>b>a

	}
}
