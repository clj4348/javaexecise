package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {

		// 定义两个整数:输出两数之商
		// int one = 12;
		// int two = 2;
		// System.out.println("one和two的商是："+(one/two));
		/*
		 * 要求：定义两个整数，接受用户的键盘输入，输出两个数之商
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("=======运算要开始======");
		try {
			System.out.print("请输入第一个整数");
			int one = input.nextInt();
			System.out.print("请输入第二个整数");
			int two = input.nextInt();
			System.out.println("one和two的商是：" + (one / two));
		} catch (ArithmeticException e) {// ArithmeticExcetion算数异常
			System.out.println("除数不允许为零");
			e.printStackTrace();// 这个方法可以打印出错误的堆栈信息
			System.exit(1);//终止程序
		} catch (InputMismatchException e) {
			System.out.println("请输入整数");
			e.printStackTrace();// 这个方法可以打印出错误的堆栈信息
		} catch (Exception e) {//父类异常一定要放在后面
			System.out.println("出错啦~~~");
			e.printStackTrace();
		} finally {// 无论try-catch块中是否出现异常都被执行
			System.out.println("=======运算结束======");
		}

	}

}
