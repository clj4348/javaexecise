package com.imooc.string;

public class LianXiDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("abc");
		s.delete(0,3).insert(0,"fed---cba");
		s.replace(3,6,"");
		System.out.println(s);
	}
}
