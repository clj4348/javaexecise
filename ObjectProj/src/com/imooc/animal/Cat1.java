package com.imooc.animal;

/**
 * ����è��
 * 
 * @author imooc
 */
public class Cat1 {
	// ��Ա���ԣ��ǳơ����䡢���ء�Ʒ��
	// �޸����ԵĿɼ���---private �޶�ֻ���ڵ�ǰ���ڷ���
	private String name;// �ǳ� String����Ĭ��ֵΪnull

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <= 0)
			System.out.println("������Ϣ���󣬳���è������������0");
		else
			this.month = month;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	private int month;// ���� int����Ĭ��ֵΪ0
	private double weight;// ���� double����Ĭ��ֵΪ0.0
	private String species;// Ʒ��

	public Cat1() {
	}
	
	public Cat1(int month){
		this.setMonth(month);
	}
	// ����get/set����
	// ��get/set������������Ե��޶�
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "����һֻ����" + this.name + "����è";
	}

	// ��Ա�������ܶ����Զ���
	// �ܶ��ķ���
	public void run() {
		this.eat();
		System.out.println("Сè����");
	}

	public void run(String name) {
		System.out.println(name + "����");
	}

	public Cat1(String name, int month, double weight, String species) {
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
