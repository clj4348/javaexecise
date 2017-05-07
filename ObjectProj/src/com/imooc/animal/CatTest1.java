package com.imooc.animal;

public class CatTest1 {
	public static void main(String[] args) {
		// 对象实例化
		Cat1 one = new Cat1(3);
		//one.setName("凡凡");
		//one.setMonth(3);
		//System.out.println("昵称：" + one.getName());
		if(one.getMonth() == 0){
			return;
		}
		System.out.println("年龄：" + one.getMonth());
	}
}
