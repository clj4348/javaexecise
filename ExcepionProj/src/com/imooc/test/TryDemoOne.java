package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {

		// ������������:�������֮��
		// int one = 12;
		// int two = 2;
		// System.out.println("one��two�����ǣ�"+(one/two));
		/*
		 * Ҫ�󣺶������������������û��ļ������룬���������֮��
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("=======����Ҫ��ʼ======");
		try {
			System.out.print("�������һ������");
			int one = input.nextInt();
			System.out.print("������ڶ�������");
			int two = input.nextInt();
			System.out.println("one��two�����ǣ�" + (one / two));
		} catch (ArithmeticException e) {// ArithmeticExcetion�����쳣
			System.out.println("����������Ϊ��");
			e.printStackTrace();// ����������Դ�ӡ������Ķ�ջ��Ϣ
			System.exit(1);//��ֹ����
		} catch (InputMismatchException e) {
			System.out.println("����������");
			e.printStackTrace();// ����������Դ�ӡ������Ķ�ջ��Ϣ
		} catch (Exception e) {//�����쳣һ��Ҫ���ں���
			System.out.println("������~~~");
			e.printStackTrace();
		} finally {// ����try-catch�����Ƿ�����쳣����ִ��
			System.out.println("=======�������======");
		}

	}

}
