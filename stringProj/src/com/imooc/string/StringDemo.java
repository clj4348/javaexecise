package com.imooc.string;

public class StringDemo {

	public static void main(String[] args) {
		//����һ���ַ���JAVA��̻���
		String str = "JAVA ��� ����";
		//��ӡ����ַ����ĳ���
		System.out.println(str.length());
		
		//ȡ���ַ�'��'�������charAt(int index)
		System.out.println(str.charAt(6));
		
		//ȡ���Ӵ�"��� ����"�����
		System.out.println(str.substring(5));
		
		//ȡ���Ӵ�"���"�����
		System.out.println(str.substring(5,7));
	}
	
}
