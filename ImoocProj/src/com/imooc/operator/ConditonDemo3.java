package com.imooc.operator;

public class ConditonDemo3 {
	public static void main(String[]args){
		int a = 10,b=7;
		//求a和b的最大值
		int max;//最大值
		if(a>b){
			max = a;
		}else{
			max = b;
		}
		System.out.println("max="+max);
		max = a>b?a:b;
		System.out.println("max="+max);
		boolean b1 = a>b?(3<6):(true == false); 
		System.out.println(b1);
	}
}