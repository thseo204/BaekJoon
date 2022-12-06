package starEx2445;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n * 2; j++) {
				if(j > i && j < n * 2 - 1 - i) {
					System.out.print(" ");
				} else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 1; j < n * 2 + 1; j++) {
				if(j >= n-i && n + 1 + i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
