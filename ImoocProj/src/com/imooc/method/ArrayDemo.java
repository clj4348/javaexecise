package com.imooc.method;

public class ArrayDemo {
	//定义一个用于修改某个数组元素值得方法
	public void updateArray(int[] a){
		a[3] = 15;
		System.out.println("数组a的元素为：");
		for(int n:a){
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();
		int[] a1={1,2,3,4,5};
		System.out.println();
		ad.updateArray(a1);
		System.out.println("方法调用数组ai的元素为：");
		for(int n:a1){
			System.out.print(n+" ");
		}
		System.out.println();
		ad.updateArray(a1);
		System.out.println("方法调用数组a1的元素：");
		for(int n:a1){
			System.out.print(n+"  ");
		}
	}

}
