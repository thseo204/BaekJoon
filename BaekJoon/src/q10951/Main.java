package q10951;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0, i = 0;
		int[] sum = new int[10];
		
		do {
			A = sc.nextInt();
			B = sc.nextInt();
			sum[i++] = A + B;
		} while (sc.hasNextInt());
		sc.close();
		
//		sc.hasNextInt() // 입력 값이 정수가 아닌 이외의 수 일 때에 종료된다는 불리언 메서드.
		
		for(int j = 0; j < sum.length; j++) {
		System.out.println(sum[j]);
		}
	}
}
