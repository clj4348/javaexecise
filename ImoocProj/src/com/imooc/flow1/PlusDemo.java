package com.imooc.flow1;

public class PlusDemo {
	public static void main(String[]args){
		//��1��5���ۼӺ�
		int n = 1;
		int sum = 0;//sum��ź͵ı���
//		while(n <= 5){
//			sum = sum + n;
//			n++;
//		}
//		System.out.println("1��5���ۼӺͣ�" + sum);
		//��1+3+5+7+...+15
		while (n <= 15){
			sum = sum + n;
			n = n + 2;
		}
		System.out.println("1��5���ۼӺͣ�" + sum);
	}
}
