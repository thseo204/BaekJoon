package q10871;

import java.util.Scanner;
// 클래스 생성하여 문제풀이 시 런타임에러 발생
class MyMath {
	private int[] num;
	private int X;

	public MyMath() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		this.X = sc.nextInt();
		num = new int[N];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
	}

	public void print() {
		for (int i = 0; i < num.length; i++) {
			if (num[i] < X) {
				System.out.print(num[i] + " ");
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		mm.print();
	}
}
