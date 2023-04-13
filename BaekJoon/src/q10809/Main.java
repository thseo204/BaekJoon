package q10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int[] inp = new int[26];
		char[] alphNum = new char[26];
		char[] alphC = new char[100];

		alphC = s.toCharArray();

		for (int i = 0; i < alphNum.length; i++) {
			alphNum[i] = (char) (97 + i);
		}

		for(int i = 0; i < alphNum.length; i++) {
			for(int j = 0; j < alphC.length; j++) {
				if(alphNum[i] == alphC[j]) {
					inp[i] = j;
					break;
				} else {
					inp[i] = -1;
				}
			}
			System.out.print(inp[i] + " ");
		}
	}
}
