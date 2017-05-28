package com.imooc.test;

public class FatherTest {
	/*
	 * 注意当子类重写父类抛出异常的方法时，声明的异常必须是父类方法所声明异常的同类或子类。
	 */
	public void test() throws HotelAgeException{
		throw new HotelAgeException();
	}
}

class SubException extends HotelAgeException{
	
}