package com.imooc.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// ����һ�����͵�����
		int[] intArray;
		// ����һ���ַ������͵�����
		String strArray[];
		// ��������
		intArray = new int[5];
		strArray = new String[10];

		// ���������ͬʱ���д���
		float[] floatArray = new float[4];
		// ��ʼ������
		char[] ch = { 'a', 'b', 'c', 'b' };
		System.out.println("����ĳ���Ϊ��" + ch.length);
		System.out.println("intArray����ĵ�2��Ԫ��Ϊ��" + intArray[1]);
		System.out.println("strArray����ĵ����Ԫ��Ϊ:" + strArray[4]);
		System.out.println("floatArray��������һ��Ԫ��Ϊ��" + floatArray[floatArray.length - 1]);
		// ѭ��Ϊ�������鸳ֵ
		for (int i = 0; i < 5; i++) {
			intArray[i] = i + 1;
		}
		// ѭ��������������е�Ԫ��
		System.out.println("��������intArray��Ԫ��Ϊ��");
		for (int i = 0; i < 5; i++) {
			System.out.print(intArray[i] + " ");
		}
		// ����һ���������飬����ʼ��
		System.out.println("");
		int[] a = { 1, 3, 5, 6, 8, 12 };
		// ѭ���������飬�ҳ��ܱ�3������Ԫ�ز���ӡ���
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 != 0) {
				continue;
			}
			System.out.print(a[i] + " ");
		}

		// ��ζԱ���b,c��ֵ���н���
		int b = 3, c = 5;
		int temp;
		temp = b;
		b=c;
		b=temp;
	}

}
