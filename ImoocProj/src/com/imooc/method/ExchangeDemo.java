package com.imooc.method;

public class ExchangeDemo {
	// ��������
	public void swap(int a, int b) {
		int temp;
		System.out.println("����ǰ:a=" + a + ",b=" + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("������a=" + a + ",b=" + b);
	}
	
	public void swapTest(){
		int m = 4, n = 5;
		ExchangeDemo ed = new ExchangeDemo();
		System.out.println("����ǰ��m=" + m + ",n=" + n);
		swap(m, n);
		System.out.println("������m=" + m + ",n=" + n);
	}
	
	public static void main(String[] args) {
		ExchangeDemo ed = new ExchangeDemo();
		ed.swapTest();
	}

}