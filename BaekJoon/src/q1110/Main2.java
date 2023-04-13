package q1110;

import java.util.Scanner;

public class Main2 {
	public void plusCicle(int n) {
		int count = 0;
		int x = n;
		
		while(true) {
			x = (x % 10) * 10 + (x / 10 + x % 10) % 10;
			count++;
			if(x == n) {
				break;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		Main2 m = new Main2();
		m.plusCicle(inp);

	}
}
