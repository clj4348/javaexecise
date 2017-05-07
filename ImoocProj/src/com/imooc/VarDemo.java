package com.imooc;

public class VarDemo {
	public static void main(String[] args){
		//定义两个整型变量x,y
		int x,y;
		x=3;
		y=5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.print(x+"\t"+y+"\n");
		System.out.print(""+x+'\t'+y+'\n');
		//System.out.println();//换行
		System.out.println(x+","+y);
		System.out.println("\n\'"+x+"\'");
		//定义一个汉字的字符
		char ch='幕';
		System.out.println(ch);
		//用科学计数法表示浮点型数据
		//E代表10的多少次方
		double d=1.23E5;
		float f=1.23e5f;
		double d1 =.2;
		System.out.println(d);
		System.out.println(f);
		System.out.println(d1);
	}
}
