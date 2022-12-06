package starEx2440;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < inp; i++) {
			for(int j = inp-i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
