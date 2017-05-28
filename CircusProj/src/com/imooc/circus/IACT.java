package com.imooc.circus;

public interface IACT {
	//接口默认方法
	default void connection(String skill){
		System.out.println("技能："+skill);
	}
}
