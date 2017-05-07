package com.imooc.animal;

//static + 类--》 不存在
public class Cat2 {
	// 成员属性：昵称、年龄、体重、品种
	// 修改属性的可见性---private 限定只能在当前类内访问
	private String name;// 昵称 String类型默认值为null
	private int month;// 年龄 int类型默认值为0
	private double weight;// 体重 double类型默认值为0.0
	private String species;// 品种

	// static: 静态 静态成员、类成员
	// static+属性--》 静态属性、类属性
	public static int price;// 售价

	// 构造方法
	public Cat2() {
		// static + 方法类的局部变量
		int temp = 14;
		System.out.println("我是宠物猫");
	}

	public Cat2(int month) {
		this.setMonth(month);
	}

	// 构造代码块
	// 创建对象时调用，优先于构造方法执行
	{
		name = "妞妞";
		price = 130;
		System.out.println("我是构造代码块1");
	}// 构造代码块

	static {
		price = 290;
		Cat temp = new Cat();
		temp.name = "小胖";
		System.out.println("我是静态代码块2");
	}// 静态代码块

	// 创建get/set方法
	// 在get/set方法中添加对属性的限定
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "我是一只名叫：" + this.name + "的宠物猫";
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month <= 0)
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

	// 成员方法：跑动、吃东西
	// 跑动的方法
	// 在成员方法中，可以直接访问类中静态成员
	public void run() {
		eat();
		this.name = "妞妞";
		this.price = 20;
		System.out.println("售价是" + Cat2.price + "的" + this.name + "快跑");
	}

	public void run(String name) {
		// 普通代码块：
		// 循序执行，先出现，先执行
		{
			int temp = 12;
			System.out.println("我是普通代码块1temp=" + temp);
		} // 普通代码块
		System.out.println(name + "快跑");
		{
			int temp = 13;
			System.out.println("我是静态代码块2temp=" + temp);
		}
	}

	// 吃东西的方法
	// static + 方法--》 类方法、静态方法
	public static void eat() {
		// 静态方法中不能直接访问同一个类中的非静态成员，只能直接调用同一个类中的静态成员
		// 只能通过对象实例化后，对像.成员方法的方式访问非静态成员
		Cat2 temp = new Cat2();
		temp.run();// 静态方法中不能直接访问非静态成员，只能直接调用静态成员
		temp.name = "小胖";// 静态方法中不能使用this
		temp.name = "小胖";
		price = 1500;
		System.out.println("小猫吃鱼");
	}

}
