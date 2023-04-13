package q1010;

import java.util.Scanner;

class Bridge{
	private int N;
	private int M;
	private int count;
	
	public Bridge(int N, int M) {
		this.N = N;
		this.M = M;
		count = 0;
	}
	
	public void print() {
		int ea = N;
		do {
		for(int i = 1, z = N - 1; i <= N; i++, z--) {
			for(int j = i; j <= M; j++) {
				if(j >= M-z) {
					continue;
				}
				System.out.println("N(" + i + ")번째 다리 --- M(" + j + ")번째 다리");
			}
		}
		count++;
		ea--;
		} while (ea == 0);
		System.out.println(count);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		Bridge bri = new Bridge(N, M);
		bri.print();
	}
}
