package com.imooc.worktest;

import com.imooc.work.DevelopmentWork;
import com.imooc.work.TestWork;
import com.imooc.work.Work;

public class Test {
	public static void main(String[] args) {
		Work one = new Work();
		TestWork two = new TestWork(10, 10);
		DevelopmentWork three = new DevelopmentWork(1000, 10);
		System.out.println("������Ϣ���ԣ�" + one.work());
		System.out.println("���Թ�������Ϣ���ԣ�" + two.work());
		System.out.println("�з���������Ϣ���ԣ�" + three.work());
	}
}