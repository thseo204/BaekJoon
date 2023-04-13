package q10871;

import java.util.Scanner;
// 클래스 생성하지 않고 문제 통과
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] num = new int[N];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] < X) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
