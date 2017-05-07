package com.imooc.flow;

import java.util.Scanner;

public class ScoreAssess {

	public static void main(String[] args) {
		/*
			成绩大于等于90分，输出“优”
		 */
		System.out.println("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >= 90)
			System.out.println("优");
		else if(score >= 80)//相当于score大于等于80并且小于90
			System.out.println("良");
		else if(score >= 60)//同理
			System.out.println("中");
		else
			System.out.println("差");
	}
}
