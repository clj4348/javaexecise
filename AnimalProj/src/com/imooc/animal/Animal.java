package com.imooc.animal;

public class Animal {
	/*
	 * private:只允许在本类中进行访问 public:允许在任意位置访问
	 * protected:允许在当前类、同包子类/非子类、挎包子类调用、跨包非子类不允许
	 * 默认：允许在当前类、同包子类调用正常、跨包子类/非子类是不允许调用的
	 */
	private String name = "妮妮";// 昵称
	protected int month;// 月份
	String species = "动物";// 品种
	public int temp = 15;

	private static int st1 = 22;
	public static int st2 = 23;

	static {
		System.out.println("我是父类的静态代码块");
	}

	{
		System.out.println("我是父类的构造代码块");
	}

	// 无参构造方法
	// 父类的构造不允许被继承、不允许被重写//?
	public Animal() {
		month = 2;
		System.out.println("我是父类的无参构造方法");
	}

	public Animal(String name, int month) {
		this.name = name;
		this.month = month;
		System.out.println("我是父类的带参构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	// 吃东西
	public void eat() {
		System.out.println(this.getName() + "吃东西");
	}

	public void eat(String name) {
		System.out.println(name + "吃东西");
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		// 强制转换
		Animal temp = (Animal) obj;
		if (this.getName().equals(temp.getName()) && (this.getMonth() == temp.getMonth()))
			return true;
		else
			return false;
	}

	public boolean equals(Animal obj) {
		if (obj == null)
			return false;
		if (this.getName().equals(obj.getName()) && (this.getMonth() == obj.getMonth()))
			return true;
		else
			return false;
	}

	public String toString() {
		return "昵称：" + this.getName() + "；年龄：" + this.getMonth();
	}
	
	public Animal create(){
		return new Animal();
	}
}

/*
 * final class:该类没有子类 public final class\final public class final
 * 方法：该方法不允许被子类重写,但是可以正常被子类继承使用 final 方法内局部变量:只要在具体被使用之前进行赋值即可，一旦赋值不要允许被修改
 * 类中成员属性：赋值过程：1、定义直接初始化 2、构造方法 3、构造代码块
 */
// public class Animal {
// /*
// * private:只允许在本类中进行访问 public:允许在任意位置访问
// * protected:允许在当前类、同包子类/非子类、挎包子类调用、跨包非子类不允许
// * 默认：允许在当前类、同包子类调用正常、跨包子类/非子类是不允许调用的
// */
// private String name = "妮妮";// 昵称
// protected int month;// 月份
// String species = "动物";// 品种
// public static final int temp = 12;
//
// private static int st1 = 22;
// public static int st2 = 23;
//
// static {
// System.out.println("我是父类的静态代码块");
// }
//
// {
// System.out.println("我是父类的构造代码块");
// }
//
// // 无参构造方法
// // 父类的构造不允许被继承、不允许被重写//?
// public Animal() {
// month = 2;
// System.out.println("我是父类的无参构造方法");
// }
//
// public Animal(String name, int month) {
// this.name = name;
// this.month = month;
// System.out.println("我是父类的带参构造方法");
// }
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// public int getMonth() {
// return month;
// }
//
// public void setMonth(int month) {
// this.month = month;
// }
//
// public String getSpecies() {
// return species;
// }
//
// public void setSpecies(String species) {
// this.species = species;
// }
//
// // 吃东西
// public final void eat() {
// System.out.println(this.getName() + "吃东西");
// }
//
// public void eat(String name) {
// final int temp;// 方法内的局部变量
// // temp =12;
// System.out.println(name + "吃东西");
// temp =12;
// System.out.println(temp);
//
// final Animal animal = new Animal("凡凡",1);
// //animal = new Animal();
// animal.month = 12;
// animal.name = "豆豆";
// }
//
// public boolean equals(Object obj) {
// if (obj == null)
// return false;
// // 强制转换
// Animal temp = (Animal) obj;
// if (this.getName().equals(temp.getName()) && (this.getMonth() ==
// temp.getMonth()))
// return true;
// else
// return false;
// }
//
// public boolean equals(Animal obj) {
// if (obj == null)
// return false;
// if (this.getName().equals(obj.getName()) && (this.getMonth() ==
// obj.getMonth()))
// return true;
// else
// return false;
// }
//
// public String toString() {
// return "昵称：" + this.getName() + "；年龄：" + this.getMonth();
// }
//
// }
