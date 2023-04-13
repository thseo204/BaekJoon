package q1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
//		String[][] str = new String[10][10];
//		String[] order = new String[100];
		int count = 0;
		sc.close();

//		for(int i = 1, k = 0; k < str.length; i++, k++) {
//			for(int j = 1, z = 0; z < str[k].length; j++, z++) {
//				str[k][z] = i + "/" + j;
//				System.out.print(str[k][z] + " ");
//			}
//			System.out.println();
//		}
		String result= "";
		loop : for (int i = 1;; i++) {
			if (i % 2 == 0) {
				for(int j = i, k = 1; j >= 1; j--, k++) {
					result = k + "/" + j;
					count++;
					if(count == X) {
						break loop;
					}
				}
			} else {
				for (int j = 1, k = i; j <= i; j++, k--) {
					result = k + "/" + j;
					count++;
					if(count == X) {
						break loop;
					}
				}
			}
		}
		System.out.println(result);
	}
}
