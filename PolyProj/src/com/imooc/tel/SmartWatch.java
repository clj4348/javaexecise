package com.imooc.tel;

public class SmartWatch implements INet,IPhoto{
	public static final int TEMP = 30;
	
	public void call() {
		System.out.println("�����ֱ���Դ�绰");
	}

	public void message() {
		System.out.println("�����ֱ�����淢����");
	}

	public void network() {
		System.out.println("�����ֱ��������");
	}
	
	public void music() {
		System.out.println("�����ֱ����������");
	}
	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	public void connection() {
		System.out.println("SmartWatch�е�connection");
	}
}
