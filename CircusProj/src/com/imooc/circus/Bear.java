package com.imooc.circus;

public class Bear extends Animal implements IACT {
	//ͨ����������Ը�ֵ
	public Bear(String name, int age){
		super(name,age);
	}
	//���ر����ߺ��������Ϣ
	public String massage(){
		return "�����ߣ�" + this.getName()+"\n���䣺"+ this.getAge()+"��";
	}
	//��д����ĳ��󷽷�
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("���ã�ϲ������");
	}
}
