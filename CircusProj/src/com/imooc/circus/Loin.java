package com.imooc.circus;

public class Loin extends Animal implements IACT{
	//新增属性：性别，颜色
	private String sex;
	private String color;
	
	//获取父类值的方法
	public Loin(String name,int age, String sex,String color){
		super(name,age);
		this.setSex(sex);
		this.setColor(color);
	}
	
	//get/set方法
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	//返回信息
	public String massage(){
		return "表演者：" + this.getName()+"\n年龄："+ this.getAge()+"岁\n性别："+ this.getSex() +"\n毛色：" + this.getColor();
	}
	//重写父类love的抽象函数
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("爱好：喜欢吃各种肉类");
	}
}
