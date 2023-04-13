package q1110;

import java.util.Scanner;

class Recycle {
	private int inp;
	private int result;
	private String firstStr, numStr1, numStr2;

	public Recycle(int inp) {
		if (!(0 <= inp && inp <= 99)) {
			return;
		}
		this.inp = inp;

		if (inp < 10) {
			firstStr = "0" + inp;
		} else {
			firstStr = "" + inp;
		}
		numStr1 = firstStr;
	}

	public int print() {
		int i = 0;
		do {
			result = ((int) numStr1.charAt(0) - '0') + ((int) numStr1.charAt(1) - '0');
			if (result < 10) {
				numStr2 = "0" + result;
			} else {
				numStr2 = "" + result;
			}

			numStr1 = "" + numStr1.charAt(1) + numStr2.charAt(1);
			inp = Integer.parseInt(numStr1);

			i++;
			if (firstStr.equals(numStr1)) {
				break;
			}
			if (inp < 10) {
				numStr1 = "0" + inp;
			}

		} while (true);
		return i;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		Recycle rc = new Recycle(inp);
		System.out.println(rc.print());
	}
}
