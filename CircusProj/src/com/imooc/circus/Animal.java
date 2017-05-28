package com.imooc.circus;

public abstract class Animal {
	//属性：姓名，年龄
	private String name;
	private int age;
	//无参构造
	public Animal(){
		
	}
	//带参构造构造
	public Animal(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	
	//get/set方法
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
	
	//抽象方法
	public abstract void love();
	

}
