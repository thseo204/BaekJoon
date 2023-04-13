package q8958_X;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char[][] OX = new char[T][];
		int[] score = new int[T];
		
		for(int i = 0; i < T; i++) {
			String str = sc.next();
			OX[i] = str.toCharArray();
		}
		sc.close();
		
		for(int i = 0; i < score.length; i++) {
			int count = 1;
			for(int j = 0; j < OX[i].length; j++) {
				if(OX[i][j] == 'O') {
					score[i] += count++;
				} else if (OX[i][j] == 'X'){
					count = 1;
					continue;
				}
			}
			System.out.println(score[i]);
		}
	}
}
