package com.imooc.tel;

public class FourthPhone extends ThirdPhone implements IPhoto {
	// public void photo(){
	// System.out.println("�ֻ���������");
	// }

	public void network() {
		System.out.println("�ֻ���������");
	}

	public void game() {
		System.out.println("�ֻ���������Ϸ");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("�ֻ���������");
	}
}