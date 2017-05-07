package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 求整型数组的累加和
		// 定义整型数组
		/*int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		// 从键盘接收数据，为数组元素赋值
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "元素：");
			a[i] = sc.nextInt();
		}
		System.out.println("数组元素的内容为：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.print("使用增强型for循环输出数组内容：");
		for(int n:a){
			System.out.println(n+"  ");
		}
		//求数组元素的累加和
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum = sum + a[i];
		}
		System.out.println();
		System.out.println("数组元素的累加和为：" + sum);*/
		//定义一个三行两列列的整型二维数组
		int[][] number = new int[3][2];
		String str = " ";
		Scanner sca = new Scanner(System.in);
		int chineseSum = 0;
		int chinesePass = 0;
		int mathSum = 0;
		int mathPass = 0;
		for(int i = 0;i<number.length;i++){
			for(int j =0;j<number[i].length;j++){
				if (j == 0) str = "语文";
				if (j == 1) str = "数学";
				System.out.println("请输入第" + (i + 1) + "学生的"+str+"成绩：");				
				number[i][j] = sca.nextInt();
			}
			chineseSum = chineseSum + number[i][0];
			chinesePass = chineseSum / (i + 1);
			mathSum = mathSum + number[i][1];
			mathPass = mathSum / (i + 1);
		}
		System.out.println("语文成绩的总和" + chineseSum);
		System.out.println("语文成绩的平均分" + chinesePass);
		System.out.println("数学成绩的总和" + mathSum);
		System.out.println("数学成绩的平均分" + mathPass);
	}
}
