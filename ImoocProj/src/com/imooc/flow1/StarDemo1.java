package com.imooc.flow1;

public class StarDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;//外循环的循环变量
		int n = 1;//内循环的循环变量
		System.out.println("输出4行4列的星号");
		//外重循环控制输出几行
		while( m <= 8){
			//内重循环控制每行输出几个星号
			n=1;
			while( n <= m){
				System.out.print("*");
				System.out.print(" ");
				n++;
			}
			System.out.println(" ");
			m++;
		}
	}
} 
