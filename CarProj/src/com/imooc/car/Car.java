package com.imooc.car;

public class Car {
	//���ԣ�������ɫcolor����������userName
	private String color;
	private String userName;
	
	public Car(){
		
	}
	//���ι��캯��������Ϊcolor��useName��
	public Car(String color,String userName){
		
	}
	//ͨ����װʵ�ֶ�˽�����Ե�get/set����
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	//�����޲��޷���ֵ�÷���use����������Ϊ�����ǻ���������
	public void use(){
		System.out.println("���ǻ�������");
	}
	//��дequals�������Ƚ����������Ƿ���ȣ��Ƚ�color,userName��
	
}