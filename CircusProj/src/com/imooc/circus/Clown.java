package com.imooc.circus;

public class Clown implements IACT{
	//���»�ȡ����:name,age;
	private String name;
	private int age;
	
	//�޲ι��췽��
	public Clown(){
		
	}
	
	//���ι��췽��
	public Clown(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	//set/get����
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	//���ر����ߵ�������������
	public String massage(){
		return "�����ߣ�" + this.getName()+"\n���䣺"+ this.getAge();
	}
	
	public void dress() {
		System.out.println("����ʷ�װ��ͷ�ϴ��Ų�ɫ��ñ�ӣ����ϻ��ſ��ŵĲ�ױ");
	}
}
