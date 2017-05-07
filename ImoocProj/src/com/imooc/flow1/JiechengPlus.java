package com.imooc.flow1;

public class JiechengPlus {
	public static void main(String[] args) {
		//int类型求的阶乘数太大会导致内存溢出，改用长整型
		//如果还是太大也会一样导致内存溢出;变为负数
		long s = 1, sum = 0;
		for (int i = 1; i <= 25; i++) {
			s = 1;
			for (int j = 1; j <= i; j++) {
				s=s*j;//s存放阶乘计算的结果
			}
			sum = sum + s;
		}
		System.out.println("1!+2!+3!+4!+...+10="+sum);
		System.out.println("**********************");
		System.out.println("***************");
		System.out.println("*******************");
	}
}
