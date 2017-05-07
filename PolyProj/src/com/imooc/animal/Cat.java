package com.imooc.animal;

public class Cat extends Animal {
	// 属性：体重
	private double weight;

	public Cat() {

	}

	public Cat(String name, int month, double weight) {
		super(name, month);
		// set和super方法都可以完成父类的属性赋值
		this.setMonth(month);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// 方法：跑动
	public void run() {
		System.out.println("小猫快乐的奔跑");
	}

	// 方法：吃东西(重写父类方法)
	@Override
	public void eat() {
		System.out.println("猫吃鱼~~");
	}

	@Override
	public void say() {
		System.out.println("小猫碰胡须");
	}

	public void playBall() {
		System.out.println("小猫喜欢玩线球");
	}
}
