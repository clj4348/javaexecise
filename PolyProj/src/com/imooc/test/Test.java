package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {
	public static void main(String[] args) {
		Animal one = new Animal();// 1
		/*
		 * ����ת�͡���ʽת�͡��Զ�ת��--�� ��������ָ������ʵ�������Ե���������д����ķ����Լ����������ķ������޷�����������з���
		 * ע�⣺����ľ�̬�����޷���������д����������ת��֮��ֻ�ܵ��õ�����ԭ�еľ�̬����
		 * С��ת��Ϊ����
		 */
		Animal two = new Cat();// 2
		Cat cat = new Cat();
		two = cat;
		Animal three = new Dog();// 3

		one.eat();
		two.eat();
		two.setMonth(2);
		two.getMonth();
		three.eat();
		System.out.println("===================");
		/*
		 * ����ת�͡�ǿ�����ʹ��� ��������ָ������󣬴˴��������ǿ��ת�������Ե����������еķ��� ��������ת���������ܹ�ת��
		 * instanceof�����������true/fase
		 */
		if (two instanceof Cat) {
			Cat temp = (Cat) two;
			temp.eat();
			temp.run();
			temp.getMonth();
			System.out.println("two����ת��ΪCat����");
		}

		if (two instanceof Dog) {
			Dog temp2 = (Dog) two;
			temp2.eat();
			temp2.sleep();
			temp2.getSex();
			System.out.println("two����ת��ΪDog����");
		}
		
		if(two instanceof Animal){
			System.out.println("Aimal");
		}
		
		if(two instanceof Object){
			System.out.println("Object");
		}

	}
}