package com.imooc.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// ����һ���ַ�"���"
		StringBuilder str = new StringBuilder("���");
		// ��"���"������������,���ַ������"���,imooc!"
		// str.append(',');
		// str.append("imooc!");
		// System.out.println("str=" + str);
		System.out.println("str=" + str.append(',').append("imooc!"));

		// ���ַ������"���,iMOOC!"
		// ���ַ�ʽ��
		// 1��ʹ��delete����ɾ��mooc,Ȼ���ٲ���MOOC
		// System.out.println("�滻��" + str.delete(4, 8).insert(4,"MOOC"));

		// 2��ʹ��replace����ֱ���滻
		System.out.println("�滻��"+str.replace(4,8,"MOOC"));
		
		//���ַ���"���,iMOOC"��ȡ��"���"�����
		System.out.println(str.substring(0,2));
	}
}