package q10952;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B =0;
		int[] sum = new int[100];
		int i = 0;
		
		do {
			A = sc.nextInt();
			B = sc.nextInt();
			if(A==0 && B==0) {
				sc.close();
				break;
			}
			sum[i++] = A + B;
		} while (true);
		
		for(int j = 0; j < i; j++) {
			System.out.println(sum[j]);
		}
	}
}
