package com.imooc.method;

public class MathDemo2 {
	// 求圆形面积
	public void plus(float r) {
		double S = Math.PI * r * r;
		System.out.println("圆的面积为：" + S);
	}

	// 求长方形面积
	public void plus(int a, int b) {
		int sum = a * b;
		System.out.println("长方形的面积为：" + sum);

	}

	public static void main(String[] args) {
		// 定义对象
		MathDemo2 ad = new MathDemo2();
		// 定义一个double类型的变量存放半径，并初始化
		float r = 4.5f;
		ad.plus(r);
		// 定义两个变量存放长和宽，并初始化
		int a = 8, b = 5;
		// 调用方法，求圆的面积并打印输出
		ad.plus(a, b);
		// 调用方法，求长方形面积并打印输出

	}
}
