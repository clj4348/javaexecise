package com.imooc.animal;

public class Cat extends Animal {
	private double weight;// ����
	// public int temp = 300;
	public static int st3 = 44;
	private static int st1 = 22;
	public static int st2 = 23;
	static {
		System.out.println("��������ľ�̬�����");
	}

	{
		System.out.println("��������Ĺ�������");
	}

	public Cat() {
		//Animal temp = new Animal();
		// temp.
		// this.temp = 12;
		// this.month = 23;
		// this.species = "";
		System.out.println("����������޲ι��췽��");
	}
	
	public Cat(String name,int month){
		//���๹��Ĭ�ϵ��ø����޲ι��췽��������ͨ��super()���ø������������ʵ��������췽��
		//super()����������๹�췽����Ч�����һ��
		
		super(name,month);//this
		//this();
		System.out.println("��������Ĵ��ι��췽��");
	}
	
	/*
	 * this:��ǰ����������
	 * ���ʵ�ǰ��ĳ�Ա����
	 * ���ʵ�ǰ��ĳ�Ա����
	 * ���ʵ�ǰ��Ĺ��췽��
	 * �����ھ�̬������ʹ��
	 */
	
	/*
	 * super:������������
	 * ���ʸ���ĳ�Ա����
	 * ���ʸ���ĳ�Ա����
	 * ���ʸ���Ĺ��췽��
	 * �����ھ�̬������ʹ��
	 */
	//��̬����
	public static void say(){
		//this or super�ǲ����ھ�̬�������õ�
		//this.weight = 20;
		//super.name = "aa";
	}
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// �ܶ��ķ���
	public void run() {
		eat();
		System.out.println(this.getName() + "��һֻ" + this.getSpecies() + ",���ڿ��ֵı���");
	}
}