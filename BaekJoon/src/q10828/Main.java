package q10828;

import java.util.Scanner;

class MyStack{
	private int[] num;
	private int index;
	private int print;
	private int count;
	
	public MyStack(int N) {
		num = new int[N];
		index = 0;
		print = 0;
		count = 0;
	}
	
	public void push(int num) {
		this.num[index++] = num;
//		print++;
	}
	
	public void pop() {
//		if(print > 0){
//			for(int i = count; i < index; i++) {
//			System.out.println(num[i]);
//			count++;
//			}
//			print = 0;
//		}
		if(index == 0) {
			System.out.println(-1);
		} else {
			System.out.println(num[--index]);
			index--;
//			if(index == 0) {
//				System.out.println(-1);
//			} else if(index > 1) {
//				System.out.println(num[--index]);
//			}
		}
	}
	
	public void size() {
//		if(print > 0){
//			for(int i = count; i < index; i++) {
//			System.out.println(num[i]);
//			count++;
//			}
//			print = 0;
//		}
		System.out.println(index);
	}
	
	public void empty() {
//		if(print > 0){
//			for(int i = count; i < index; i++) {
//			System.out.println(num[i]);
//			count++;
//			}
//			print = 0;
//		}
		if(index == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	public void top() {
//		if(print > 0){
//			for(int i = count; i < index; i++) {
//			System.out.println(num[i]);
//			count++;
//			}
//			print = 0;
//		}
		if(index == 0) {
			System.out.println(-1);
		} else {
			int topIndex = index - 1;
			System.out.println(num[topIndex]);
		}
	}
	
	public int getNum() {
		return num[index];
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MyStack ms = new MyStack(n);
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			switch(str) {
			case "push":
				int num = sc.nextInt();
				ms.push(num);
				break;
			case "pop" :
				ms.pop();
				break;
			case "size" :
				ms.size();
				break;
			case "empty" :
				ms.empty();
				break;
			case "top" :
				ms.top();
				break;
			}
		}
		sc.close();
	}
}
