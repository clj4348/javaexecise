package com.imooc.animal;

public abstract class Dog extends Animal {
	// ���ԣ��Ա�
	public String sex;

	public Dog() {

	}

	public Dog(String name, int month, String sex) {
		this.setMonth(month);
		this.setName(name);
		this.setSex(sex);
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// ������˯��
	public void sleep() {
		System.out.println("С������˯��ϰ��");
	}

	// �������Զ�������д���෽����
	// @Override
	// public void eat(){
	// System.out.println("������~~");
	// }
}