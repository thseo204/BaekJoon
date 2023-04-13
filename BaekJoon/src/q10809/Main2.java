package q10809;

import java.util.Scanner;

class Alphabat {
	private char[] alphC;
	private char[] alphNum;
	private int[] inp;

	public Alphabat() {
		inp = new int[26];
		alphNum = new char[26];
		for (int i = 0; i < alphNum.length; i++) {
			alphNum[i] = (char) (97 + i);
		}
	}

	public void setS(String s) {
		alphC = new char[100];
		alphC = s.toCharArray();
		
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

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alphabat alph = new Alphabat();
		String s = sc.next();
		sc.close();

		alph.setS(s);
	}
}
