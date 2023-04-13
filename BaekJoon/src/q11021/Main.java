package q11021;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] sum = new int[T];
		int A = 0,  B = 0;
		
		for(int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			sum[i] = A + B;
		}
		sc.close();
		
		for(int i = 0, j = 1; i < sum.length; i++, j++) {
			System.out.printf("Case #%d: %d\n", j, sum[i]);
		}
	}
}
