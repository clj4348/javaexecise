package com.imooc.circus;

public class Parrot extends Animal implements IACT {
	//�������ԣ�Ʒ��
	private String breed;
	//��ȡ����ֵ�ķ���
	public Parrot(String name,int age,String breed){
		super(name,age);
		this.setBreed(breed);
	}
	//get/set����
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	//������Ϣ
	public String massage(){
		return "�����ߣ�" + this.getName()+"\n���䣺"+ this.getAge()+"��\nƷ�֣�"+ this.getBreed();
	}

	
	//��д����ĳ���love()
	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("���ã�ϲ���Լ��������");
	}
}
