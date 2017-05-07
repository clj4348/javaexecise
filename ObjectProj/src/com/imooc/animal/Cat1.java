package com.imooc.animal;

/**
 * 宠物猫类
 * 
 * @author imooc
 */
public class Cat1 {
	// 成员属性：昵称、年龄、体重、品种
	// 修改属性的可见性---private 限定只能在当前类内访问
	private String name;// 昵称 String类型默认值为null

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <= 0)
			System.out.println("输入信息错误，宠物猫的年龄必须大于0");
		else
			this.month = month;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	private int month;// 年龄 int类型默认值为0
	private double weight;// 体重 double类型默认值为0.0
	private String species;// 品种

	public Cat1() {
	}
	
	public Cat1(int month){
		this.setMonth(month);
	}
	// 创建get/set方法
	// 在get/set方法中添对属性的限定
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "我是一只名叫" + this.name + "宠物猫";
	}

	// 成员方法：跑动、吃东西
	// 跑动的方法
	public void run() {
		this.eat();
		System.out.println("小猫快跑");
	}

	public void run(String name) {
		System.out.println(name + "快跑");
	}

	public Cat1(String name, int month, double weight, String species) {
		this();
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
	}

	// 吃东西的方法
	public void eat() {
		System.out.println("小猫吃鱼");
	}
}
