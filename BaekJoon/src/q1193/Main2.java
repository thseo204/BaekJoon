package q1193;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		String[] result = new String[100];
		sc.close();
		int count = 1, index = 0;
		
		
		boolean a = true;
		do {
			if(count % 2 == 0) {
				for(int i = 1, j = count; i <=count; i++, j--) {
//					System.out.print(i + "/" + j + " ");
					result[index] = i+ "/" + j + " ";
//					System.out.print(result[index] + " ");
					index++;
					if(index == X) {
						a = false;
					}
				}
			} else {
				for(int i = count, j = 1; j <= count; i--, j++) {
//					System.out.print(i + "/" + j + " ");
					result[index] = i+ "/" + j + " ";
//					System.out.print(result[index] + " ");
					index++;
					if(index == X) {
						a = false;
					}
				}
			}
//			System.out.println();
			count++;
		} while(a);
		
		System.out.println(result[X-1]);
	}
}
