package com.imooc.test;

import com.imooc.people.Person;

public class PeopleTest {
	public static void main(String[] args) {
		Person lili = new Person();
		lili.age = 12;

		/*
		 * //��ȡ�ڲ������ʵ������ʽ1��new �ⲿ��.new �ڲ��� Person.Heart myHeart = new
		 * Person().new Heart(); System.out.println(myHeart.beat());
		 * 
		 * //��ȡ�ڲ������ʵ������ʽ2���ⲿ�����.new �ڲ��� myHeart=lili.new Heart();
		 * System.out.println(myHeart.beat());
		 * 
		 * //��ȡ�ڲ������ʵ������ʽ3���ⲿ�����.��ȡ���� myHeart=lili.getHeart();
		 * System.out.println(myHeart.beat());
		 */

		// ��ȡ��̬�ڲ������ʵ��
		// Person.Heart myHeart = new Person.Heart();
		// System.out.println(myHeart.beat());
		// Person.Heart.say();
		
		System.out.println(lili.getHeart());
	}
}
