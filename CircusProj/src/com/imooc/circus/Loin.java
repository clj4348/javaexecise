package com.imooc.circus;

public class Loin extends Animal implements IACT{
	//�������ԣ��Ա���ɫ
	private String sex;
	private String color;
	
	//��ȡ����ֵ�ķ���
	public Loin(String name,int age, String sex,String color){
		super(name,age);
		this.setSex(sex);
		this.setColor(color);
	}
	
	//get/set����
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	//������Ϣ
	public String massage(){
		return "�����ߣ�" + this.getName()+"\n���䣺"+ this.getAge()+"��\n�Ա�"+ this.getSex() +"\nëɫ��" + this.getColor();
	}
	//��д����love�ĳ�����
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("���ã�ϲ���Ը�������");
	}
}
