package com.imooc.method;

public class ArrayDemo {
	//����һ�������޸�ĳ������Ԫ��ֵ�÷���
	public void updateArray(int[] a){
		a[3] = 15;
		System.out.println("����a��Ԫ��Ϊ��");
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
		System.out.println("������������ai��Ԫ��Ϊ��");
		for(int n:a1){
			System.out.print(n+" ");
		}
		System.out.println();
		ad.updateArray(a1);
		System.out.println("������������a1��Ԫ�أ�");
		for(int n:a1){
			System.out.print(n+"  ");
		}
	}

}
