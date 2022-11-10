package starEx2438;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		// 반복문 2개. 이중 for 문으로 별찍기
		if (0 <= n && n <= 100) {
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		// 반복문 1 개로 별찍기
//		for (int i = 0, count = 1; i < n; i++, count++) {
//			if (i == count) {
//				System.out.println();
//				count = 1;
//			}
//			System.out.print("*");
//		}
	}
}
