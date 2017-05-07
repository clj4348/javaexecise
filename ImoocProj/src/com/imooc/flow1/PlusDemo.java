package com.imooc.flow1;

public class PlusDemo {
	public static void main(String[]args){
		//求1到5的累加和
		int n = 1;
		int sum = 0;//sum存放和的变量
//		while(n <= 5){
//			sum = sum + n;
//			n++;
//		}
//		System.out.println("1到5的累加和：" + sum);
		//求1+3+5+7+...+15
		while (n <= 15){
			sum = sum + n;
			n = n + 2;
		}
		System.out.println("1到5的累加和：" + sum);
	}
}
