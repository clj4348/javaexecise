package com.imooc.test;

public class FatherTest {
	/*
	 * ע�⵱������д�����׳��쳣�ķ���ʱ���������쳣�����Ǹ��෽���������쳣��ͬ������ࡣ
	 */
	public void test() throws HotelAgeException{
		throw new HotelAgeException();
	}
}

class SubException extends HotelAgeException{
	
}