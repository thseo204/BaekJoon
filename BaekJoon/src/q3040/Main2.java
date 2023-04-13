package q3040;

import java.util.Scanner;

// 선생님 코드
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp[] = new int[9];
		for(int i = 0; i <inp.length; i++) {
			inp[i] = sc.nextInt(); 
		}
		sc.close();
		int sum = 0;
		for(int i = 0; i < inp.length; i++) {
			sum += inp[i];
		}
		
		int a = 0, b= 0;
		for(int i = 0; i < inp.length; i++) {
			for(int j = 0; j < inp.length; j++) {
//				System.out.println(i + " " + j);
				if(sum - inp[i] - inp[j] == 100) {
					a = i;
					b = j;
				}
			}
		}
		System.out.println("[" + a + ", " + b + "]");
		
		for(int i = 0; i < inp.length; i++) {
			if(!(i == a || i == b)) {
				System.out.println(inp[i]);
			}
		}
	}
}
