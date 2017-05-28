package com.imooc.string;

public class StringDemo {

	public static void main(String[] args) {
		//定义一个字符串JAVA编程基础
		String str = "JAVA 编程 基础";
		//打印输出字符串的长度
		System.out.println(str.length());
		
		//取出字符'程'并输出：charAt(int index)
		System.out.println(str.charAt(6));
		
		//取出子串"编程 基础"并输出
		System.out.println(str.substring(5));
		
		//取出子串"编程"并输出
		System.out.println(str.substring(5,7));
	}
	
}
