package com.imooc.tel;

/*
 * ԭʼ�ֻ�
 */
public class Telphone {
	private String brand;
	private int price;

	public Telphone() {

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//��绰
	public void call() {
		System.out.println("�ֻ����Դ�绰");
	}

}