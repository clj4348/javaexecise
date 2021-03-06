package com.imooc.animal;

public class Cat extends Animal {
	private double weight;// 体重
	// public int temp = 300;
	public static int st3 = 44;
	private static int st1 = 22;
	public static int st2 = 23;
	static {
		System.out.println("我是子类的静态代码块");
	}

	{
		System.out.println("我是子类的构造代码块");
	}

	public Cat() {
		//Animal temp = new Animal();
		// temp.
		// this.temp = 12;
		// this.month = 23;
		// this.species = "";
		System.out.println("我是子类的无参构造方法");
	}
	
	public Cat(String name,int month){
		//子类构造默认调用父类无参构造方法，可以通过super()调用父类允许被访问的其他构造方法
		//super()必须放在子类构造方法有效代码第一行
		
		super(name,month);//this
		//this();
		System.out.println("我是子类的带参构造方法");
	}
	
	/*
	 * this:当前类对象的引用
	 * 访问当前类的成员方法
	 * 访问当前类的成员属性
	 * 访问当前类的构造方法
	 * 不能在静态方法中使用
	 */
	
	/*
	 * super:父类对象的引用
	 * 访问父类的成员方法
	 * 访问父类的成员属性
	 * 访问父类的构造方法
	 * 不能在静态方法中使用
	 */
	//静态方法
	public static void say(){
		//this or super是不能在静态方法调用的
		//this.weight = 20;
		//super.name = "aa";
	}
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// 跑动的方法
	public void run() {
		eat();
		System.out.println(this.getName() + "是一只" + this.getSpecies() + ",它在快乐的奔跑");
	}
}
