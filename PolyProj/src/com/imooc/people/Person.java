package com.imooc.people;

public class Person {
	public static int age;

	public Object getHeart() {
		//�����ڲ���
		/*1�������ڷ����ڲ������÷�ΧҲ�ڷ�����
		 *2���ͷ����ڲ���Աʹ�ù���һ����classǰ�治�������public��private��protected��static
		 *3�����в��ܰ�����̬��Ա
		 *4�����п��԰���final��abstract���γ�Ա
		 *���Ƽ������ַ���
		 */
		class Heart {
			public int age = 13;
			int temp = 22;

			public void say() {
				System.out.println("hello");
			}

			public String beat() {
				new Person().eat();
				return Person.age + "�������������";
			}
		}
		return new Heart().beat();
		// new Heart().temp=12;
		// temp = 33;
		// return new Heart();
	}

	public void eat() {
		System.out.println("�˻�Զ���");
	}

	// ��Ա�ڲ���
	/*
	 * 1���ڲ������ⲿʹ��ʱ���޷�ֱ��ʵ��������Ҫ�����ⲿ����Ϣ�������ʵ���� 2���ڲ���ķ������η����������⣬���Ƿ��ʷ�Χ���ܵ�Ӱ��
	 * 3���ڲ������ֱ�ӷ���β����ĳ�Ա��������ֳ���ͬ�����ԣ����ȷ����ڲ����ж���� 4������ʹ��β����.this.��Ա�ķ�ʽ�������ⲿ����ͬ������Ϣ
	 * 5���ⲿ������ڲ�����Ϣ����Ҫͨ���ڲ���ʵ�����޷�ֱ�ӷ��� 6���ڲ�������.class�ļ��������ⲿ��$�ڲ���.class
	 * 7���ڲ������Ƿ���԰������ⲿ����ͬ����ǩ���ķ���
	 */
	// public class Heart{
	// int age = 13;
	// int temp = 22;
	// //public void eat(){...}
	// public String beat(){
	// eat();
	// return Person.this.age + "�������������";
	// }
	// }

	// ��̬�ڲ���
	/*
	 * 1�� ��̬�ڲ����У�ֻ��ֱ�ӷ����ⲿ��ľ��췽���������Ҫ���þ�̬��Ա������ͨ������ʵ�� 2����̬�ڲ������ʵ��ʱ�����Բ��������ⲿ�����
	 * 3������ͨ���ⲿ�ࡢ�ڲ���.��̬��Ա�ķ�ʽ�������ڲ����еľ�̬��Ա 4�����ڲ����������ⲿ������ͬ��ʱ��Ĭ��ֱ�ӵ����ڲ����еĳ�Ա��
	 * �����Ҫ�����ⲿ���еľ�̬���ԣ������ͨ���ⲿ��.���� �ķ�ʽ�� �����Ҫ�����ⲿ���еķǾ�̬���ԣ�new �ⲿ��().���� �ķ�ʽ��
	 */
	// public static class Heart{
	// public static int age = 13;
	// int temp = 22;
	// public static void say(){
	// System.out.println("hello");
	// }
	// public String beat(){
	// new Person().eat();
	// return Person.age + "�������������";
	// }
	// }

}
