package com.imooc.method;

public class MaxDemo {
	public void max(double a,double b){
		
	}
	// �����ֵ�÷���
	public void max(float a, float b) {
		float max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("������" + a + "��" + b + "�����ֵΪ��" + max);
	}

	public void sumMarry(float sum){
		float sumMarry;
		if(sum < 100){
            sumMarry = sum;
        }else if(sum >=100 && sum<= 199){
            sumMarry = sum * 0.95f;
        }else{
            sumMarry = sum * 0.85f;
        }
        System.out.println("�ۺ���Ʒ�ܼ�Ϊ��" + sumMarry);
    }

	public static void main(String[] args) {
		MaxDemo maxDemo = new MaxDemo();
		int a = 5, b = 3;
		maxDemo.max(a, b);
		float m = 5.6f, n = 8.9f;
		maxDemo.max(m, n);
		maxDemo.max(9.8f, 12.8f);
		maxDemo.max(1.2f, 3.4f);

		// �������
		float sum;
		// ������Ʒ�ܼ۴�ŵ�������
		sum = 150;
		// ���÷���������ۺ���Ʒ�ܼ�
		maxDemo.sumMarry(sum);
	}

}
