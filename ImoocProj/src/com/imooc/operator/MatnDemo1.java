package com.imooc.operator;

public class MatnDemo1 {
	public static void main(String[]args){
		int num1=10,num2=5;
		int result;//存放结果
		//加法
		result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);
		//字符串链接
		System.out.println(""+num1+num2);
		//减法
		result = num1-num2;
		System.out.println(num1+"-"+num2+"="+result);
		//乘法
		result = num1*num2;
		System.out.println(num1+"*"+num2+"="+result);
		//乘法
		result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		//分子分母都是整型时，结果为整除后的结果
		System.out.println(13/5);
		//分子后有0是，结果为真实结果；
		System.out.println(13.0/5);
		//求余数
		result = 13%num2;
		System.out.println("13%"+num2+"="+result);
		System.out.println("13%5="+(13.5%5));
	}
}
