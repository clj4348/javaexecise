package com.imooc.animal;

public class Animal {
	/*
	 * private:ֻ�����ڱ����н��з��� public:����������λ�÷���
	 * protected:�����ڵ�ǰ�ࡢͬ������/�����ࡢ���������á���������಻����
	 * Ĭ�ϣ������ڵ�ǰ�ࡢͬ����������������������/�������ǲ��������õ�
	 */
	private String name = "����";// �ǳ�
	protected int month;// �·�
	String species = "����";// Ʒ��
	public int temp = 15;

	private static int st1 = 22;
	public static int st2 = 23;

	static {
		System.out.println("���Ǹ���ľ�̬�����");
	}

	{
		System.out.println("���Ǹ���Ĺ�������");
	}

	// �޲ι��췽��
	// ����Ĺ��첻�������̳С�����������д//?
	public Animal() {
		month = 2;
		System.out.println("���Ǹ�����޲ι��췽��");
	}

	public Animal(String name, int month) {
		this.name = name;
		this.month = month;
		System.out.println("���Ǹ���Ĵ��ι��췽��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	// �Զ���
	public void eat() {
		System.out.println(this.getName() + "�Զ���");
	}

	public void eat(String name) {
		System.out.println(name + "�Զ���");
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		// ǿ��ת��
		Animal temp = (Animal) obj;
		if (this.getName().equals(temp.getName()) && (this.getMonth() == temp.getMonth()))
			return true;
		else
			return false;
	}

	public boolean equals(Animal obj) {
		if (obj == null)
			return false;
		if (this.getName().equals(obj.getName()) && (this.getMonth() == obj.getMonth()))
			return true;
		else
			return false;
	}

	public String toString() {
		return "�ǳƣ�" + this.getName() + "�����䣺" + this.getMonth();
	}
	
	public Animal create(){
		return new Animal();
	}
}

/*
 * final class:����û������ public final class\final public class final
 * �������÷�����������������д,���ǿ�������������̳�ʹ�� final �����ھֲ�����:ֻҪ�ھ��屻ʹ��֮ǰ���и�ֵ���ɣ�һ����ֵ��Ҫ�������޸�
 * ���г�Ա���ԣ���ֵ���̣�1������ֱ�ӳ�ʼ�� 2�����췽�� 3����������
 */
// public class Animal {
// /*
// * private:ֻ�����ڱ����н��з��� public:����������λ�÷���
// * protected:�����ڵ�ǰ�ࡢͬ������/�����ࡢ���������á���������಻����
// * Ĭ�ϣ������ڵ�ǰ�ࡢͬ����������������������/�������ǲ��������õ�
// */
// private String name = "����";// �ǳ�
// protected int month;// �·�
// String species = "����";// Ʒ��
// public static final int temp = 12;
//
// private static int st1 = 22;
// public static int st2 = 23;
//
// static {
// System.out.println("���Ǹ���ľ�̬�����");
// }
//
// {
// System.out.println("���Ǹ���Ĺ�������");
// }
//
// // �޲ι��췽��
// // ����Ĺ��첻�������̳С�����������д//?
// public Animal() {
// month = 2;
// System.out.println("���Ǹ�����޲ι��췽��");
// }
//
// public Animal(String name, int month) {
// this.name = name;
// this.month = month;
// System.out.println("���Ǹ���Ĵ��ι��췽��");
// }
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// public int getMonth() {
// return month;
// }
//
// public void setMonth(int month) {
// this.month = month;
// }
//
// public String getSpecies() {
// return species;
// }
//
// public void setSpecies(String species) {
// this.species = species;
// }
//
// // �Զ���
// public final void eat() {
// System.out.println(this.getName() + "�Զ���");
// }
//
// public void eat(String name) {
// final int temp;// �����ڵľֲ�����
// // temp =12;
// System.out.println(name + "�Զ���");
// temp =12;
// System.out.println(temp);
//
// final Animal animal = new Animal("����",1);
// //animal = new Animal();
// animal.month = 12;
// animal.name = "����";
// }
//
// public boolean equals(Object obj) {
// if (obj == null)
// return false;
// // ǿ��ת��
// Animal temp = (Animal) obj;
// if (this.getName().equals(temp.getName()) && (this.getMonth() ==
// temp.getMonth()))
// return true;
// else
// return false;
// }
//
// public boolean equals(Animal obj) {
// if (obj == null)
// return false;
// if (this.getName().equals(obj.getName()) && (this.getMonth() ==
// obj.getMonth()))
// return true;
// else
// return false;
// }
//
// public String toString() {
// return "�ǳƣ�" + this.getName() + "�����䣺" + this.getMonth();
// }
//
// }