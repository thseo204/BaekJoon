package q11022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] sum = new int[T];
		int[] A = new int[T], B = new int[T];
		
		for(int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			sum[i] = A[i] + B[i]; 
		}
		sc.close();
		
		for(int i = 0; i < sum.length; i++) {
			System.out.printf("Case #%d: %d + %d = %d\n", (i+1), A[i], B[i], sum[i]);
		}
	}
}
