package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		// ����Ҫ�µ���
		//�������intǿ��ת��
		int number =(int)(Math.random() * 10 + 1);
		int guess;
		System.out.println("��һ������1��10֮�����");
		do {
			System.out.println("���������²����:");
			Scanner sc = new Scanner(System.in);
			guess = sc.nextInt();
			if (guess > number) {
				System.out.println("̫��");
			} else if (guess < number) {
				System.out.println("̫С��");
			}
		} while (number != guess);
		System.out.println("�������ˣ���Ϊ" + number);
	}

}
