package com.imooc.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		/*
			�ɼ����ڵ���90�֣�������š�
		 */
		System.out.println("������ɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >= 90)
			System.out.println("��");
		else if(score >= 80)//�൱��score���ڵ���80����С��90
			System.out.println("��");
		else if(score >= 60)//ͬ��
			System.out.println("��");
		else
			System.out.println("��");
	}
}
