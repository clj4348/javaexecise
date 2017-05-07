package com.imooc.animal;

//�����ࣺ������ʵ����������ͨ������ת�ͣ�ָ������ʵ��
public abstract class Animal {
	//���ԣ��ǳơ�����
	private String name;
	private int month;
	
	public Animal(){
		
	}
	
	public Animal(String name,int month){
		this.name = name;
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	//�������Զ���
	//���󷽷������������������壻��������Ҫ��д����ĳ��󷽷�,��������Ҳ�ǳ�����
	//static��̬�� ; final���յ�;private˽�е�;������abstract����
	public abstract void eat();
	
	public void say(){
		System.out.println("�������к�");
	}
}