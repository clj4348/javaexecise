package com.imooc.animal;

//static + ��--�� ������
public class Cat2 {
	// ��Ա���ԣ��ǳơ����䡢���ء�Ʒ��
	// �޸����ԵĿɼ���---private �޶�ֻ���ڵ�ǰ���ڷ���
	private String name;// �ǳ� String����Ĭ��ֵΪnull
	private int month;// ���� int����Ĭ��ֵΪ0
	private double weight;// ���� double����Ĭ��ֵΪ0.0
	private String species;// Ʒ��

	// static: ��̬ ��̬��Ա�����Ա
	// static+����--�� ��̬���ԡ�������
	public static int price;// �ۼ�

	// ���췽��
	public Cat2() {
		// static + ������ľֲ�����
		int temp = 14;
		System.out.println("���ǳ���è");
	}

	public Cat2(int month) {
		this.setMonth(month);
	}

	// ��������
	// ��������ʱ���ã������ڹ��췽��ִ��
	{
		name = "��";
		price = 130;
		System.out.println("���ǹ�������1");
	}// ��������

	static {
		price = 290;
		Cat temp = new Cat();
		temp.name = "С��";
		System.out.println("���Ǿ�̬�����2");
	}// ��̬�����

	// ����get/set����
	// ��get/set��������Ӷ����Ե��޶�
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "����һֻ���У�" + this.name + "�ĳ���è";
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month <= 0)
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

	// ��Ա�������ܶ����Զ���
	// �ܶ��ķ���
	// �ڳ�Ա�����У�����ֱ�ӷ������о�̬��Ա
	public void run() {
		eat();
		this.name = "��";
		this.price = 20;
		System.out.println("�ۼ���" + Cat2.price + "��" + this.name + "����");
	}

	public void run(String name) {
		// ��ͨ����飺
		// ѭ��ִ�У��ȳ��֣���ִ��
		{
			int temp = 12;
			System.out.println("������ͨ�����1temp=" + temp);
		} // ��ͨ�����
		System.out.println(name + "����");
		{
			int temp = 13;
			System.out.println("���Ǿ�̬�����2temp=" + temp);
		}
	}

	// �Զ����ķ���
	// static + ����--�� �෽������̬����
	public static void eat() {
		// ��̬�����в���ֱ�ӷ���ͬһ�����еķǾ�̬��Ա��ֻ��ֱ�ӵ���ͬһ�����еľ�̬��Ա
		// ֻ��ͨ������ʵ�����󣬶���.��Ա�����ķ�ʽ���ʷǾ�̬��Ա
		Cat2 temp = new Cat2();
		temp.run();// ��̬�����в���ֱ�ӷ��ʷǾ�̬��Ա��ֻ��ֱ�ӵ��þ�̬��Ա
		temp.name = "С��";// ��̬�����в���ʹ��this
		temp.name = "С��";
		price = 1500;
		System.out.println("Сè����");
	}

}
