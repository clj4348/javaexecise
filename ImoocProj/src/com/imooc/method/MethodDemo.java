package com.imooc.method;

import java.util.Scanner;

public class MethodDemo {
	// ��ӡ����Ǻŵķ���
	public void printStar() {
		System.out.println("***********************");
	}

	public static void main(String[] args) {
		//����һ��MethodDemo��Ķ���myMethodDemo
		MethodDemo myMethodDemo = new MethodDemo();
		//ʹ�ö�����.������()ȥ���÷���
		myMethodDemo.printStar();
		System.out.println("��ӭ����java�����磡");
		myMethodDemo.printStar();
	}

}
