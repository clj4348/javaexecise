package com.imooc.test;

import com.imooc.animal.Animal;

public class TestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal one = new Animal("����",2);
		//Animal two = new Animal("����",2);
		Animal two = null;
		/*equals����:
		 * 1���̳�Object�е�equals�����ǣ��Ƚϵ������������Ƿ�ָ��ͬһ������
		 * 2���������ͨ����дequals��������ʽ���ı�Ƚϵ�����
		 * 
		 */
		boolean flag =  one.equals(two);
		System.out.println("one ��  two�����ñȽϣ�"+ flag);
		System.out.println("one ��  two�����ñȽϣ�"+ (one == two));
		System.out.println("====================================");
		String str1 = new String("hello");
		String str2 = new String("hello");
		flag = str1.equals(str2);
		System.out.println("str1 �� str2�����ñȽϣ�" + flag);
		System.out.println("str1 �� str2�����ñȽϣ�" + (str1 == str2));
		System.out.println("====================================");
		/*toString����:
		 * 1�����������ʱ��Ĭ�ϻ�ֱ�ӵ������е�toString
		 * 2���̳�Object�е�toString����ʱ�����������ַ�����ʾ��ʽ��������Ϣ+@+��ַ��Ϣ
		 * 2���������ͨ����дequals��������ʽ���ı�����������Լ�������ʽ
		 * 
		 */
		System.out.println(one.toString());
		System.out.println(one);
		System.out.println("====================================");
		System.out.println(str1);
	}
}