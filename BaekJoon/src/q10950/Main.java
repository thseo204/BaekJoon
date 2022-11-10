package q10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < n; i++) {
			System.out.println(A[i]+ B[i]);
		}
	}
}
