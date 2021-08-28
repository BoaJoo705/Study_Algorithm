// Median.java의 if(a>=b) 에서 a 와 b 의 대소 관계를 한번의 조건문으로 분기하여 처리하였지만
// Q05 if 문과 else if 문에서 a 와 b 의 대소관계를 두번 체크해야된다는 점이 비효율적임

package chap01;

public class Q5 {
 static int med3(int a, int b, int c) {
	 // b>a>c			c>a>b
	 if((b>=a && c<=a)||(b<=a && c>=a))
		 return a;
	 // a>b>c			c>b>a
	 else if ((a>b && c<b)||(a<b &&c>b))
		 return b;
	 return c;
 }
}