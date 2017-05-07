package com.imooc;

public class charDemo {
	public static void main(String[]args){
		//定义一个变量存放字符'a'
		char a = 'a';
		System.out.println("a="+a);
		//如果字面值超出char类型所表示的数据范围，需要进行强制类型转换。
		char ch1 = (char)65546;
		System.out.println("ch1="+ch1);
		//定义变量存放unicode编码表示字符
		char c='\u005d';
		System.out.println("c="+c);
	}
}
