package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tmp = new int[9];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			tmp[i] = sc.nextInt();
			sum += tmp[i];
		}
		sc.close();

		int remainder = sum - 100;
		loop: for(int i = 1; i < tmp.length; i++) {
			for(int j = 0; j < tmp.length; j++) {
				if(remainder == tmp[i]+ tmp[j]) {
					tmp[i] = 0;
					tmp[j] = 0; 
					break loop;
				}
			}
		}
		int[] num = new int[7];
		int j = 0;
		for(int i = 0; i < tmp.length; i++) {
			if(tmp[i] != 0) {
				num[j] = tmp[i];
				j++;
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
