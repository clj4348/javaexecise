package com.imooc.test;
import com.imooc.car.Car;
public class Test {
	public static void main(String[] args) {
		// 实例化父类对象，并传入两组相同的属性值
		Car car1 = new Car("紫色","张小泉");
		// 调用父类use方法
		car1.use();
		// 通过重写equals方法，比较两个对象是否相等

		System.out.println("===================");
		
		//实例化子类Taxi对象，并传入属性值
		
		//调用ride和use方法
		
		//输出重写toString后的taxi信息
		
		System.out.println("===================");
		
		//实例化子类HomeCar对象，并传入属性值
		
		//调用dispaly方法值及它的重载方法
	}

}
