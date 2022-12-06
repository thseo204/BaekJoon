package starEx2438;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= 0; j--) {
				if(j >= i) {
				System.out.print('*');
				}
			}
			System.out.println();
		}
	}
}
