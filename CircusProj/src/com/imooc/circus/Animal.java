package com.imooc.circus;

public abstract class Animal {
	//���ԣ�����������
	private String name;
	private int age;
	//�޲ι���
	public Animal(){
		
	}
	//���ι��칹��
	public Animal(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	
	//get/set����
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	//���󷽷�
	public abstract void love();
	

}
