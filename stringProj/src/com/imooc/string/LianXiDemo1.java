package com.imooc.string;

public class LianXiDemo1 {
	public static void main(String[] args){
		//定义一个字符串"欢迎来到"
		StringBuilder s =new StringBuilder("欢迎来到");
		//在"欢迎来到"后面添加内容，将字符串变成"欢迎来到imooc"
		s.append("imooc");
		System.out.println(s);
		
		//使用delete方法删除"欢迎来到",然后插入“你好！”
		//将字符串变成“你好，imooc”
		//s.delete(0, 4).insert(0,"你好!");
		//System.out.println(s);
		
		//使用replace方法替换
		s.replace(0, 4,"你好!");
		System.out.println(s);
	}
}
