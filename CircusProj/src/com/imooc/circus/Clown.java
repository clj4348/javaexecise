package com.imooc.circus;

public class Clown implements IACT{
	//从新获取属性:name,age;
	private String name;
	private int age;
	
	//无参构造方法
	public Clown(){
		
	}
	
	//带参构造方法
	public Clown(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	//set/get方法
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
	//返回表演者的姓名，和艺龄
	public String massage(){
		return "表演者：" + this.getName()+"\n艺龄："+ this.getAge();
	}
	
	public void dress() {
		System.out.println("身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆");
	}
}
