package chap02;

class CloneArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		// 깊은 복사 - 별도의 메모리 공간을 만듬
		int[] b = a.clone();
		// 얕은 복사 - 같은 메모리 공간을 공유
		int[] c =a;
		
		b[3] = 0;
		c[3] = 0;
		System.out.print("a=");

		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.print("\nb=");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
}
