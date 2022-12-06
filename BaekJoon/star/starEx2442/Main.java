package starEx2442;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n + i; j++) {
				if ((n - i) <= j && j <= (n + i)) {
					System.out.print("*");
				} else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
