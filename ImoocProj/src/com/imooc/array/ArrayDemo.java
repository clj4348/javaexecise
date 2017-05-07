package com.imooc.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// 声明一个整型的数组
		int[] intArray;
		// 声明一个字符串类型的数组
		String strArray[];
		// 创建数组
		intArray = new int[5];
		strArray = new String[10];

		// 声明数组的同时进行创建
		float[] floatArray = new float[4];
		// 初始化数组
		char[] ch = { 'a', 'b', 'c', 'b' };
		System.out.println("数组的长度为：" + ch.length);
		System.out.println("intArray数组的第2个元素为：" + intArray[1]);
		System.out.println("strArray数组的第五个元素为:" + strArray[4]);
		System.out.println("floatArray数组的最后一个元素为：" + floatArray[floatArray.length - 1]);
		// 循环为整型数组赋值
		for (int i = 0; i < 5; i++) {
			intArray[i] = i + 1;
		}
		// 循环输出整型数组中的元素
		System.out.println("整型数组intArray的元素为：");
		for (int i = 0; i < 5; i++) {
			System.out.print(intArray[i] + " ");
		}
		// 定义一个整型数组，并初始化
		System.out.println("");
		int[] a = { 1, 3, 5, 6, 8, 12 };
		// 循环遍历数组，找出能被3整除的元素并打印输出
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 != 0) {
				continue;
			}
			System.out.print(a[i] + " ");
		}

		// 如何对变量b,c的值进行交换
		int b = 3, c = 5;
		int temp;
		temp = b;
		b=c;
		b=temp;
	}

}
