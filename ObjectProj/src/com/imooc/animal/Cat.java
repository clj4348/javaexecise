package com.imooc.animal;

/**
 * ����è��
 * 
 * @author imooc
 */
public class Cat {
	// ��Ա���ԣ��ǳơ����䡢���ء�Ʒ��
	String name;// �ǳ� String����Ĭ��ֵΪnull
	int month;// ���� int����Ĭ��ֵΪ0
	double weight;// ���� double����Ĭ��ֵΪ0.0
	String species;// Ʒ��
	
	public Cat() {
		System.out.println("���ǳ���è");
	}

	public Cat(String name) {
		System.out.println("���Ǵ��ι��췽��" + name);
	}

	// ���Ƽ�������д��
	// public void Cat(){
	// System.out.println("��ֻ��һ����ͨ������ǡ�÷�������Cat");
	// }
	// ��Ա�������ܶ����Զ���
	// �ܶ��ķ���
	public void run() {
		this.eat();
		System.out.println("Сè����");
	}

	public void run(String name) {
		System.out.println(name + "����");
	}

	public Cat(String name, int month, double weight, String species) {
		this();
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
	}

	// �Զ����ķ���
	public void eat() {
		System.out.println("Сè����");
	}
}
