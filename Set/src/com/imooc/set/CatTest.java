package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
	public static void main(String[] args) {
		// �������è����
		Cat huahua = new Cat("����", 12, "Ӣ����ëè");
		Cat fanfan = new Cat("����", 3, "�л���԰è");
		
		//������è�������HashSet��
		Set set = new HashSet();
		set.add(huahua);
		set.add(fanfan);
		
		//��ʾ����è��Ϣ
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//�����һ���뻨������һ����è
		Cat huahua01 = new Cat("����",12,"Ӣ����ëè");
		set.add(huahua01);
		System.out.println("***************************");
		System.out.println("����ظ����ݺ�ĳ���è��Ϣ��");
		it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
