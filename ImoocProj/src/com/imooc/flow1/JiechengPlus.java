package com.imooc.flow1;

public class JiechengPlus {
	public static void main(String[] args) {
		//int������Ľ׳���̫��ᵼ���ڴ���������ó�����
		//�������̫��Ҳ��һ�������ڴ����;��Ϊ����
		long s = 1, sum = 0;
		for (int i = 1; i <= 25; i++) {
			s = 1;
			for (int j = 1; j <= i; j++) {
				s=s*j;//s��Ž׳˼���Ľ��
			}
			sum = sum + s;
		}
		System.out.println("1!+2!+3!+4!+...+10="+sum);
		System.out.println("**********************");
		System.out.println("***************");
		System.out.println("*******************");
	}
}
