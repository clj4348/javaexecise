package com.imooc.circus;

public class Bear extends Animal implements IACT {
	//通过父类的属性赋值
	public Bear(String name, int age){
		super(name,age);
	}
	//返回表演者和年龄的信息
	public String massage(){
		return "表演者：" + this.getName()+"\n年龄："+ this.getAge()+"岁";
	}
	//重写父类的抽象方法
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("爱好：喜欢卖萌");
	}
}
