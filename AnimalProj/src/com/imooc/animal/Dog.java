package com.imooc.animal;

public class Dog extends Animal {
	private String sex;// �Ա�

	public Dog() {

	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// ˯���ķ���
	public void sleep() {
		super.eat();
		super.species= "Ȯ��";
		System.out.println(this.getName() + "����" + this.getMonth() + "���´�ģ�����˯��~~");	    
	}

	// ��������
	// 1��ͬһ������
	// 2����������ͬ�������б���ͬ������˳�򡢸��������ͣ�
	// 3����������ֵ���������η�����
	// 4���뷽���Ĳ������޹�

	// ������д
	// 1���м̳й�ϵ��������
	// 2����������ͬ�������б���ͬ������˳�򡢸��������ͣ�����������ֵ������������������
	// 3���������η������ʷ�Χ��Ҫ���ڵ��ڸ���ķ��ʷ�Χ
	// 4���뷽���Ĳ������޹�

	// private String sleep(String name){
	// return "";
	// }
	// public void sleep(String name,int month){
	//
	// }
	// public void sleep(int month,String name){
	//
	// }
	// public void sleep(int name,String month){
	//
	// }
	// ������д����Զ�������
//	public void eat() {
//		System.out.println(this.getName() + "���û��ʳ��~~");
//	} 
	/*ע�⣺
	 * -JDK1.5�汾�����һ������
	 * -���������ڰ����ࡢ���ԡ��������ֲ����������������ȵ�
	 * ǰ�棬��������ЩԪ�ؽ���˵����ע��
	 */
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
	@Override
	public Dog create() {
		// TODO Auto-generated method stub
		return new Dog();
	}
	
}