package com.imooc.operator;

public class MathDemo {
	public static void main(String[] args){
		//x++
		int x = 4;
		int y = (x++)+5;
		System.out.println(x+","+y);
		//++x的形式
		x = 4;
		y=(++x)+5;
		System.out.println(x+","+y);
		//x--的形式
		x=4;
		y=(x--)+5;
		System.out.println(x+","+y);
		//--x的形式
		x=4;
		y=(--x)+5;
		System.out.println(x+","+y);
	}
}
