package com.imooc.test;

import com.imooc.animal.Cat2;//加载com.imooc.animal下指定的Cat类

public class Test1 {
	public static void main(String[] args) {
		Cat2 one = new Cat2();
		one.run("花花");
		Cat2 two = new Cat2();
	}
}
