package com.imooc.flow1;

public class DoWhileDemo {

	public static void main(String[] args) {
		// ��1��5���ۼӺ�
		int n = 1;
		int sum = 0;
		do {
			sum = sum + n;
			n++;
		} while (n <= 5);
		System.out.println("sum=" + sum);
	}
}
