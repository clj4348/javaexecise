package com.imooc.animal;

public class CatTest1 {
	public static void main(String[] args) {
		// ����ʵ����
		Cat1 one = new Cat1(3);
		//one.setName("����");
		//one.setMonth(3);
		//System.out.println("�ǳƣ�" + one.getName());
		if(one.getMonth() == 0){
			return;
		}
		System.out.println("���䣺" + one.getMonth());
	}
}
