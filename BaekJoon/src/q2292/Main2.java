package q2292;

import java.util.Scanner;

class Honeycomb {
	private int inp;
	private int num = 2;
	private int count = 1;

	public Honeycomb() {
		Scanner sc = new Scanner(System.in);
		inp = sc.nextInt();
		sc.close();
	}

	public int getCount() {
		for (int i = 1, j = 1;; i++) {
			if (i % num == 0) {
				count++;
				num += 6 * j++;
			}
			if (i == inp) {
				break;
			}
		}
		return count;
	}
}

public class Main2 {
	public static void main(String[] args) {
		Honeycomb hc = new Honeycomb();
		System.out.println(hc.getCount());
	}
}
