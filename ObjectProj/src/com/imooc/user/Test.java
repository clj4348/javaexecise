package com.imooc.user;

public class Test {
	public static void main(String[] args){
		//实例化对象，调用相关方法实现运行效果
		User one = new User("Lucy","123456");
		User two = new User("Mike","123456");
		UserManager manager = new UserManager();
		System.out.println(one.getName());
		System.out.println(one.getPassword());
		System.out.println(two.getName());
		System.out.println(two.getPassword());
		System.out.println("===============");
		manager.checkUser(one,two);
	}
}
