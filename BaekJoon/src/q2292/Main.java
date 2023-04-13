package q2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int count = 1;
		int num = 2;
		sc.close();

		for (int i = 1, j = 1;; i++) {
			if (i % num == 0) {
				count++;
				num += 6 * j++;
			}
			if (i == inp) {
				break;
			}
		}

		System.out.println(count);
	}
}
