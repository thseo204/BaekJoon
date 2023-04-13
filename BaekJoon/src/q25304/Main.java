package q25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumValue = sc.nextInt();
		int sumN = sc.nextInt();
		int value = 0, N = 0;
		int sum = 0;
		
		
		
		for(int i = 0; i < sumN; i++) {
			value = sc.nextInt();
			N = sc.nextInt();
			sum += (value * N);
		}
		sc.close();
		
		if(sumValue == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
