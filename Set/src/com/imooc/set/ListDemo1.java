package com.imooc.set;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// ��ArrayList�洢������Ե����ƣ������
		List list = new ArrayList();
		list.add("java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("swift");

		// ����б�����Ǹ�Ԫ�صĸ���
		
		System.out.println("�б���Ԫ�صĸ���Ϊ��" + list.size());
		// ����������б������
		System.out.println("=================");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		
		//�Ƴ��б��е�C++
		System.out.println();
		//list.remove(2);
		list.remove("C++");
		System.out.println("=================");
		System.out.println("�Ƴ�C++�Ժ���б�Ԫ��Ϊ��");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
	}

}