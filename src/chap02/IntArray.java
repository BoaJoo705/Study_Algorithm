package chap02;

class IntArray {
	public static void main(String[] args) {
		int[] a  = new int[5];	// 배열의 선언과 참조(동시에!)
		
		a[1]=37;		// a[1]에 37을 대입
		a[2]=51;		// a[2]에 51을 대입
		a[4] = a[1]*2;	// a[4]에 a[1]*2,곧 74를 대입
		
		for(int i =0; i<a.length;i++) {	// 각 요소의 값을 나타냄
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}	
