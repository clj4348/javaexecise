package com.imooc.method;

public class MathDemo2 {
	// ��Բ�����
	public void plus(float r) {
		double S = Math.PI * r * r;
		System.out.println("Բ�����Ϊ��" + S);
	}

	// �󳤷������
	public void plus(int a, int b) {
		int sum = a * b;
		System.out.println("�����ε����Ϊ��" + sum);

	}

	public static void main(String[] args) {
		// �������
		MathDemo2 ad = new MathDemo2();
		// ����һ��double���͵ı�����Ű뾶������ʼ��
		float r = 4.5f;
		ad.plus(r);
		// ��������������ų��Ϳ�����ʼ��
		int a = 8, b = 5;
		// ���÷�������Բ���������ӡ���
		ad.plus(a, b);
		// ���÷������󳤷����������ӡ���

	}
}
