package com.imooc.flow;

public class intCompare {
	public static void main(String[] args){
		//定义两个整形变量并初始化
		int x = 5,y = 5;
		//判断x和y是否相等
		if(x!=y){
			if(x>y){
				System.out.println(x+"大于"+y);
			}else{
				System.out.println(x+"小于"+y);
			}
		}else{
			System.out.println(x+"和"+y+"相等");
		}
	}
}
