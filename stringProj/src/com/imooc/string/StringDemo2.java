package com.imooc.string;

public class StringDemo2 {

	public static void main(String[] args) {
		//����һ���ַ�"JAVA��̻�������ϲ��java���"
		String str = new String("JAVA��̻�������ϲ��java���");
		
		//�����ַ�'A'���ַ����еĵ�һ�γ��ֵ�λ��
		System.out.println(str.indexOf('A'));
		
		//�����Ӵ�"���"���ַ��е�һ�γ��ֵ�λ��
		System.out.println("�Ӵ�\"���\"���ַ����е�һ�γ��ֵ�λ��"+str.indexOf("���"));
	
		//�����ַ�'A'���ַ��������һ�γ��ֵ�λ��
		System.out.println("�Ӵ�'A'���ַ����е�һ�γ��ֵ�λ��"+str.lastIndexOf('A'));
	
		//�����Ӵ�"���"���ַ��������һ�γ��ֵ�λ��
		System.out.println("�Ӵ�\"���\"���ַ��������һ�γ��ֵ�λ��"+str.lastIndexOf("���"));
		
		//���ַ���indexֵΪ8��λ�ÿ�ʼ�������Ӵ�"���"��һ�γ��ֵ�λ��
		System.out.println(str.indexOf("���",8));
	}

}